fun main(args: Array<String>) {
    var student= Student("rumi", "graduate", "social")
    student.studentProperty
    println("Studying: ${student.subject}")

    //Elvis operator
    var x:Int?=null
    var z= x?: println("Value is null")
    println("The z is "+ z )

    //Calling high level function that takes lambda as argument
    addTwoNumber(5,5,sumLambda)


}

//Lambda expression
val sumLambda: (Int, Int)->Int = {x, y-> x+y}

//high level function
fun addTwoNumber(a:Int,b:Int,myFunction:(Int,Int)->Int){
    println("Addition of two number is "+myFunction(a,b))
}

