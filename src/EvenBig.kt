import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class EvenBig {
}


fun main(args: Array<String>) {

    val t = readLine()!!.trim().toInt()
    for (i in 0 until t) {

        var evenBig : Int by Delegates.vetoable(0, onChange = fun(property: KProperty<*>, oldValue: Int, newValue: Int): Boolean {
            return newValue % 2 == 0 && newValue > oldValue
        })
         evenBig = readLine()!!.trim().toInt()
        println(evenBig)
    }
}
