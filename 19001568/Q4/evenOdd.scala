import scala.io.StdIn.readInt

object evenOdd extends App{

  def iseven(n:Int):Boolean= n match {
  	case 0=>true
  	case _ =>isodd(n-1)
  }

  def isodd(n:Int):Boolean = !(iseven(n))

  println("Enter here number :");
  val x=readInt();
  val d=iseven(x);
  if(d==true) println("This is even.");
  else println("This is odd.");



}