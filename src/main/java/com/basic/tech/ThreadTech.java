package com.basic.tech;

/**
 * do you know Thread.yield?
 * 
 * the result of execution is 1122 or 1212
 * 
 * @author paul
 *
 */
public class ThreadTech extends Thread {

	
	
	public static void main(String args[] ){
		
		for( int i = 0; i < 2; i++){
			ThreadTech tt = new ThreadTech();
			tt.start();
		}
	}
	
	
	public  void run(){
		System.out.print("1");
		Thread.yield();
		System.out.print("2");
	}
}
