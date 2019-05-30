import java.io.FileWriter

fun main(){
    writer("KJ")

}

fun writer(st:String){

    val file = FileWriter("TestFile.txt")
    file.write(st)
    file.close()
}