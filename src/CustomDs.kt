import java.util.*
import kotlin.system.exitProcess


class CustomDs {

    //4-2     2-2  => 4

    var hash: HashMap<Int, Int?> = HashMap()
    var count : Int=0
    get()=count();
    fun insert(x: Int) :Int{

        hash.putIfAbsent(x,0)

        hash[x]= hash[x]!! + 1;

        return  hash[x]!!
//        hash.forEach
    }

    // A Theta(1) function to remove an element from MyDS
    // data structure
    fun delete(x: Int) : Int {
        hash.putIfAbsent(x,0)
        if (hash[x]!=0)
            hash[x]= hash[x]!! - 1;
        return  hash[x]!!

    }

    fun count() :Int{
     return   hash.values.toList().sumOf { it!! }
    }



}
fun main(args: Array<String>) {
    val ds = CustomDs()
//    ds.insert(10)
//    ds.insert(10)
//    ds.insert(20)
//    ds.insert(20)
//    ds.insert(30)
//    ds.insert(40)
//    System.out.print(ds.arr.forEach {it })
//    System.out.println("Hash"+ds.hash.keys+"values "+ds.hash.values)
//    System.out.println("Hash"+ds.count())
//    ds.delete(20)
//    System.out.println("Hash"+ds.count())
//    ds.insert(50)
////    System.out.print(ds.arr.forEach {it })
//    System.out.println("Hash"+ds.hash.keys+"values "+ds.hash.values)

    val t = readLine()!!.trim().toInt()
    for (i in 0 until t) {
        val op = readLine()!!
        when(op){
            "i"-> println(ds.insert(readLine()!!.trim().toInt()))
            "d"-> println(ds.delete(readLine()!!.trim().toInt()))
            else->println(ds.count)
        }
    }
//    var arr = arrayOf(1,1,2,3,4)
//    println(arr.distinct())
//    println(arr.distinct().count())


}


