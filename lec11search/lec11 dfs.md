# lec11: 搜索



## 万能的解法之搜索

- 解空间
  - 几何空间
  - 子集空间
  - 全排列空间
- 深度优先搜索DFS
- 广度优先搜索BFS

## 深度优先搜素dfs

## 利用dfs遍历子集空间

```Java
public class DfsDemo2 {
    final static int N = 4;
    static int[] a = new int[N];
    static boolean[] visited = new boolean[N];

    static {
        for (int i = 0; i < N; i++)
            a[i] = i + 1;
    }

    static void dfs(int k) {
        if (k == N) {
            for (int i = 0; i < k; i++)
                if (visited[i])
                    System.out.print(a[i]);
            System.out.println();
            return;
        }
        visited[k] = true;
        dfs(k + 1);
        visited[k] = false;
        dfs(k + 1);
    }

    public static void main(String[] args) {
        dfs(0);
    }
}
```



## 利用dfs遍历全排列空间

```Java
//深度优先搜索遍历全排列空间
public class DfsDemo1 {
    final static int N = 4;
    static int[] a = new int[N];
    static boolean[] visited = new boolean[N];

    static void dfs(int k) {
        if (k == N) {
            for (int i = 0; i < k; i++)
                System.out.print(a[i] + " ");
            System.out.println();
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                a[k] = i;
                dfs(k + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        dfs(0);
    }
}
```


# dfs应用

```Java

public class DfsSolve1vs2vs3 {
    final static int N = 9;
    static int[] a = new int[N];
    static boolean[] visited = new boolean[N];

    static boolean ok() {
        int x = a[0] * 100 + a[1] * 10 + a[2];
        int y = a[3] * 100 + a[4] * 10 + a[5];
        int z = a[6] * 100 + a[7] * 10 + a[8];
        return y == 2 * x && z == 3 * x;
    }

    static void dfs(int k) {
        if (k == N && ok()) {
            int x = a[0] * 100 + a[1] * 10 + a[2];
            int y = a[3] * 100 + a[4] * 10 + a[5];
            int z = a[6] * 100 + a[7] * 10 + a[8];
            System.out.println(String.format("%d %d %d", x, y, z));
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                a[k] = i + 1;
                dfs(k + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        dfs(0);
    }
}
```