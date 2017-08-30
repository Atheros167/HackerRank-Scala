object Solution {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var a0 = sc.nextInt();
        var a1 = sc.nextInt();
        var a2 = sc.nextInt();
        var b0 = sc.nextInt();
        var b1 = sc.nextInt();
        var b2 = sc.nextInt();
        
        val Aliceinput=Array(a0,a1,a2)
        val Bobinput=Array(b0,b1,b2)
        
        var aliceoutput=0
        var boboutput=0

        def check_input(alice:Array[Int],bob:Array[Int]) {
            for (i <- 0 to alice.length-1) {
                if (alice(i)<bob(i)) {
                    boboutput += 1
                }
                else if (alice(i)>bob(i)) {
                    aliceoutput+=1
                }
            }
            println(s"$aliceoutput $boboutput")
        }
        check_input(Aliceinput,Bobinput)
    }
}
