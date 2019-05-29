


enum class directions{
    NORTH,SOUTH,EAST,WEST

}

fun main(){
    val dir=directions.WEST
    if(dir==directions.EAST)
    {
        println("HE WENT TO $dir")


    }
    else{
        println("IDK WHERE HE WENT!")
    }
}
