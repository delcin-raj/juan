/**
 * Object Oriented programming language which supports functional programming constructs
 * 
 * OOP encourages code reuse
 * In FP we observe patterns and let the compiler generate code
 * */

class Animal(name: String, age: Int) // the fields name and age are private
class Animal2(val name: String, val age: Int) // the fields name and age are public

class Ape(name: String, age: Int) extends Animal(name, age)

class Ape2(name: String, age: Int) extends Animal2(name, age)
// in the above case override is not necessary because the name and age fields of Ape2 are private

class Ape3(override val name: String, override val age: Int) extends Animal2(name, age)
// in the above case override is necessary because the name and age fields of Ape3 are public

object Intro extends App {
    // scalac <filname.scala> to compile
    // scala <filename> to run
    println("Hello world")
}
