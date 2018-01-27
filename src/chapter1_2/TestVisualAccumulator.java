package chapter1_2;
/*
 * Class TestVisualAccumulator in page 95
 *
 */
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class TestVisualAccumulator {
    public static void main(String[] args){
        //int T = Integer.parseInt(args[0]);
        int T = StdIn.readInt();
        VisualAccumulator a = new VisualAccumulator(T, 1.0);
        for (int t = 0; t < T; t++){
            a.addDatavalue(StdRandom.random());
        }
        StdOut.println(a);
    }
}
