package test.designPattern.结构型_7种._12享元模式;

import java.sql.SQLException;

public class Test {
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		//创建连接池
		ConnectionPool conn = ConnectionPool.getInstance();
		
		//拿出num个链接
		int num = 20;
		conn.getConnection(num);
		
		System.out.println("\n===========================\n");
		
		//放回去一个
		conn.release();
		
		
		
	}

}
