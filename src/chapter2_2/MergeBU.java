/*************************************
 # @Time    : 2018/5/21
 # @Author  : Mr.Sprint
 # @Project : algorithms
 # @File    : MergeBU
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

public class MergeBU {

    public static void DrawSort(Comparable[] a)
    {
        int N = a.length;
        Merge.InitAux(N);
        for (int sz = 1; sz < N; sz = sz + sz)
            for(int lo = 0; lo < N - sz; lo += sz + sz)
            {
                Example.DrawMerge((String[])a, lo , Math.min(lo + sz + sz - 1, N - 1));
                Merge.Merge(a, lo, lo + sz -1, Math.min(lo + sz + sz - 1, N - 1));
                Example.DrawMerge((String[])a, lo, Math.min(lo + sz + sz - 1, N - 1));
            }

    }

    public static void sort(Comparable[] a)
    {
        int N = a.length;
        Merge.InitAux(N);
        for (int sz = 1; sz < N; sz = sz + sz)
            for(int lo = 0; lo < N - sz; lo += sz + sz)
            {
                Merge.Merge(a, lo, lo + sz -1, Math.min(lo + sz + sz - 1, N - 1));
            }

    }

    public static void main(String[] args)
    {
        String[] a = StdIn.readAllStrings();
        //M E R G E S O R T E X A M P L E
        Example.InitDraw(a);
        Example.draw(a);
        DrawSort(a);
        Example.draw(a);
        Example.show(a);
    }
}
