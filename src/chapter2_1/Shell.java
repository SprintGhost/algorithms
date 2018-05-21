/*************************************
 # @Time    : 2018/4/14
 # @Author  : Mr.Sprint
 # @Project : algorithms
 # @File    : Shell
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


import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class Shell {
    public static void Sort(Comparable[] a)
    {
        int N = a.length;
        int h = 1;
        while(h < N/3)
            h = 3 * h + 1;
        while(h >= 1)
        {
            for (int i = h; i < N; i++)
            {
                for(int j = i; j >= h && Example.less(a[j],a[j - h]); j -= h)
                {
                    Example.exch(a, j, j-h);
                }
            }
            h = h / 3;
        }
    }

    public static void DrawSort(Comparable[] a)
    {
        int N = a.length;
        int h = 1;
        while(h < N/3)
            h = 3 * h + 1;
        while(h >= 1)
        {
            for (int i = h; i < N; i++)
            {
                for(int j = i; j >= h && Example.less(a[j],a[j - h]); j -= h)
                {
                    Example.exch((String[])a, j, j-h);
                }
            }
            h = h / 3;
        }
    }

        public static void main(String[] args)
    {
        String[] a = StdIn.readAllStrings();
        String[] b = Arrays.copyOf(a, a.length);

        // Sort the  a
        Shell.Sort(a);
        assert Example.isSorted(a);
        Example.show(a);

        StdOut.println("Begin draw the sort process");

        //Init the canvas && Draw the sort process
        Example.InitDraw(b);
        Shell.DrawSort(b);

        assert Example.isSorted(b);
        Example.show(b);
        Example.draw(b);
    }
}
