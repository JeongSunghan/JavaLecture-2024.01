package ch12_interface.sec04_dao;

import java.util.List;

public class MainWithoutInterface {

	public static void main(String[] args) {
		// MySQL DB를 사용하려면
		CustomersDaoMySqlLimpl customerDaoMySQL = new CustomersDaoMySqlLimpl();
		Customer customer = customerDaoMySQL.getCustomer(34);
		List<Customer> list = customerDaoMySQL.getCustomerList();
		customerDaoMySQL.insertCustomer(customer);
		customerDaoMySQL.updateCustomer(customer);
		customerDaoMySQL.deleteCustomer(34);
		
		// Oracle DB를 사용하려면
		CustomerDaoOracleImpl customerDaoOracle = new CustomerDaoOracleImpl();
		customer = customerDaoOracle.getCustomer(34);
		list = customerDaoOracle.getCustomerList();
		customerDaoOracle.insertCustomer(customer);
		customerDaoOracle.updateCustomer(customer);
		customerDaoOracle.deleteCustomer(34);
	}

}