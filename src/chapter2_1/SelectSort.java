/*************************************
 # @Time    : 2018/4/13
 # @Author  : Mr.Sprint
 # @Project : algorithms
 # @File    : SelectSort
 # @Software: IntelliJ IDEA
 # code is far away from bugs with the god animal protecting
 I love animals. They taste delicious.
          ┏┓      ┏┓
         ┏┛┻━━━━━━┛┻┓
         ┃    ☃     ┃
         ┃ ┳┛   ┗┳  ┃
         ┃    ┻     ┃
         ┗━┓      ┏━┛
           ┃      ┗━━┓
           ┃ 神兽保佑 ┣┓
           ┃永无BUG！┏┛
           ┗┓┓┏━┳┓┏┛
            ┃┫┫  ┃┫┫
            ┗┻┛  ┗┻┛
 **************************************/
package chapter2_1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

public class SelectSort {
    public static void Sort(Comparable[] a)
    {
        for (int i = 0; i < a.length; i++)
        {
            int min = i;
            for(int j = i + 1; j < a.length; j++)
            {
                if(Example.less(a[j], a[min])) min = j;
                Example.exch(a, i, min);
            }
        }
    }

    public static void main(String[] args)
    {
        StdDraw.setXscale(0, 10);
        StdDraw.setYscale(0, 5);
        StdDraw.setPenRadius(.005);
        String[] a = StdIn.readAllStrings();
        SelectSort.Sort(a);
        assert Example.isSorted(a);
        Example.show(a);
        Example.draw(a);
    }
}
