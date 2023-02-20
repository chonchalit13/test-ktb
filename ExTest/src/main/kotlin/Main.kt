import java.util.regex.Pattern

fun main(args: Array<String>) {
    val input = readlnOrNull()
    val inputNumber = input.toString()

    if (checkNumberSort(inputNumber)) {
        if (checkThreeAndTwoChars(inputNumber)) println("format ถูกต้อง")
        else println("format ผิด")
    } else println("format ผิด")
}

private fun checkNumberSort(value: String): Boolean {
    val pattern = Pattern.compile("^0*1*2*3*4*5*6*7*8*9*\$")
    return pattern.matcher(value).matches()
}

private fun checkThreeAndTwoChars(value: String): Boolean {
    val pattern = Pattern.compile("([0-9])*\\1+")
    return pattern.matcher(value).matches()
}