import java.io.FileReader
import java.io.FileWriter

fun main(){
    println("Enter The message:")
    var str:String= readLine().toString()
    writer(str)
    filre()

}

fun writer(st:String){

    val file = FileWriter("TestFile.txt",true)
    file.write(st+"\n")
    file.close()
}

fun filre(){
    var fl=FileReader("TestFile.txt")
    var c:Int?
    do{
        c=fl.read()
        print(c.toChar())

    }while (c!=-1)
}