package chapter1_1;
/*
 * Write a program, if double types x and y, if 0 < x < 1
 * and 0 < y < 1, then print true, else print false
 *
 */
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex05 {
    public static void main(String[] args){
        double x = StdIn.readDouble();
        double y = StdIn.readDouble();
        StdOut.println(x > 0 && x < 1 && y > 0 && y < 1);
        System.exit(0);

    }
}
