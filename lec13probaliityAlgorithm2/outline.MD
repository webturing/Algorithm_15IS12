#产生随机数的方法：
## 1.使用Math类自带的random方法
```random方法产生的是0.0-1.0之间的随机数```
###1.1产生任意范围之内的随机数
参考公式： ```(int)( Math.random() * (end - start + 1))+start```

例：产生5-8之间的随机数：

```int x = (int)(5+Math.random()*(8-5+1));```
##2.使用java.util类中的Random类
### 2.1带种子的构建方式：
　　A:Random() 默认种子，每次产生的随机数不同

### 2.2不带种子的构建方式：
　　B:Random(long seed)指定种子,每次种子相同，随机数就相同 
　　

### 调用nextInt(arg)/nextDouble(arg)方法产生**

A：int nextInt()：返回int范围内的随机数
B：int nextInt(int n)：返回[0,n) 范围内的随机数
```
Random ran = new Random();
Integer x1 = ran.nextInt(20);
Double x2 = ran.nextDouble(3.0);
```
###3.使用System类中的currentTimeMillis()方法返回的long值取模运算，就可以将结果限制在一个范围内了
```java
package cn.math;
import java.util.Random;
public class RandomDemo {
    public static void main(String[] args) {
        /*
         * 方法1：使用java.lang.Math类自带的random方法
         *  使用方法：(数据类型)(最小值+Math.random()*(最大值-最小值+1))
         */
        //例1.1：产生1-10之间的随机整数
        System.out.println("~"+(int)(1+Math.random()*10));
        //例1.2：产生5-8之间的随机整数
        System.out.print("~"+(int)(5+Math.random()*(8-5+1)));
        //例1.3：产生100之内的随机整数(0~99)
        System.out.print("~"+(int)(Math.random()*100));
        /* 2.使用java.util类中的Random类的nextInt(arg)/nextDouble(arg)方法产生
         *  如果用相同的种子创建两个 Random 实例，则对每个实例进行相同的方法调用序列，
         *  它们将生成并返回相同的数字序列。为了保证实现这种特性，我们为类Random指定了特定的算法。
         *  为了 Java 代码的完全可移植性，Java 实现必须让类 Random 使用此处所示的所有算法。
         *  但是允许 Random 类的子类使用其他算法，只要其符合所有方法的常规协定即可。
         */
        //2.1带种子的构建方式(此种方式，无论程序运行多少次，返回结果都是一样的)
        //2.1.1 使用555L作为种子产生随机数
        Random ran = new Random(555L);
        int i = 3;
        while(i--!=0){
            System.out.print("~"+ran.nextInt());
        }
        //结果：~-1367481220~292886146~-1462441651
        System.out.println("-------------------------");
        //2.1.2 同样使用555L作为种子产生随机数
        Random random = new Random();
        random.setSeed(555L);
        for (int i1 = 0; i1 < 50; i1++) {
            System.out.print("~"+random.nextInt());
        }
        //结果：~-1367481220~292886146~-1462441651 ，与上面产生的结果相同（关键是种子要一样）
        //2.2不带种子的构建方式(此种方式将会返回随机的数字，每次运行结果都不一样)
        Random ran2 = new Random();
        int i2 = 30;
        while(i2--!=0){
            System.out.print("~"+ran2.nextInt());
        }
        //3 使用System类中的currentTimeMillis方法产生50以内的随机数
        long r1 = System.currentTimeMillis();
        System.out.println(r1%50);
    }
}

```
### 均匀洗牌算法 Collection.shuffle