sealed abstract class Expr

case class Z(v: Int) extends Expr
// All the below classes uses recursive defintion
case class Add(e1: Expr, e2: Expr) extends Expr
case class Sub(e1: Expr, e2: Expr) extends Expr
case class Div(e1: Expr, e2: Expr) extends Expr
case class Mul(e1: Expr, e2: Expr) extends Expr

// Advantage of sealed keyword is that you can write exhaustive pattern matching

object Expr {
    def evaluate(e: Expr) : Int = {
        e match {
            case Z(v) => v
            case Add(e1, e2) => evaluate(e1) + evaluate(e2)
            case Sub(e1, e2) => evaluate(e1) - evaluate(e2)
            case Mul(e1, e2) => evaluate(e1) * evaluate(e2)
            case Div(e1, e2) => evaluate(e1) / evaluate(e2)
        }
    }
}

object Sim extends App {
    import Expr.*
    val z = Z(4)
    val add = Add(Z(4), Z(10))
    println(evaluate(z))
    println(evaluate(add))
    val sub = Sub(Z(4), Z(2))
    println(evaluate(sub)) // What will this print?
}
// Scala gives you the tools to prevent you from doing bad coding