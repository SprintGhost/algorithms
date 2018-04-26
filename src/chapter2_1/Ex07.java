/*************************************
 # @Time    : 2018/4/26
 # @Author  : Mr.Sprint
 # @Project : algorithms
 # @File    : Ex07
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
* For the reverse array, select sort and insert sort who are faster?
*
* */

import edu.princeton.cs.algs4.StdOut;

public class Ex07 {

    public static void main(String[] args) {
        String[] a = {"L", "K", "J", "I", "H", "G", "F", "E", "D", "C", "B", "A"};
        double t1 = SortCompare.time(Example.SortTypes.Selection, a);
        double t2 = SortCompare.time(Example.SortTypes.Insertion, a);
        StdOut.printf("Fo %s reverse array time is  %.7f ,", "Insertion", t2);
        StdOut.printf(" %.1f times faster than %s\n.", t2 / t1, "Selection");
    }
}
