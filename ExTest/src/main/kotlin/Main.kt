import java.util.regex.Pattern

fun main(args: Array<String>) {
    val input = readlnOrNull()
    val inputNumber = input.toString()

    checkThreeAndTwoChars(inputNumber)

//    if (checkNumberSort(inputNumber)) {
//        if (checkThreeAndTwoChars(inputNumber)) println("format ถูกต้อง")
//        else println("format ผิด")
//    } else println("format ผิด")

    main(args)
}

private fun checkNumberSort(value: String): Boolean {
    val pattern = Pattern.compile("^(?!.*(?:012|123|234|345|456|567|678|789|890|987|876|765|654|543|432|321|210))[0-9]{6}\$")
    val result = pattern.matcher(value).matches()
    println(result)
    return result
}
//237192
private fun checkThreeAndTwoChars(value: String): Boolean {
    val pattern = Pattern.compile("^(?!.*([0-9])\\\\1)(?!.*([0-9])([0-9])\\\\2)(?!.*([0-9])([0-9])\\\\3\\\\3)[0-9]{6}\$")
    val result = pattern.matcher(value).matches()
    println(!result)
    return !result
}

private fun checkNumber(value: String): Boolean {
    val pattern = Pattern.compile("^[1-9]{1}[0-9]{2}\\s{0,1}[0-9]{3}\$")
    return pattern.matcher(value).matches()
}

//^(?!.*([0-9])\1{2})[0-9]{6}$
//^(?!.*([0-9])\1{2})(?!.*([0-9])\2{1})(?=\d{6}$)\d+$
//^(?!.*([0-9])\\1)(?!.*([0-9])([0-9])\\2)(?!.*([0-9])([0-9])\\3\\3)(?!.*(?:012|123|234|345|456|567|678|789|890|987|876|765|654|543|432|321|210))[0-9]{6}$
//^(?!([0-9])([0-9])\2)(?!.*(?:012|123|234|345|456|567|678|789|890|987|876|765|654|543|432|321|210))[0-9]{6}$
//^(?!([0-9])([0-9])\2)(?!([0-9])([0-9])([0-9])\3)(?!.*(?:012|123|234|345|456|567|678|789|890|987|876|765|654|543|432|321|210))[0-9]{6}$