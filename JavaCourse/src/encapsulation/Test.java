package encapsulation;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person person = new Person();
		person.setAge(-1);
		
//		Person person = new Person("PP",1);//constructor with no param
//		person.setName("PP");
//		person.setAge(-1);
//		System.out.println("Person 1:: Name : "+ person.getName() + " and Age : "+person.getAge());
		
		//person == null
		
		
		
//		person.setName("Nick");
//		person.setAge(-1);
//		System.out.println("Person 1:: Name : "+ person.getName() + " and Age : "+person.getAge());
//		
//		Person person2 = new Person("Patrick",24); //constructor with param
//		System.out.println("Person 2:: Name : "+ person2.getName() + " and Age : "+person2.getAge());
//		
//		
//		changeName(person2);
//
//		System.out.println("Person 2:: Name : "+ person2.getName() + " and Age : "+person2.getAge());
//		
//		changeAge(person2.getAge());
//
//		System.out.println("Person 2:: Name : "+ person2.getName() + " and Age : "+person2.getAge());
		
	}
	public static void changeAge(int age) {
		age = 12;
	}
	
	public static void changeName(Person person2) {
		person2.setName("Changed");
	}

}
