/**
 * Immutable vs Mutable datastructures
 */ 

// T is called the generic parameter
/**
  * The idea is, List is an abstract datastructure which means,
  * the operations on the List are common to List of any types
  * T abstracts over all types
  * This is called generic programming
  */
abstract class MList[T]
class Empty[T] extends MList[T]
class Cons[T](v: T, next: MList[T]) extends MList[T]

object DataStructures extends App {
    def immutableMap() = {
        import scala.collection.immutable.Map
        var m = Map[Int, Int]()
        m = m + (1 -> 2)
        m = m + (3 -> 4)
        println(m)
    }
    def mutableMap() = {
        import scala.collection.mutable.Map
        val m = Map[Int, Int]()
        m(1) = 2
        m(2) = 4
        println(m)
    }
    def mlistSim() = {
        val l = Cons(1, Empty())
        val s = Cons("abc", Cons("two", Empty()))
    }
    immutableMap()
    mutableMap()
}