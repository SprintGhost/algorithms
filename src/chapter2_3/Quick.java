/*************************************
 # @Time    : 2018/5/24
 # @Author  : Mr.Sprint
 # @Project : algorithms
 # @File    : Quick
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

public class Quick {
    public static void sort(Comparable[] a)
    {
        StdRandom.shuffle(a);         //reduce input dependence
        sort(a, 0, a.length - 1);
    }

    private static void sort(Comparable[] a, int lo ,int hi)
    {
        if(hi <= lo)
            return;
        int j = partition(a, lo, hi);
        sort(a, lo, j -1 );
        sort(a, j + 1, hi);
    }

    public static void DrawSort(Comparable[] a)
    {
        StdRandom.shuffle(a);         //reduce input dependence
        DrawSort(a, 0, a.length - 1);
    }

    private static void DrawSort(Comparable[] a, int lo ,int hi)
    {
        if(hi <= lo)
            return;
        int j = DrawPartition(a, lo, hi);
        DrawSort(a, lo, j -1 );
//        Example.draw((String[])a, j, j);
        DrawSort(a, j + 1, hi);
        Example.draw((String[])a, j, j);
    }

    private static int partition(Comparable[] a, int lo, int hi)
    {
        int i  = lo, j = hi + 1;
        Comparable v = a[lo];
        while (true)
        {
            while (Example.less(a[++i],v))
            {
                if (i == hi)
                    break;
            }
            while (Example.less(v, a[--j]))
            {
                if (j == lo)
                    break;
            }
            if (i >= j) break;
            Example.exch(a,i,j);
        }

        Example.exch(a,lo,j);
        return j;
    }

    private static int DrawPartition(Comparable[] a, int lo, int hi)
    {
        int i  = lo, j = hi + 1;
        Example.draw((String[])a, i, i);
        Comparable v = a[lo];
        while (true)
        {
            while (Example.less(a[++i],v))
            {
                if (i == hi)
                    break;
            }
            while (Example.less(v, a[--j]))
            {
                if (j == lo)
                    break;
            }
            if (i >= j) break;
            Example.exch((String[]) a,i,j);
        }

        Example.exch((String[])a,lo,j);
        return j;
    }

    public static void main(String[] args)
    {
        String[] a = StdIn.readAllStrings();
        Example.InitDraw(a);
        Example.draw(a);
        Quick.DrawSort(a);
        Example.draw(a);
        Example.show(a);
    }
}
