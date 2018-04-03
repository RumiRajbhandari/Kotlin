package ConstructorDemo

fun main(args: Array<String>) {
    var student= Student("rumi", "graduate", "social")
    student.studentProperty
    println("Studying: ${student.subject}")

}