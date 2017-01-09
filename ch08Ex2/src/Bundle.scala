import scala.collection.mutable.ArrayBuffer

//is an item that contains other items
class Bundle extends Item {
  //even class level access is not allowed
  private[this] val items = ArrayBuffer[Item]()

  def addAnItem(i: Item): Unit = items += i

  override def price: Double = {
    var sum: Double = 0
    items.foreach(sum += _.price)
    sum
  }

  override def description: String = {
    val description = items.map(_ description).mkString(
      "Bundle # " + System.identityHashCode(this) + " {", ";", "}")
    description
  }
}