fun main() {

    val result = insert(1.11, 1.22)
    println(result)
}

fun <T : Any> insert(a: T, b: T): Any {
    val sum: Any = (
//                if (a as Any? is String && b is Number) {
//                    "$a $b"
//                } else
            if (a is Int && b is Int) {
                a + b
            }else if (a is Double && b is Int) {
               val number3digits= a + b
                Math.round(number3digits * 100.0) / 100.0
            } else if (a is Double && b is Double) {
                val number3digits=(a + b)
                Math.round(number3digits * 100.0) / 100.0
            } else
                "$a $b"
            ) as Any

    return sum;
}
