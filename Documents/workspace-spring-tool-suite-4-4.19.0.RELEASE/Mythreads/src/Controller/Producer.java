package Controller;

public class Producer extends Thread {

	Company c;
	
	Producer(Company c){
		this.c = c;
	}
	
	public void run() {
		int i = 1;
		while(true) {
			try {
				this.c.producer_item(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}i++;
		}
		
	}
}
