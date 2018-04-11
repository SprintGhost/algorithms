/*************************************
 # @Time    : 2018/4/11
 # @Author  : Mr.Sprint
 # @Project : algorithms
 # @File    : WeightedQuickUnionUF
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
package chapter1_5;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class WeightedQuickUnionUF {
    private int[] id;                //Parent Link
    private int[] sz;                //Component size
    private int count;               //Component count

    public WeightedQuickUnionUF(int N)
    {
        count = N;
        id = new int[N];
        for (int i = 0; i < N; i++)
            id[i] = i;
        sz = new int[N];
        for (int i = 0; i < N; i++)
            sz[i] = 1;
    }

    public int count()
    {
        return count;
    }

    public boolean connected(int p, int q)
    {
        return find(p) == find(q);
    }

    public int find(int p)
    {
        while (p != id[p]) p = id[p];
        return p;
    }
    public void union(int p, int q)
    {
        int i = find(p);
        int j = find(q);
        if (sz[i] < sz[j])
        {
            id[i] = j;
            sz[j] += sz[i];
        }
        else
        {
            id[j] = i;
            sz[i] += sz[j];
        }
        count--;
    }

    public static void main(String[] args)
    {
        int N = StdIn.readInt();
        WeightedQuickUnionUF WeightedQuickUnionUF = new WeightedQuickUnionUF(N);
        while (!StdIn.isEmpty())
        {
            int p = StdIn.readInt();
            int q = StdIn.readInt();
            if (WeightedQuickUnionUF.connected(p, q)) continue;
            WeightedQuickUnionUF.union(p ,q);
            StdOut.println(p + " " + q);
        }
        StdOut.println(WeightedQuickUnionUF.count + "components");
    }
}
