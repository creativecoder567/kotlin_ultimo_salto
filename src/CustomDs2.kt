import java.util.*
import kotlin.system.exitProcess


class CustomDs2 {

    var arr: ArrayList<Int> = ArrayList()
    var count : Int = 0
        get() = arr.size

    fun insert(x: Int): Int {
        arr.add(x)
        return countNum(x)
    }

    fun delete(x: Int): Int {
        arr.remove(x);
        return countNum(x);
    }

    fun countNum(x: Int): Int {
        return arr.filter { it == x }.size
    }

    fun countaa(): Int {
        return arr.size
    }


}

fun main(args: Array<String>) {

   for ( i in 1 until 1000){
       val message = isPrime(i)
       if (message)
       println(" "+i);
   }

    if (true)
    {
        val ds = CustomDs()
        println(ds.insert(4))//1
        println(ds.insert(4))//1
        println(ds.insert(4))//2

        println(ds.insert(3))//2

        println(ds.delete(3))//2

        println(" "+ds.delete(11)+" c  "+ds.count)//2
    }
   println("------------")//2
    if (true)
    {
        val ds = CustomDs2()
        println(ds.insert(4))//1
        println(ds.insert(4))//1
        println(ds.insert(4))//2

        println(ds.insert(3))//2

        println(ds.delete(3))//2



        println(" "+ds.delete(11)+" c  "+ds.count)//2
    }





    /* val t = readLine()!!.trim().toInt()
     for (i in 0 until t) {
         val op = readLine()!!
         when (op) {
             "i" -> println(ds.insert(readLine()!!.trim().toInt()))
             "d" -> println(ds.delete(readLine()!!.trim().toInt()))
             else -> println(ds.count)
         }
     }*/
//    var arr = arrayOf(1,1,2,3,4)
//    println(arr.distinct())
//    println(arr.distinct().count())
}

fun  isPrime(num:Int): Boolean {
    for (i in 2 until num) {
        if (num  % i ==0 ){
            return false;
        }
    }

    return true;

}