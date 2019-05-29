interface db{
    fun sum(n1:Int,n2:Int){println("SUM = ${n1+n2}")}

}

class manager():db{

}

fun main(){
    var oj=manager()
    println(oj)
}



