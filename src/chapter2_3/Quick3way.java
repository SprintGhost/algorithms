/*************************************
 # @Time    : 2018/5/24
 # @Author  : Mr.Sprint
 # @Project : algorithms
 # @File    : Quick3way
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
package chapter2_3;

import chapter2_1.Example;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

public class Quick3way {

    public static void sort(Comparable[] a)
    {
        StdRandom.shuffle(a);         //reduce input dependence
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo, int hi)
    {
        if(hi <= lo) return;
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v = a[lo];
        while (i <= gt)
        {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) Example.exch(a, lt++, i++);
            else if (cmp > 0) Example.exch(a, i, gt--);
            else i++;
        }

        sort(a, lo, lt - 1);
        sort(a, gt + 1, hi);
    }

    public static void DrawSort(Comparable[] a)
    {
        StdRandom.shuffle(a);         //reduce input dependence
        DrawSort(a, 0, a.length - 1);
    }

    private static void DrawSort(Comparable[] a, int lo, int hi)
    {
        if(hi <= lo) return;
        int lt = lo, i = lo + 1, gt = hi;
        Comparable v = a[lo];
        Example.DrawMerge((String[])a, lt, i);
        while (i <= gt)
        {
            int cmp = a[i].compareTo(v);
            if (cmp < 0) Example.exch((String[])a, lt++, i++);
            else if (cmp > 0) Example.exch((String[])a, i, gt--);
            else i++;
        }

        DrawSort(a, lo, lt - 1);
        DrawSort(a, gt + 1, hi);
        Example.DrawMerge((String[])a, lt, i - 1);
    }

    public static void main(String[] args)
    {
        //R B W W R W B R R W B R
        String[] a = StdIn.readAllStrings();
        Example.InitDraw(a);
        Example.draw(a);
        Quick3way.DrawSort(a);
//        sort(a);
        Example.draw(a);
        Example.show(a);
    }
}
