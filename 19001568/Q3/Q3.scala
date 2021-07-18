object sumToN extends App{


  def sumToN(n:Int):Int={

  	if(n==1) 1
  	else n+sumToN(n-1)

  } 

  println("1 to 10 sum is "+ sumToN(10));

}