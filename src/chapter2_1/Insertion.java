/*************************************
 # @Time    : 2018/4/13
 # @Author  : Mr.Sprint
 # @Project : algorithms
 # @File    : Insertion
 # @Software: IntelliJ IDEA
 # code is far away from bugs with the god animal protecting
 # I love animals. They taste delicious.
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

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Insertion {
    public static void sort(Comparable[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = i; j > 0 && Example.less(a[j], a[j - 1]); j--)
            {
                Example.exch(a, j ,j - 1);
            }
        }
    }

       public static void main(String[] args)
    {
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }
}
