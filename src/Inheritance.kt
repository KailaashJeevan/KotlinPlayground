open class operations(){
    fun add(n1:Int, n2:Int):Int {
        println("ADDITION:")
        return n1+n2
    }
    fun multiply(n1:Int, n2: Int):Int{

        println("MULTIPLICATION:")
        return n1*n2

    }



}
class multiopr():operations() {
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
    val objs=multiopr()
    println(objs.add(3,5))
    println(objs.sub(4,5))
    println(objs.div(6,3))
    println(objs.multiply(43,24))
}