//import com.sun.xml.internal.ws.addressing.EndpointReferenceUtil.transform

//fun main(args: Array<String>) {
////    println("Hello World!")
////
////    // Try adding program arguments at Run/Debug configuration
////    println("Program arguments: ${args.joinToString()}")
//
//    //mypr()
//
//
//    val r = ABC()
//    r.myfun("Shady")
//}
//
//class ABC : DEF4() {
//
//}
//
//
//open class A{
//// val st:String
//}
//
//class B:A(){
//}
//
//fun mypr() {
//    val p:Int
//    println("Hello")
//}
//


//fun main(){
//
//    listOf("line 1", "line 2").forEach {
//        builder.appendValue { transform(it) }
//
//    }
//}

//@Suppress("DEPRECATION")
//fun main(){
//    method()
//}
//
//@Deprecated("Old stuff", ReplaceWith("test2"))
//fun method() {
//    TODO("Not yet implemented")
//}

//Hi, I found a bug in Kotlin compiler. Why does it print "0" instead of "42"?
//open class Parent {
//    init{println("print from Parent class")}
//    val hash: Int = this.hashCode()
//}
//
//class Child(private val specialHash: Int) : Parent() {
//    init{println("print from Chile class")}
//    override fun hashCode() = specialHash
//}
//
//fun main(args: Array<String>) {
////    val c = Parent()
////    println("c.hash ${c.hash}")
////
////    println()
//
//    val a = Child(42)
//    val b = a.hashCode()
//    println(b)
//
////    val d = b.hashCode()
////    println(d)
//
//}


/// FIX
//open class Parent(private val specialHash: Int) {
//    init{
//        println("init of Parent class")
//    }
//    override fun hashCode() = specialHash
//
//}
//
//class Child(private val specialHash: Int) : Parent (specialHash) {
//    init{
//        println("init of Chile class")
//    }
//    val hash: Int = this.hashCode()
//}
//
//fun main() {
//    val a = Child(42)
//    val b = a.hashCode()
//    println(b)
//
//    val c = a.hash
//    println(c)
//
////    val d = 45.hash
////    println(d)
//}


//--
//
//Introduce non-local `it`. For example:
//```
//listOf("line 1", "line 2").forEach {
//    builder.appendValue { transform(it) }
//}
//
//```
//Here `transform(it)` does not compile, I can't pass a String to it.


fun main(){

    val mylist = listOf("line 1", "line 2")

//    mylist.forEach {
//        builder.appendValue { transform(it) }
//    }


    val nameList= listOf<String>("John", "mark", "mila", "brandy", "Quater") // List<String>
    nameList.forEach {
        println("Name:$it")
    }
}

