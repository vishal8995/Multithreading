package multiThreading;

public class ThreadAlternating {
	
	int counter = 1;
	
	static int N;

	public static void main(String[] args) {
		
		N = 10;
		
		ThreadAlternating ta = new ThreadAlternating();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				ta.printEven();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				ta.printOdd();
			}
		});
		
		t1.start();
		t2.start();
	}

	public void printOdd() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 == 0 ) {
					try {
						wait();
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(counter + " ");
				counter ++;
				notify();
			}
		}
	}

	public void printEven() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 != 0) {
					try {
						wait();
					}
					catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.print(counter + " ");
				counter ++;
				notify();
			}
		}
	}

}
