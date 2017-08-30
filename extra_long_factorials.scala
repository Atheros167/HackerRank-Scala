object Solution extends App {
    def Factorial(n:scala.math.BigInt): scala.math.BigInt={
        if (n==1 || n==0) {1} else {n*Factorial(n-1)}
   }
    var n: scala.math.BigInt = new java.util.Scanner(System.in).nextInt().toInt;
    println(Factorial(n))
}

