object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var arr = new Array[Long](5);
        for(arr_i <- 0 to 5-1) {
           arr(arr_i) = sc.nextInt();
        }
        import scala.collection.mutable.ArrayBuffer
        
        val arr_buff2=ArrayBuffer[Long]()
        var i=0
        
        while (i < arr.length){
            val arr_buff1=ArrayBuffer[Long]()
            arr_buff1 ++= arr
            arr_buff1.remove(i)
            arr_buff2 += arr_buff1.sum
            i+=1
        }
        val min_val:Long = arr_buff2.min
        val max_val:Long = arr_buff2.max
        println(s"$min_val $max_val")
    }
}

