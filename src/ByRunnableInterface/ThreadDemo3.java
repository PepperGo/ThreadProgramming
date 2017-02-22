package ByRunnableInterface;

public class ThreadDemo3 {
	public static void main(String args[]){
		TestThread tt = new TestThread();
		
		Thread t = new Thread(tt);
		t.start();
		while(true){
			System.out.println("main thread is running");
	//First change		System.out.println("first test").
		}
	}

}

class TestThread implements Runnable{
	
	public void run(){
		while(true){
			System.out.println(Thread.currentThread().getName() + " is running");
		}
	}
}