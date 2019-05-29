class Singleton{
    var name: String? =null
    private constructor(){
        println("STRING DONE!")
    }

    companion object{
        val instance:Singleton by lazy { Singleton() }
    }
}

fun main(){

    var s1=Singleton.instance
    s1.name="KJ"
    println(s1.name)

    var s2=Singleton.instance
    println(s2.name)
}