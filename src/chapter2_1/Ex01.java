/*************************************
 # @Time    : 2018/4/26
 # @Author  : Mr.Sprint
 # @Project : algorithms
 # @File    : Ex01
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
* the selection sort is how to sort the array E A S Y Q U E S T I O N
*
* Ex02 & EX03 didn't need code
*
* */

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class Ex01 {

    public static void main(String[] args)
    {
        String[] a = {"E", "A", "S", "Y", "Q", "U", "E", "S", "T", "I", "O", "N"};
        String[] b = Arrays.copyOf(a,a.length);
        StdDraw.setXscale(0, a.length/10.0 + 0.5);
        StdDraw.setYscale(0, 5);
        StdDraw.setPenRadius(.05);
        Example.draw(a);
        SelectSort.Sort(a,b);
        assert Example.isSorted(a);
        Example.show(a);
    }
}
