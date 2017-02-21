/*package ByThreadClass;

public class ThreadDemo2 {
	public static void main(String args[]){
		new TestThread().start(); //run()
		while(true){
			System.out.println("main thread is running");
		}
		
	}

}

class TestThread extends Thread{
	public void run(){
		while(true){
			System.out.println(Thread.currentThread().getName() + " is running");
		}
	}
}*/