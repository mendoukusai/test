package test;

public class FatherAndSon {

	public static void main(String[] args) {
		//System.out.println(son.test());

	}

}

class father{
	private String name;
	public int age;
	
	//geter and seter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}	
	
	public void eat(){
		
	}
	
	private void slepp(){
		
	}
}

class son extends father{
	public void test(){
		super.getName();
	}
}
