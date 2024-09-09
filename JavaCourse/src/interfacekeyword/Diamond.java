package interfacekeyword;

public class Diamond implements One,Two {

	public static void main(String[] args) {

		Diamond diamond = new Diamond();
		diamond.display();
	}

	@Override
	public void display() {
//		super.display();
		One.super.display();
		//interfaceName.superKeyword.methodName
	}

}

interface One{
	
	default void display(){
		System.out.println("One");
	}
}

interface Two{
	
	default void display(){
		System.out.println("Twos");
	}
}