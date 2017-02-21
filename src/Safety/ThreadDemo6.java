package Safety;
//Synchronized Code and Synchronized function
public class ThreadDemo6 {
	
	public static void main(String [] args){
		ThreadTest t = new ThreadTest();
		new Thread(t).start();
		try{Thread.sleep(1);}catch(Exception e){}
		t.str = new String("method");
		new Thread(t).start();
		
	}

}

class ThreadTest implements Runnable{
	private int tickets = 100;
	String str = new String("");
	public void run(){
		if(str.equals("method")){
			while(true){
				sale();
			}
		}
		else{
			while(true){
				synchronized(str){
					if(tickets > 0){
						try{
							Thread.sleep(10);
						}
						catch(Exception e){
							System.out.println(e.getMessage());
						}
						System.out.println(Thread.currentThread().getName()+
								" is selling ticket " + tickets-- );
					}
				}
			}
		}
	}
	  public synchronized void sale(){
	    	if(tickets > 0){
	    		try{
	    			Thread.sleep(10);
	    		}catch(Exception e){
	    			System.out.println(e.getMessage());
	    		}
	    		System.out.println(Thread.currentThread().getName() + " is "
	    				+ " selling ticket " + tickets--);
	    	}
	    }
	
	
}
