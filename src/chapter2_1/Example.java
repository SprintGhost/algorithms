/*************************************
 # @Time    : 2018/4/12
 # @Author  : Mr.Sprint
 # @Project : algorithms
 # @File    : Example
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
import edu.princeton.cs.algs4.StdOut;

public class Example {
    public static void sort(Comparable[] a)
    {

    }

    public static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    public static void exch(Comparable[] a, int i, int j)
    {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void show(Comparable[] a)
    {
        for (int i = 0; i < a.length; i++)
            StdOut.print(a[i] + " ");
        StdOut.println();
    }

    public static boolean isSorted(Comparable[] a)
    {
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    public static void draw(String[] a)
    {
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        for (int i = 0; i < a.length; i++)
            StdDraw.rectangle( 2 * i + 0.5,0, 0.5, Double.parseDouble(a[i]));
    }

    public static void main(String[] args)
    {
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
