package impl;

import interfaces.WorkInterface;
import interfaces.WorkInterface2;

public class Work  implements WorkInterface, WorkInterface2{

	
	 public void doSomeWork(){
		 //WorkInterface.super.doSomeWork();
		 System.out.println("My own implementation");
	 }
		public static void staticMethod(){
			System.out.println("I am static Method in IMPL");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		WorkInterface w = () ->{
				System.out.println("Hi I am doing some work");
		};
		
		w.doSomeWork();
*/
		Work w = new Work();
		w.doSomeWork();
		
		WorkInterface.staticMethod();
		
	}

	@Override
	public void doSome() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void doSome2() {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public void doSomeWork() {
//		// TODO Auto-generated method stub
//		System.out.println("Hi I am doing some work");
//	}

}
