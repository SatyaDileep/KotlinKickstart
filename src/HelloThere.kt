/**
 *
 * @author thots
 * @version HelloThere.kt$ 9/30/19
 */
fun main(args : Array<String>){
    println("Hey there..!")
    println("We can make use of args just like java  : args[0] and so on..")

    // are you observing? we are not using semicolon :P lol

    // val VS var --> remember var from JavaScript?
    // using val is recommended - it is immutable
    // whereas var can be changed lol
    val iamimmutable : String = "do not try to reassign a value to me"

    // greet = "new" // cannot reassign
    println(iamimmutable)

    // var is the keyword of SHAME :P
    var iammutable: String = "you can reassign me"
    println(iammutable)

    iammutable = "reassigned"
    println(iammutable)
}