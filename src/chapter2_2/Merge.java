/*************************************
 # @Time    : 2018/5/14
 # @Author  : Mr.Sprint
 # @Project : algorithms
 # @File    : Merge
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
package chapter2_2;

import chapter2_1.Example;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class Merge {
    private static Comparable[] aux;

    public static void  Merge(Comparable[] a, int lo, int mid, int hi)
    {
        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++)
        {
            aux[k] = a[k];
        }
        for (int k = lo; k <= hi; k++)
        {
            if (i > mid)
            {
                a[k] = aux[j++];
            }
            else if (j > hi)
            {
                a[k] = aux[i++];
            }
            else if(Example.less(aux[j],aux[i]))
            {
                a[k] = aux[j++];
            }
            else
            {
                a[k] = aux[i++];
            }
        }
    }

    public static void DrawSort(Comparable[] a)
    {
        aux = new Comparable[a.length];
        DrawSort(a, 0, a.length - 1);
    }

    private  static void DrawSort(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo)
            return;
        int mid = lo + (hi -lo)/2;
        DrawSort(a, lo, mid);
        DrawSort(a, mid + 1, hi);
        if (Example.less(a[mid], a[mid + 1]))
            return;
        Example.DrawMerge((String[])a,lo,hi);
        Merge(a, lo, mid, hi);
        Example.DrawMerge((String[])a,lo,hi);

    }

    public static void sort(Comparable[] a)
    {
        aux = new Comparable[a.length];
        sort(a, 0, a.length - 1);
    }

    private  static void sort(Comparable[] a, int lo, int hi)
    {
        if (hi <= lo)
            return;
        int mid = lo + (hi -lo)/2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);
        if (Example.less(a[mid], a[mid + 1]))
            return;
        Example.DrawMerge((String[])a,lo,hi);
        Merge(a, lo, mid, hi);
        Example.DrawMerge((String[])a,lo,hi);

    }

    public static void InitAux(int lenghth)
    {
        aux = new Comparable[lenghth];
    }

    public static void main(String[] args)
    {
        String[] a = StdIn.readAllStrings();
        Example.InitDraw(a);
        Example.draw(a);
        Merge.DrawSort(a);
        Example.draw(a);
        Example.show(a);

    }
}
