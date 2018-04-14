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

public class Shell {
    public static void sort(Comparable[] a)
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

        public static void main(String[] args)
    {
        String[] a = StdIn.readAllStrings();
        sort(a);
        assert Example.isSorted(a);
        Example.show(a);
    }
}
