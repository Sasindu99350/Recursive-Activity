import scala.io.StdIn.readInt

object sumEven extends App{

  
 
  def sumEven(y:Int):Int= {

    if(y==0) return 0
    if(y%2==0) return (y+sumEven(y-2))
    else sumEven(y-1)
  	


   
  	
  }


  println("Enter here number :");
  val x=readInt();
  println("sum of evens:"+sumEven(x))




}