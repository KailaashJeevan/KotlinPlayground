


fun main(){
    try{
        println("Enter the div no")
        val div:Int= readLine()!!.toInt()
        val dive=100/div
        println(dive)
    }catch (ex:Exception){
        println(ex.message)
    }
    println("CODE SUCCESSFUL")
}