fun main(args: Array<String>) {
    var hours = readLine()!!.toInt()
    var total: Double = 0.0
    var day = hours /24

    if(hours > 24){
        total = 15*day + (hours%24)*0.5
}