import kotlin.random.Random

fun main(args: Array<String>) {
    val arr : Array<Array<Int>> = Array(20,{Array(10,{Random.nextInt(2,6)})})
    var sum = 0
    for(i in arr.indices) {
        for (j in arr[i].indices)
        {
            sum += arr[i][j]
        }
    }
    println("${sum/arr.size*10}")
}