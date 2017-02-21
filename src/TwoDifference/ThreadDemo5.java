package TwoDifference;

public class ThreadDemo5 {
	
	public static void main(String [] args){
		ThreadTest tt = new ThreadTest();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
		new Thread(tt).start();
		
		
	}
}


class ThreadTest implements Runnable{
	private int tickets = 100;
	
	public void run(){
		while(true){
			if(tickets > 0)
				System.out.println(Thread.currentThread().getName() + " is selling tickets" 
						+ tickets--);
		}
	}
	
}