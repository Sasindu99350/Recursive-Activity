import scala.io.StdIn.readInt

object primeNums extends App{

def isPrime(n:Int,i:Int=2):Any=n match{

		case x if(n<2)=>false
		case x if(n==2)=>println(2)
		case x if(n%i==0)=>false
		case x if(i*i>n)=>println(n)
		case _=>isPrime(n,i+1)

		

		
	}

	print("Enter here number:")

	val x=readInt()


	def primeNums(x:Int):Int={

		isPrime(x-1)
		primeNums(x-1)

		



	}


	


}