import java.util.Arrays;
import java.util.Scanner;



public class P1572 {
	static class Pipe implements Comparable<Pipe> {
		int length;
		int diameter;
		int number;

		public Pipe(int length, int diameter, int number) {
			super();
			this.length = length;
			this.diameter = diameter;
			this.number = number;
		}
		
		@Override
		public int compareTo(Pipe that) {
			if (this.length != that.length)
				return that.length - this.length;// 长度降序
			if (this.diameter != that.diameter)
				return this.diameter - that.diameter;// 直径增序
			return that.number - this.number;// 编号降序
		}
	}
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		int N = cin.nextInt();
		while (N-- > 0) {
			int m = cin.nextInt();
			Pipe[] pipes = new Pipe[m];
			for (int i = 0; i < pipes.length; i++) {
				int length = cin.nextInt();
				int diameter = cin.nextInt();
				int number = cin.nextInt();
				pipes[i] = new Pipe(length, diameter, number);

			}
			// System.out.println(Arrays.toString(pipes));
			Arrays.sort(pipes);
			System.out.println(pipes[0].number);
		}

		cin.close();
	}
}