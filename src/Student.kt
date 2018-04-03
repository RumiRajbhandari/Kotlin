data class Student constructor(var name:String, var level:String) {
    lateinit var subject:String

    //Secondary constructor must delegate to primary constructor
    constructor(name:String, level:String,subject:String): this(name,level)
    {
        this.subject =subject

    }

    val studentProperty = "Name: $name \nLevel: $level ".also(::println)
}