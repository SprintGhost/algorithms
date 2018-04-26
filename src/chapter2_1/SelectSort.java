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

import java.util.Arrays;

public class SelectSort {
    public static void Sort(Comparable[] a, String[] b)
    {
        for (int i = 0; i < a.length; i++)
        {
            int min = i;
            for(int j = i + 1; j < a.length; j++)
            {
                if(Example.less(a[j], a[min])) min = j;
            }
            Example.exch(a, i, min);
            Example.exch(b,i,min);
        }
    }

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
        String[] a = StdIn.readAllStrings();
        String[] b = Arrays.copyOf(a,a.length);
        StdDraw.setXscale(0, a.length/10.0 + 0.5);
        StdDraw.setYscale(0, 5);
        StdDraw.setPenRadius(.05);
        Example.draw(a);
        SelectSort.Sort(a,b);
        assert Example.isSorted(a);
        Example.show(a);
        Example.draw(a);
    }
}
