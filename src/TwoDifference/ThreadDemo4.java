package TwoDifference;

public class ThreadDemo4 {
	public static void main(String [] args){
		/*ThreadTest t = new ThreadTest();
		
		t.start();
		t.start();
		t.start();
		t.start();
		
//创建了一个线程对象，并重复启动四次，希望通过这种方式产生四个线程
//但是只有一个线程在运行，所以一个线程对象只能启动一个线程
//无论调用多少遍start()方法，结果都只有一个线程
		*/
		
		new ThreadTest().start();
		new ThreadTest().start();
		new ThreadTest().start();
		new ThreadTest().start();
//	The result of above is every ticket is sold by four times, which means
//  the four threads sold 100 tickets each, rather than sold the same 100 tickets
//  In above, we create four new Threads, which means create four sources with each
//  has 100 tickets. 
//  Each thread sells their own 100 tickets.
	}

}

/*
class ThreadTest extends Thread{
	private int tickets = 100;
	
	public void run(){
		while(true){
			if(tickets > 0)
				System.out.println(Thread.currentThread().getName() + " is"
						+ " salling ticket" + tickets--);
		}
	}
}
*/
