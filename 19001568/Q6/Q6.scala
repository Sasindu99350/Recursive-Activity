import scala.io.StdIn.readInt

object fibonacci extends App{


	def fibonacci(n:Int):Int=n match{

		case x if(n<2)=>n
		case _=>fibonacci(n-1)+fibonacci(n-2)
	}

	print("Enter here number: ")

	val x=readInt()
	println(fibonacci(x))
}