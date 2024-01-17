/**
 * Object Oriented programming language which supports functional programming constructs
 * 
 * OOP encourages code reuse
 * In FP we observe patterns and let the compiler generate code
 * */

class Animal(name: String, age: Int){
    override def toString(): String = s"$name is the name of the animal, and its age is $age"
} 
object Animal{
    def apply(name: String, age: Int) : Animal = new Animal(name, age)
}
// the fields name and age are private
class Animal2(val name: String, val age: Int) // the fields name and age are public

class Ape(name: String, age: Int) extends Animal(name, age)

class Ape2(name: String, age: Int) extends Animal2(name, age)
// in the above case override is not necessary because the name and age fields of Ape2 are private

class Ape3(override val name: String, override val age: Int) extends Animal2(name, age)
// in the above case override is necessary because the name and age fields of Ape3 are public

// NOT ALLOWED: class MixedAnimal(name: String, age: Int) extends Animal(name, age), Animal2(name, age)

object inheritance extends App {
    // scalac <filname.scala> to compile
    // scala <filename> to run
    // println("Hello world")
    val a = new Animal("mono",1)
    println(a)
    // by default a println prints an object using toString method
    val b = new Animal2("jirafa", 2)
    val c = new Ape("chimpance", 5)
    val d = new Ape2("gorila", 4)
    val e = new Ape3("orangutan", 10)
    // println(e.name)
    println(b)
    println(c)
    println(d)
    println(e)
    val a1 = Animal("cisne",2)
    println(a1)
    val a2 =Animal.apply("perro",1)
    println(a2)
}

/**
  * OOP gives inheritance which allows code reuse.
  * If B extends A, then B is a subtype of A also B has all the fields and methods of A.
  * But a class can extend only one class.
  * 
  * What if we want to have multiple functionalities?
  */