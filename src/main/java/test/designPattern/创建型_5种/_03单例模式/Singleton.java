package test.designPattern.创建型_5种._03单例模式;

/**
 * 单利模式
 * 
 * 单例对象（Singleton）是一种常用的设计模式。在Java应用中，单例对象能保证在一个JVM中，该对象只有一个实例存在。这样的模式有几个好处：
 * 
 * 1、某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销。
 * 
 * 2、省去了new操作符，降低了系统内存的使用频率，减轻GC压力。
 * 
 * 3、有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，系统完全乱了。（比如一个军队出现了多个司令员同时指挥，
 * 肯定会乱成一团），所以只有使用单例模式，才能保证核心交易服务器独立控制整个流程。
 *
 */
public class Singleton {

	//懒汉 
	private static Singleton instance = null;

	private Singleton() {
	}

	//在构造函数中创建如果抛出异常，实例将永远得不到创建,所以拆出来单独写。整个程序只需创建一次实例，所以性能也不会有什么影响。
	private static synchronized void syncInit() {
		if (instance == null) {
			instance = new Singleton();
		}
	}

	//获取实例
	public static Singleton getInstance() {
		if (instance == null)
			syncInit();
		return instance;
	}

}
