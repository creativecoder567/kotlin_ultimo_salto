fun main(args: Array<String>) {
    println("total")
//    val numsCount = readLine()!!.trim().toInt()
    val numsCount = 5

    val nums = Array<Int>(numsCount, { 0 })
//    for (i in 0 until numsCount) {
//        println("enter "+i)
//        val numsItem = readLine()!!.trim().toInt()
//        nums[i] = numsItem
//    }
//    println("0 min  max 1")

    val type = readLine()!!.trim().toInt() != 0
    var lambda = {a:Int,b:Int -> a>b}
    if(!type){
        lambda = {a:Int,b:Int -> a<b}
    }
    val result = minmax(nums, lambda)

    println(result)

}

fun minmax(nums: Array<Int>, lambda: (Int, Int) -> Boolean): Int {

    var min =nums[0]
    for (n in nums){
        if (lambda(n,min)){
            min=n;
        }
    }
    return min;
}