fun main() {
    val hours = readLine()!!.toInt()
    var total: Double = 0.0
    val day = hours /24

    if(hours > 24){
        total = 15*day + (hours%24)*0.5
    }else if(hours in 6..23){
        total = 5 + (hours - 5)*0.5
    }else {
        if((hours > 0) && (hours < 5)) {
            total = hours * 1.0
        } else{
            total =1.0
        }
    }
    println(total)
}