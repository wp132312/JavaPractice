package org.dimigo.thread;

/**
 * <pre>
 * org.dimigo.thread.Race
 *
 * 1. Scheme 	: 
 * 2. Date 		: 2015. 11. 6.
 * </pre>
 *
 * @author		: ryusim
 * @version		: 1.0 
 */

public class Race {

	public static void main(String[] args) {	
		System.out.println("main thread start");
		Thread t1 = new Runner("최재혁");
		Thread t2 = new Runner("박민준");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		System.out.println("main thread stop");
	}

}
