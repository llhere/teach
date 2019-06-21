package test.threadPoolExture;

import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.sun.corba.se.impl.orbutil.threadpool.ThreadPoolImpl;

public class PoolTest18 {

	
	public static void main(String[] args) {
		ThreadPoolImpl threadPoolImpl = new ThreadPoolImpl(13, 26, 200, "chen");
		new ThreadPoolExecutor(10, 20, 200, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(2000));
		
		
	}
	
}



/*class MyTask implements Runnable {
	
	private int taskNum;
	
	public MyTask(int num) {
	  this.taskNum = num;
	}
	
	@Override
	public void run() {
	  try {
	      Thread.currentThread().sleep(0);
	  } catch (InterruptedException e) {
	      e.printStackTrace();
	  }
	}
}*/