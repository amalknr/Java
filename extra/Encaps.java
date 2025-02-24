package extra;

public class Encaps {
	
	private int Age;
	private String name;

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encaps sc=new Encaps();
		sc.setAge(25);
		sc.setName("Amal");
		System.out.println(sc.getAge());
		System.out.println(sc.getName());
		
	}

}
