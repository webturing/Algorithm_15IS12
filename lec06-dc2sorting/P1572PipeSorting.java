import java.util.Arrays;
import java.util.Scanner;
 
class Pipe implements Comparable<Pipe> {
    int length;
    int diameter;
    int nunmber;
 
    public Pipe(int length, int diameter, int nunmber) {
        this.length = length;
        this.diameter = diameter;
        this.nunmber = nunmber;
    }
 
    @Override
    public int compareTo(Pipe that) {
        if (this.length != that.length)
            return that.length - this.length;
        if (this.diameter != that.diameter)
            return this.diameter - that.diameter;
        return that.nunmber - this.nunmber;
    }
 
    @Override
    public String toString() {
        return "Pipe{" +
                "length=" + length +
                ", diameter=" + diameter +
                ", nunmber=" + nunmber +
                '}';
    }
}

public class P1572PipeSorting {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int groups = cin.nextInt();
        while (groups-- > 0) {
            int num = cin.nextInt();
            Pipe[] pipes = new Pipe[num];
//            System.out.println(Arrays.toString(pipes));
            for (int i = 0; i < pipes.length; i++) {
                pipes[i] = new Pipe(cin.nextInt(), cin.nextInt(), cin.nextInt());
            }
//            System.out.println(Arrays.toString(pipes));
            Arrays.sort(pipes);
//            System.out.println(Arrays.toString(pipes));
            System.out.println(pipes[0].nunmber);
        }
        cin.close();
    }
}
 