
public class ThreadPriority 
{

	public static void main(String[] args) 
	{
		Thread t1=new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println("Hello from "+Thread.currentThread().getPriority());
				System.out.println("Hello from "+Thread.currentThread().getName());
			}
		});
		t1.setName("Lyhov Thread");
		
		Thread t2=new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				System.out.println("Hello from "+Thread.currentThread().getPriority());
				System.out.println("Hello from "+Thread.currentThread().getName());
			}
		});
		t2.setName("Paneth Thread");

		t1.setPriority(Thread.MIN_PRIORITY);// use for comment
		t2.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
		//t2.start(); when we use two Thread like that. it will show the Eedception
		
		try {
			t2.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//t2.stop();   This is the function that use to take the t2 and stop to destroy    and the system will be coop
					//This function is will take t2 out side the process and destroy to stop the program
	}

}
