class idea<T>(psd:T)
{
    init {
        println(psd)
    }
}

fun <Q> display(ID:Q){
    println("ID : $ID")
}

fun main()
{
    var obj1=idea<String>("KJ")
    var obj2=idea<Int>(37)

    display<Int>(43)


}