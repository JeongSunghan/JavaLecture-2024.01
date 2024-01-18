package ch06_class.sec02_customer;

public class Customer {
	private int cid;
	private String name;
	private int age;
	private boolean adult;
		// 생성자 (Constructor)
		// toString() method
		// Getter/Setter method
	
	public Customer(int cid, String name, int age) {
		super();
		this.cid = cid;
		this.name = name;
		this.age = age;
		this.adult = age > 19 ? true : false;
	}

	//생성자
	public Customer(){}
	
	public Customer(int cid, String name, int age, boolean adult) {
		this.cid = cid;
		this.name = name;
		this.age = age;
		this.adult = adult;
	}
	
	
	
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", age=" + age + ", adult=" + adult + "]";
		
	}

	//getter, setter 
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
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
	public boolean isAdult() {		//getter setter의 
		return adult;
	}
	public void setAdult(boolean adult) {
		this.adult = adult;
	}
	
	
	
}
