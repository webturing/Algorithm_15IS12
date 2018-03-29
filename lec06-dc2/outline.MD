# lec06: 分治算法 divide and conque2
## 分治和递归
- 问题P分解为若干个小规模问题SPi
- 如果较小的问题SPi被求解，则原问题也求解P  
- 可以连续分解直到问题到达原子规模P0 (递归)

## 思想

1.  将一个规模为n的问题分解为k个规模较小的子问题，这些子问题互相独立且与原问题相同。递归地解这些子问题，然后将各子问题的解合并得到原问题的解。

2.  divide-and-conquer(P)
{
    if(|P| <= n0)adhoc(P);
    divide P into samller subinstances P1,P2...,Pk;
    for(int i = 1;i < k;i++)
    {
        yi = divide-and-conquer(Pi);
    }
    return merge(y1,y2...,yn);
}
3.如何划分子问题
-   集合论，找到一个原来集合问题的一个划分，子问题之间不相交，同时子问题的规模类型相同
-   最优子结构（子问题类型相同）
-   最好使子问题的规模大致相同，即将一个问题的大小分成相等规模的k个子问题的处理方法是行之有效的。

## 例子
-  fibonacci 数列        
-  二分搜索
-  大整数乘法
-  Strassen 矩阵乘法
-  合并排序
-  快速排序


##递归树和主定理：
T(n) = aT(n/b)+f(n),a>=1,b>1,f(n)是给定的多项式函数，刻画了一个分值算法，生成a个子问题，每个问题的规模是原来的1/b，分解合并步骤共消耗f(n). T(n)的复杂度的分析如下：
```
1.  若f(n)<n^(log(a/b)) 则T(n) = n^(log(a/b))
2.  若f(n)=n^(log(a/b)) 则T(n) = n^(log(a/b))logn
3.  若f(n)>n^(log(a/b)) 则T(n) = f(n)
```
