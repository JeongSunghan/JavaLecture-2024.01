package ch12_interface.sec04_dao;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// MySQL DB를 사용하려면
		CustomerDao customerDao = new CustomerDaoOracleImpl();
		Customer customer = customerDao.getCustomer(34);
		List<Customer> list = customerDao.getCustomerList();
		customerDao.insertCustomer(customer);
		customerDao.updateCustomer(customer);
		customerDao.deleteCustomer(34);
		
		// Oracle DB를 사용하려면
		customerDao = new CustomerDaoOracleImpl();
		customer = customerDao.getCustomer(34);
		list = customerDao.getCustomerList();
		customerDao.insertCustomer(customer);
		customerDao.updateCustomer(customer);
		customerDao.deleteCustomer(34);
		
		// SpringBoot에서 사용하는 경우
//		@Autowired private CustomerDao customerDao;
		// 프로그램이 실행될때 SpringBoot에서 CustomerDao 구현 객체를 주입시켜 줌
	}

}