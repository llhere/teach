package test.socket.tomcatServer;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HttpSocket {

	private static ExecutorService threadPool = Executors.newCachedThreadPool();
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws UnknownHostException, IOException {
		ServerSocket serverSocket = new ServerSocket(8080);
		System.out.println("tomcat 服务器启动成功");
		 while (!serverSocket.isClosed()) {
			 
			 Socket request = serverSocket.accept();
			 
			 Runnable runnable = new Runnable() {
				public void run() {
					
				}
			};
			
			
			threadPool.execute(runnable);
			 
			 
		 }
	}
	
}
