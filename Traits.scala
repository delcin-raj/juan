abstract class Food
abstract class Mammal

// Do you know what companion object is?

trait Eat {
    // Does not have State
    // All the definitions inside trait are public
    def eats(food: Food): Food
    var x: Int = 5 // In a good programming this feature will not be allowed
}

trait Move {
    def move(point: Point): Point
}

case class Point(x: Int)

// unapply mehtod is in-built into case class
case class Milk(litres: Int) extends Food

case class Beef(kgs: Int) extends Food
// Using case classess you'll get pattern matching for free
// Because unapply method is given by default
// You also don't need new key word because you have apply method by default

class Cat extends Mammal, Eat, Move {
    // Use pattern matching to implement eats
    def eats(food: Food): Food = food match
        case Milk(litres) => Milk(litres - 1)
        case Beef(kgs) => Beef(kgs - 2)
    
    def move(point: Point): Point = ???
}
class Bear extends Mammal, Eat, Move {
    def eats(food: Food): Food = ???
    def move(point: Point): Point = ???
}

// Use your imagination and pattern matching to finish the rest of the methods

object Traits extends App {
    val bear = new Bear()
    val cat = new Cat()
    // val food = new Food(), NOT ALLOWED
    val milk = new Milk(100)
    val beef = new Beef(200)
    println(bear.x)
    // val eat = new Eat(), Trait cannot be instantiated
    bear.x = 100 // chaning var x of trait Eat
    println(s"for bear ${bear.x}")
    println(s"for cat ${cat.x}")
    // The behaviour is correct but the feature is not necessary
    // TODO: play with them by creating your own objects
}
/**
  * Reading tasks:
    Defualt parameter
    Traits
    Named arguments
    Tuples
    
    Read about companion objects below
    https://docs.scala-lang.org/overviews/scala-book/companion-objects.html
  */