package Java8;

public class MethodReference {

	public static void m2(){
		System.out.println("Method Refernece Example");
	}
	public void m3(){
		for (int i=0; i<10; i++){
			System.out.println("Child thread");
		}
	}
	public static void main(String[] args) {
		Interf i = MethodReference::m2;
		i.m1();
		
		MethodReference m = new MethodReference();
		Runnable r = m :: m3;
		Thread th = new Thread(r);
		th.start();
		
		for (int j=0; j<10; j++){
			System.out.println("Main thread");
		}
	}
}
interface Interf{
	
	public void m1();
}
