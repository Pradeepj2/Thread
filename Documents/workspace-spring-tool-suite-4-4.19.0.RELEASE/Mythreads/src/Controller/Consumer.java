package Controller;

public class Consumer extends Thread {

Company c;
	
Consumer(Company c){
		this.c = c;
	}
	
	public void run() {
		
		while(true) {
			try {
				this.c.consumer_item();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
	
}
