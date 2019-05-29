open class operations1(){
    open fun add(n1:Int, n2:Int):Int { 
        println("ADDITION:")
        return n1+n2
    }
    fun multiply(n1:Int, n2: Int):Int{

        println("MULTIPLICATION:")
        return n1*n2

    }



}
class multiopr1():operations1() {


    override fun add(n1: Int, n2: Int): Int {
        println("ADDITION:")
        return n1 + n2*10
    }

        fun sub(n1: Int, n2: Int): Int {


            println("SUBTRACTION:")
            return n1 - n2
        }

        fun div(n1: Int, n2: Int): Int {
            println("Division:")
            return n1 / n2

        }
    }

fun main(){
    val objs=multiopr1()
    println(objs.add(3,5))
    println(objs.sub(4,5))
    println(objs.div(6,3))
    println(objs.multiply(43,24))
}