package Oops;



public class Program4 {
	
	private int age;
	private String name;

	public static void main(String[] args) {
		
		//Encapsulation
		
		Program4 sc=new Program4();
		
		sc.setAge(25);
		sc.setName("Amal");
		
		System.out.println(sc.getAge()+" ");
		System.out.println(sc.getName()+" ");

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
