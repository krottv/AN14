package elenaveshtard

fun main(args: Array<String>) {
    val str1 = " 123"
    val sq1 = Square(2, "bgkgk")
    println(message = sq1.extensionString(str1))
    convert { it -> it.toString() }
}

fun Square.extensionString(string2: String): Int {
    val string3: String = name + string2
    val lengthString: Int = string3.length * string3.length
    return lengthString

}

fun convert(lambda: (Int) -> String) {
    val fiveToLambda = 5
    println(lambda(fiveToLambda) + "VW")
}
