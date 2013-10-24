package week4

trait List[T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
}
class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

class Nil[T] extends List[T] {
  def isEmpty = true
  def head = throw new NoSuchElementException("Nil.head")
  def tail = throw new NoSuchElementException("Nil.tail")
}

object List{
  // List(1,2)
  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])
  def apply[T](x: T, y: T): List[T] = new Cons(x,new Cons(y,new Nil))
  def apply[T]() = new Nil
  def apply[T](x:T):List[T] = singleton[T](x)
}