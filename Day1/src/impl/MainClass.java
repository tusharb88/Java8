package impl;

import interfaces.Sayable2;
import interfaces.draw;

public class MainClass {
	
	public static void main(String[] args){
		
		draw d= new draw(){

			@Override
			public void drawing() {
			System.out.println("I am drawing in ananomous");
				
			}
			
		};
		
		d.drawing();
		
		draw d1 = ()-> {
				System.out.println("I am drawing ");
		};
		
		
		Sayable2 s = (name,a ,b) -> {
				return a + b; 
				};
			System.out.println(s.say("Sumit",2,3));

		s.say1();	
		Sayable2.say2();
		
		
	}

}
