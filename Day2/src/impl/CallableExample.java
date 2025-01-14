package impl;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class CallableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Callable<Integer> task = ()->{
			
			IntStream.range(1, 10).forEach(a-> System.out.print(a));			
			System.out.println(Thread.currentThread().getName()+ "waiting.....");
			//Thread.sleep(100000);
			TimeUnit.SECONDS.sleep(10);
			System.out.println("Task is compelted");
			return 123;
		};
		
		ExecutorService ex = Executors.newFixedThreadPool(2);
		System.out.println("In main method");
	
		Future <Integer> result= ex.submit(task);
		Integer response = null;
		try {
			response = result.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Task completed with result"+response);			
			

		
		
	}

}
