object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a = Array.ofDim[Int](n,n);
        for(a_i <- 0 to n-1) {
           for(a_j <- 0 to n-1){
              a(a_i)(a_j) = sc.nextInt();
           }
        }
        var prim_sum=0
        var sec_sum=0
        for(a_i <- 0 to n-1) {
           for(a_j <- 0 to n-1){
              if (a_i==a_j) {prim_sum += a(a_i)(a_j)}
              if (a_i==n-a_j-1) {sec_sum += a(a_i)(a_j)}
           }
        
        }
        println(scala.math.abs(prim_sum-sec_sum))
        
    }
}