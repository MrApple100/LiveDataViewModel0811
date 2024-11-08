package ru.mrapple100.livedataviewmodel0811

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CustomViewModel : ViewModel() {

    val repo = ListRepository()

    val mutableLDList = MutableLiveData<ArrayList<Game>>()

    val mutableLDKeyword = MutableLiveData<String>()
    val mutableLDListText = MutableLiveData<String>().apply {
        value = repo.getList().toString()
    }


    fun search(){
        val keyword = mutableLDKeyword.value
        mutableLDList.value = keyword?.let { repo.getList().filterByName(it) }
        mutableLDListText.value = mutableLDList.value.toString()
    }

    fun ArrayList<Game>.filterByName(keyword:String):ArrayList<Game>{
        //this // содержиться в списке или начинается с
        return this.filter{it -> it.name.startsWith(keyword)} as ArrayList
    }

    fun ArrayList<Game>.filterByPrice(keyword: String):ArrayList<Game>{
        //">300"  "<500"  keyword.length>1
        return this.filter{it ->
            if(keyword.length>1) {
                val char = keyword[0]
                if (char == '>') {
                    return@filter (it.price > (keyword.split(">")[1].toInt()))
                } else if (char == '<') {
                    return@filter it.price < (keyword.split("<")[1].toInt())
                }
            }
            return@filter false
        } as ArrayList<Game>
    }
    fun ArrayList<Game>.sortByCompany(keyword: String):ArrayList<Game>{
        // > <
        if(keyword.equals(">")) {
            return this.sortedBy { it -> it.company }.toList() as ArrayList<Game>
        }else{
            return this.sortedByDescending { it -> it.company } as ArrayList<Game>
        }
    }
}