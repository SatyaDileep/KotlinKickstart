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

    // $ - to refer a variable's value just like jquery.
    val name = "Ubuntu kotlin"
    println("Hello $name")
    // Use {} braces when an operation is being performed on the variable
    println("Hey ${name.toLowerCase()}")

    val currentAge = 17

    // expressions are concise
    val canVote = if(currentAge>17) "yep you can" else "ooh no..! you can't"
    println(canVote)

    // enough crawling === lets jump to functions..
    // lets call a function..!
    println(determineVoteEligibility(currentAge))

    println(returnVoteEligibility(currentAge))
}

// This method doesn't have {} rather uses = and asks kotlin
// to do the type inference for us ( return String )
fun determineVoteEligibility(age: Int) =
    if(age>17) "yep you can" else "ooh no..! you can't"

// This method uses {} and explicitly defines return type
fun returnVoteEligibility(age: Int): String {
    return if (age > 17) "yep you can" else "ooh no..! you can't"
}
