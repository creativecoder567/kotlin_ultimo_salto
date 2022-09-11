import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*




fun sum(nums:Array<Int>,add: (acc:Int,ele:Int) -> Int):Int {
    var res=0
    for(i in nums){
        res = add(res,i)
    }
    return res
}


fun getLambda(): (acc:Int,ele:Int) -> Int {
    var lambda = {a:Int,b:Int ->
        if (b<0)
            a
        else
            a+b
    }
            return lambda
}

fun main(args: Array<String>) {
    /*val numsCount = readLine()!!.trim().toInt()

    val nums = Array<Int>(numsCount, { 0 })
    for (i in 0 until numsCount) {
        val numsItem = readLine()!!.trim().toInt()
        nums[i] = numsItem
    }*/

    val lambda = getLambda()
    val result = sum( arrayOf(-1,-2,3,4),lambda)
    println(result)
}