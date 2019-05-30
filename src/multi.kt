fun main(){
    val t1= thr("THREAD 1")
    t1.start()
    val t2= thr("Thread 2")
    t2.start()
}






class thr():Thread(){

    var s:String=""
    constructor(s:String):this(){
        this.s=s
        println(this.s+" has started!")
    }

    override fun run(){
        var count:Int=0

        while(count<=10)
        {
            println(s+":"+count)
            ++count

            try {
                sleep(1000)
            }catch (e:Exception)
            {
                println(e.message)
            }
        }
    }
}