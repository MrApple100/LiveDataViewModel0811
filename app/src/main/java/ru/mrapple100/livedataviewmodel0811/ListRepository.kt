package ru.mrapple100.livedataviewmodel0811

class ListRepository {

    private val listGames = arrayListOf<Game>(
        Game("Tetris",100,"Nintendo"),
        Game("PUBG",1000,"Tencent"),
        Game("CS2",1500,"Valve"),
        Game("Mario",200,"Nintendo"),
        Game("Atomic Heart",2000,"MadFish"),
        Game("PlantsVsZombie",400,"EA"),
        Game("Batman",300,"Rocksteady"),
        Game("ClashRoyal",600,"SuperCell"))

    fun getList(): ArrayList<Game>{
        return listGames
    }




}