fun ArrayList<String>.swap(id1:Int,id2:Int){
    var temp = this.get(id1)
    this.set(id1, this.get(id2))
    this.set(id2, temp)

}
fun main()
{
    var arr= ArrayList<String>()
    arr.add("KJ")
    arr.add("TS")
    arr.add("IM")

    println(arr)
    println("SWAPING")
    arr.swap(0,1)
    println(arr)
}