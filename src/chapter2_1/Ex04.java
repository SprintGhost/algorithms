/*************************************
 # @Time    : 2018/4/26
 # @Author  : Mr.Sprint
 # @Project : algorithms
 # @File    : Ex04
 # @Software: IntelliJ IDEA
 # code is far away from bugs with the god animal protecting.
 # I love animals. They taste delicious.
              ┏┓      ┏┓
             ┏┛┻━━━━━━┛┻┓
             ┃    ☃     ┃
             ┃ ┳┛   ┗┳  ┃
             ┃    ┻     ┃
             ┗━┓      ┏━┛
               ┃      ┗━━┓
               ┃ 神兽保佑 ┣┓
               ┃ 永无BUG！┏┛
               ┗┓┓┏━┳┓┏┛
                ┃┫┫  ┃┫┫
                ┗┻┛  ┗┻┛
 **************************************/
package chapter2_1;

/*
 *
 * According to the trajectory format shown in algorithm 2.1,
 * the Insertion sort is how to sort the array E A S Y Q U E S T I O N
 *
 * Ex05 & Ex06 didn't need code.
 * for Ex06: most of cases, insertion faster than selection *
 *
 * */

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdOut;

public class Ex04 {

    public static void main(String[] args)
    {
        String[] a = {"E", "A", "S", "Y", "Q", "U", "E", "S", "T", "I", "O", "N"};
        StdDraw.setXscale(0, a.length/10.0 + 0.5);
        StdDraw.setYscale(0, 5);
        StdDraw.setPenRadius(.05);
        Example.draw(a);
        StdOut.println("Begin draw the sort process");
        Insertion.DrawSort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }

}
