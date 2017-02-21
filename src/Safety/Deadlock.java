package Safety;

public class Deadlock implements Runnable{
	A a = new A();
	B b = new B();
	
	Deadlock(){
		Thread.currentThread().setName("MainThread");
		new Thread(this).start();
		a.foo(b);
		System.out.println("back in main thread");
	}
	
	public void run(){
		Thread.currentThread().setName("RacingThread");
		b.bar(a);
		System.out.println("back in other thread");
	}
	
	public static void main(String [] args){
		new Deadlock();
	}

}

class A{
	synchronized void foo(B b){
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered A.goo");
		
		try{
			Thread.sleep(1000);
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		System.out.println(name + " trying to call B.last()");
		b.last();
	}
	
	synchronized void last(){
		System.out.println("inside A.last");
	}
}

class B{
	synchronized void bar(A a){
		String name = Thread.currentThread().getName();
		System.out.println(name + " entered B.bar");
		try{
			Thread.sleep(1000);
		}catch(Exception e){
			System.out.println(name + "trying to call A.last()");
			a.last();
		}
	}
	
	synchronized void last(){
		System.out.println("inside B.last");
	} 
}


