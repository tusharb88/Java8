package impl;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

public class CompletableFutureExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService ex= Executors.newFixedThreadPool(1);
	//	CompletableFuture.
		
		CompletableFuture<Integer> cf =CompletableFuture.supplyAsync(()->{
				IntStream.range(1, 10).forEach(a-> System.out.print(a));			
				System.out.println(Thread.currentThread().getName()+ "waiting.....");
				//Thread.sleep(100000);
				try {
					TimeUnit.SECONDS.sleep(10);
					System.out.println("Task is compelted");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return 123;
				}
				, ex);
		
		try {
			TimeUnit.SECONDS.sleep(5);
			cf.cancel(false);
			//cf.complete(0);
			Integer result= cf.get();
			System.out.println("Result is "+result);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		

	}

}
