
public class Fibonacci {

	private int start;
	private int end;

	public Fibonacci() {

	}

	public Fibonacci(int starting, int ending) {

		this.start = starting;
		this.end = ending;
	}

	public void calculateFibonacci() {

		int current, middle, prev;
		System.out.print("The fibonacci series is : ");
		if (start == 0) {
			current = 1;
			middle = 1;
			prev = 0;
			System.out.print(start + " ");
		} else {
			current = start;
			middle = (int) Math.round((start / ((1 + Math.sqrt(5)) / 2.0)));
			prev = (int) Math.round((middle / ((1 + Math.sqrt(5)) / 2.0)));
			// System.out.print(prev + " ");
		}

		while (current <= end) {

			System.out.print(current + " ");
			int newV = middle + current;
			middle = current;
			current = newV;
		}

	}

}