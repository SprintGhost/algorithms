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

    public enum SortTypes{
        Selection,
        Insertion,
        Shell,
        MaxTypes,
    }
    public static void sort(Comparable[] a)
    {

    }

    public static boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    /*
    *
    * The reason that the following exch function is overloaded is
    * because I don't know how to cast comparable and string,
    * and if anyone knows please let me know, thank you.
    *
    * */
    public static void exch(Comparable[] a, int i, int j)
    {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void exch(String[] a, int i, int j)
    {
        draw(a,i,j);
        String t = a[i];
        a[i] = a[j];
        a[j] = t;
        draw(a,i,j);
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
        {
            StdDraw.text(i/10.0 + 0.25, 1.0, a[i]);
        }
    }

    public static void draw(String[] a, int border)
    {
        StdDraw.clear();
        draw(a);
        for (int i = 0; i < a.length; i++)
        {
            if (i > border)
            {
                StdDraw.setPenColor(StdDraw.DARK_GRAY);
            }
            else
            {
                StdDraw.setPenColor(StdDraw.RED);
            }
            StdDraw.text(i/10.0 + 0.25, 3.0, a[i]);
        }
        try{
            Thread.currentThread().sleep(500);// 0.5s, I think 0.5s is better than 1s.
        }
        catch (InterruptedException e){}
    }

    public static void DrawMerge(String[] a, int lo, int hi)
    {
        StdDraw.clear();
        draw(a);
        for (int i = 0; i < a.length; i++)
        {
            if ((i >= lo ) && (i <= hi))
            {
                StdDraw.setPenColor(StdDraw.RED);
            }
            else
            {
                StdDraw.setPenColor(StdDraw.DARK_GRAY);
            }
            StdDraw.text(i/10.0 + 0.25, 3.0, a[i]);
        }
        try{
            Thread.currentThread().sleep(500);// 0.5s, I think 0.5s is better than 1s.
        }
        catch (InterruptedException e){}
    }

    public static void draw(String[] a, int i, int j)
    {
        StdDraw.setPenColor(StdDraw.DARK_GRAY);
        StdDraw.clear();
        draw(a);
        for (int k = 0; k < a.length; k++)
        {
            if((k != i) || (k != j))
            {
                StdDraw.text(k / 10.0 + 0.25, 3.0, a[k]);
            }
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.text(i/10.0 + 0.25, 3, a[i]);
            StdDraw.text(j/10.0 + 0.25, 3, a[j]);
            StdDraw.setPenColor(StdDraw.DARK_GRAY);
        }

        try{
            Thread.currentThread().sleep(500);// 0.5s, I think 0.5s is better than 1s.
        }
        catch (InterruptedException e){}
    }

    public static void InitDraw(String[] a)
    {
        StdDraw.setXscale(0, a.length/10.0 + 0.5);
        StdDraw.setYscale(0, 5);
        StdDraw.setPenRadius(.05);
    }

    public static void main(String[] args)
    {
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert isSorted(a);
        show(a);
    }
}
