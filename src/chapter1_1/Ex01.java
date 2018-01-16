package chapter1_1;
/*
*Give the value of the following expression
* a. (0 + 15)/2
* b. 2.0e-6 * 100000000.1
* c. true && false || true && true
*
*/
import edu.princeton.cs.algs4.StdOut;

public class Ex01 {
    public static void main(String[] args){
        StdOut.println((0+15)/2);
        StdOut.println(2.0e-6 * 100000000.1);
        StdOut.println(true && false || true && true);
    }
}
