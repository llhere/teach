package test.designPattern.结构型_7种._09外观模式;


/**
 * 外观模式
 * 
 *   外观模式是为了解决类与类之间的依赖关系的，像spring一样，
 *   可以将类和类之间的关系配置到配置文件中，而外观模式就是将他们的
 *   关系放在一个Facade类中，降低了类类之间的耦合度，该模式中没有涉及到接口
 *   
 *   如果我们没有Computer类，那么，CPU、Memory、Disk他们之间将会相互持有实例，产生关系，
 *   这样会造成严重的依赖，修改一个类，可能会带来其他类的修改，这不是我们想要看到的，
 *   有了Computer类，他们之间的关系被放在了Computer类里，这样就起到了解耦的作用
 *
 */


//cpu类
public class Cpu {

	public void startup() {
		System.out.println("cpu startup");
	}
	
	public void shutdown() {
		System.out.println("cpu shutdown");
	}
	
}


//memory类
class Memory{
	
	public void startup() {
		System.out.println("memory startup");
	}

	public void shutdown() {
		System.out.println("mempry shutdown");
	}
	
}


//磁盘类
class Disk{
	
	public void startup() {
		System.out.println("disk startup");
	}

	public void shutdown() {
		System.out.println("disk shutdown");
	}

}


//组成的computer类
class Computer{
	
	Cpu cpu;
	Memory memory;
	Disk disk;
	
	//组成的电脑
	public Computer() {
		cpu = new Cpu();
		memory = new Memory();
		disk = new Disk();
	}
	
	
	//start电脑
	public void startComputer() {
		cpu.startup();
		memory.startup();
		disk.startup();
	}
	
	
	//shutdown电脑
	public void shutdownComputer() {
		cpu.shutdown();
		memory.shutdown();
		disk.shutdown();
	}
	
}

