object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var arr = new Array[Int](n);
        for(arr_i <- 0 to n-1) {
           arr(arr_i) = sc.nextInt();
        }
        
        var pos_counter: Int=0
        var neg_counter: Int=0
        var zero_counter:Int=0
        
        for (i<-(0 to n-1)) {
            if (arr(i).toInt>0) {pos_counter += 1}
            else if (arr(i).toInt==0) {zero_counter += 1}
            else {neg_counter += 1}
        }
        println(pos_counter.toFloat/n.toFloat)
        println(neg_counter.toFloat/n.toFloat)
        println(zero_counter.toFloat/n.toFloat)
    }
}
