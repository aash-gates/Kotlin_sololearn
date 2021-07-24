fun main(){
    val num = -7
    val result = when{
        num > 0 -> "Negative"
        num < 0 -> "Positive"
        else -> "Zero"
    }
    println(result)
}