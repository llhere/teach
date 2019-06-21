package test.threadPoolExture;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


public class PoolTest16 {

	
	
	public static void main(String[] args) throws InterruptedException {
		ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 200, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(1));
		
		//使keepAliveTime在未达到corePoolSize也生效
		executor.allowCoreThreadTimeOut(true);
		long q = System.currentTimeMillis(); 
		/*
		 * for(int i=0;i<2;i++){ if(i % 700 == 0) Thread.currentThread().sleep(1L);
		 * executor.submit(new MyTask(i)); // new Thread(new MyTask(i)).start(); if(i %
		 * 100000 == 0)
		 * System.out.println(i+1+"线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
		 * executor.getQueue().size()+"，已执行完任务数目："+executor.getCompletedTaskCount()); }
		 */
		 executor.submit(new MyTask(0));
		 executor.submit(new MyTask(1));
//		 Thread.currentThread().sleep(600L);
		 System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+ executor.getQueue().size()+"，已执行完任务数目："+executor.getCompletedTaskCount());
		 Thread.currentThread().sleep(210L);
		 System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+ executor.getQueue().size()+"，已执行完任务数目："+executor.getCompletedTaskCount());
		 System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++调用线程关闭:" + String.valueOf(System.currentTimeMillis()-q));
         executor.shutdown();
	}
	
}


class MyTask implements Runnable {
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
}