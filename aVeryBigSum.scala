object Solution {

    def aVeryBigSum(n: Int, ar: Array[Long]): Any =  {
        var accum: Long =0
        var x:Int =0
        while (x<(n)) {
            accum += ar(x).toLong
            x+=1
        }
        return accum
    }

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var ar = new Array[Long](n);
        for(ar_i <- 0 to n-1) {
           ar(ar_i) = sc.nextLong();
        }
        val result = aVeryBigSum(n, ar);
        println(result)
    }
}
