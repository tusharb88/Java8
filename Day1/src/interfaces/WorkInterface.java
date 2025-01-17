package interfaces;

@FunctionalInterface
public interface WorkInterface {

	public void doSome();
	
	default public void doSomeWork(){
		System.out.println("Hi I am inside Interface1 default method");
	}
	
	public static void staticMethod(){
		System.out.println("I am static Method");
	}
	
	  @Override
	    public String toString(); 
}
