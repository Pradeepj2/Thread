package Controller;

class Company {

	int n;
	boolean f = true;

	synchronized public void producer_item(int n) throws InterruptedException {
		if (!f) {
			wait();
		}

		this.n = n;
		System.err.println("Producer item : " + this.n);
		f = false;
		notify();
	}

	synchronized public int consumer_item() throws InterruptedException {
		if (f) {
			wait();
		}
		System.err.println("Consumed item : " + this.n);
		f = true;
		notify();
		return this.n;
	}

	public static void main(String[] args) {
		Company com = new Company();
		Producer p = new Producer(com);
		Consumer c = new Consumer(com);

		p.start();
		c.start();

	}
}
