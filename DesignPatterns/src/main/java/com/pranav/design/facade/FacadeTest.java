package com.pranav.design.facade;

/*Complex parts*/
class Monitor {
	public void display() {
		System.out.println("Monitor.display");
	}
}

class CPU {
	public void startCPU() {
		System.out.println("CPU.start");
	}

	public void stopCPU() {
		System.out.println("CPU.stop");
	}
}

class HardDrive {
	public void read() {
		System.out.println("HardDrive.read");
	}
}

/* Facade */
class ComputerFacade {
	private CPU processor;
	private HardDrive drive;
	private Monitor monitor;

	public ComputerFacade() {
		this.processor = new CPU();
		this.drive = new HardDrive();
		this.monitor = new Monitor();
	}

	public void start() {
		processor.startCPU();
		drive.read();
		monitor.display();
		processor.stopCPU();
	}
}

/* Facade Test */
public class FacadeTest {

	public static void main(String[] args) {
		ComputerFacade compFacade = new ComputerFacade();
		compFacade.start();
	}
}
