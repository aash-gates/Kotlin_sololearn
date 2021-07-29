fun main() {
    val x = 8

    val y = when {

        x > 10 -> x-1

        x > 5 -> x+1

        else -> x

    }

    print(y+x)
}