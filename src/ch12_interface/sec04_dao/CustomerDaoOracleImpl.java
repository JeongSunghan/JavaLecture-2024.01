package ch12_interface.sec04_dao;

import java.util.List;

public class CustomerDaoOracleImpl implements CustomerDao {

	@Override
	public Customer getCustomer(int cid) {
		System.out.println("Oracle: getCustomer()");
		return null;
	}

	@Override
	public List<Customer> getCustomerList() {
		System.out.println("Oracle: getCustomerList()");
		return null;
	}

	@Override
	public void insertCustomer(Customer customer) {
		System.out.println("Oracle: insertCustomer()");
	}

	@Override
	public void updateCustomer(Customer customer) {
		System.out.println("Oracle: updateCustomer()");
	}

	@Override
	public void deleteCustomer(int cid) {
		System.out.println("Oracle: deleteCustomer()");
	}

}