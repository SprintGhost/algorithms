package chapter1_1;
/*
 * Write a program, get three int parameters from command line
 * if they are equal then print
 * else print not equal
 *
 */
import edu.princeton.cs.algs4.StdOut;

public class Ex03 {
    public static void main(String[] args){
        int[] par = new int[3];
        if (args.length == 3) {
            for (int i = 0; i <args.length; i++) {
                par[i]  = Integer.parseInt(args[i]);
            }
            if (par[0] == par[1]) {
                if(par[0] == par[2]){
                    StdOut.println("equal");
                    System.exit(0);
                }
            }
            StdOut.println("not equal");
            System.exit(1);
        }
        StdOut.println("Illegal input");
        System.exit(1);
    }
}
