class Operator {
}



fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}


fun  String.deleteNFirstLastChar(n:Int):String = this.substring(n,this.length-1)

operator fun String.div(b:String):String{
    return this.toCharArray().toList().distinct().filter { b.contains(it) }.joinToString(separator = "");
}
fun main(args: Array<String>) {



    val a:String = "aabcc"

    val b:String = "abdec"

/*      var s ="Hello world"

    val result = s.deleteNFirstLastChar(2)
    print(result)*/
//    unique("aeae","aeae");
val result =a/b
    print(result)

}



fun unique(a: String, b: String) :String {

   return a.toCharArray().toList().distinct().filter  (b::contains).joinToString(separator = "");



    /*a.chars()
            .distinct()
            .map { ch -> ch as Char }
            .filter(b::contains)
            .forEach(System.out::println)*/

/*    val unique = HashSet<Char>()
    val comman = HashSet<Char>()
    val sb = StringBuilder()
    for (c in a.toCharArray()) {
        unique.add(c)
    }
    for (c in b.toCharArray()) {
        if (!unique.add(c)) {
            comman.add(c)
            sb.append(c)
        }
    }
    unique.removeAll(comman)
//    unique.remove(' ')
//    comman.remove(' ')
//    println(unique)
    println(comman.toString())
    println(sb.toString())*/
    //return "Hello"
}