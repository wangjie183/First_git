package entity;

public class Users {
	private String name;//����
	private int age;//nianling
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
	public Users(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Users() {
		super();
	}
}
