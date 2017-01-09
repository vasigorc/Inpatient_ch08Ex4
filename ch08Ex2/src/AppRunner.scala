import scala.util._

object AppRunner extends App{
  val random = new Random
  val buffer = new Bundle
  
  for(i <- 1 until 10){
    buffer.addAnItem(new SimpleItem(random.nextDouble*10, "item # " + i.toString))
  }
  
  println(f"The price of ${buffer.description}%s is $$${buffer.price}%2.2f")
}