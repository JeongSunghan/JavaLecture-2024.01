package ch06_class.sec02_customer;

public class CustomerMain {

	public static void main(String[] args) {
		Customer james = new Customer();
		james.setCid(1); james.setName("제임스"); james.setAge(27); james.setAdult(true);
		
		Customer maria = new Customer(2, "마리아", 23, true);
		
		Customer brian = new Customer(3, "브라이언", 17);
		
		System.out.println(james); System.out.println(maria); System.out.println(brian);
		
	}

}
