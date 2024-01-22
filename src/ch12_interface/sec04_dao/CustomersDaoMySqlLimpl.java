package ch12_interface.sec04_dao;

import java.util.List;

public class CustomersDaoMySqlLimpl implements CustomerDao {

	@Override
	public Customer getCustomer(int cid) {
		System.out.println("MySQL: getCustomer()");
		return null;
	}

	@Override
	public List<Customer> getCustomerList() {
		System.out.println("MySQL: getCustomerList()");
		return null;
	}

	@Override
	public void insertCustomer(Customer customer) {
		System.out.println("MySQL: insertCustomer()");
	}

	@Override
	public void updateCustomer(Customer customer) {
		System.out.println("MySQL: updateCustomer()");
	}

	@Override
	public void deleteCustomer(int cid) {
		System.out.println("MySQL: deleteCustomer()");
	}

}