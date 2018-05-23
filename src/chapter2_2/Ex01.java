/*************************************
 # @Time    : 2018/5/23
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
package chapter2_2;

/*
 *
 *  A E Q S U Y E I N O S T
 *
 * Ex02 & Ex02 can ref from Merge.java and MergeBU.java
 *
 *
 * */

import chapter2_1.Example;
import chapter2_1.Insertion;
import edu.princeton.cs.algs4.StdIn;

import java.util.Arrays;

public class Ex01 {
    private static String[] aux;

    private static class temp
    {
        int i = 0;
        int j = 0;
    }

    public static temp tp = new temp();

    public static void  DrawMerge(Comparable[] a, int lo, int mid, int hi)
    {
        tp.i = lo;
        tp.j = mid;

        for (int k = lo; k <= hi; k++)
        {
            aux[k] = (String)a[k];
        }
        for (int k = lo; k <= hi; k++)
        {
            Merge(a, lo, mid, hi, k);
            Example.draw(aux, tp.i, tp.j - 1);
            Example.draw((String[])a, k);
        }
        Example.draw((String[])a, lo, hi);
        Example.draw((String[])a, hi);
    }

    public static void Merge(Comparable[] a, int lo, int mid, int hi, int k)
    {
        if (tp.i > mid)
        {
            a[k] = aux[tp.j++];
        }
        else if (tp.j > hi)
        {
            a[k] = aux[tp.i++];
        }
        else if(Example.less(aux[tp.j],aux[tp.i]))
        {
            a[k] = aux[tp.j++];
        }
        else
        {
            a[k] = aux[tp.i++];
        }

    }

    public static void main(String[] args)
    {
        String[] a = StdIn.readAllStrings();
        aux = new String[a.length];
        String[] b = Arrays.copyOfRange(a, 0, a.length/2);
        String[] c = Arrays.copyOfRange(a, a.length/2 , a.length );
        Example.InitDraw(a);
        Insertion.Sort(b);
        Insertion.Sort(c);
        System.arraycopy(b, 0, a, 0, b.length);
        System.arraycopy(c, 0, a, b.length, c.length);
        Example.draw(a);
        DrawMerge(a,0,a.length/2 , a.length - 1);
//        Example.draw(a);
        Example.show(a);

    }
}
