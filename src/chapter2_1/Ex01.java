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

public class Ex01 {

    public static void main(String[] args)
    {
        String[] a = {"E", "A", "S", "Y", "Q", "U", "E", "S", "T", "I", "O", "N"};
        Example.InitDraw(a);
        Example.draw(a);
        SelectSort.DrawSort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }
}
