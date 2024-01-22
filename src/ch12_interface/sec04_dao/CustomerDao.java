package ch12_interface.sec04_dao;

import java.util.List;

//DAO(Data Access Object) - DB를 액세스 하기위한코드
//DTO(Data Transfer Objcet), VO(Value Object) - DB를 액세스 할 떄 사용되는 데이터 

public interface CustomerDao {
	
	Customer getCustomer(int cid);
	
	List<Customer> getCustomerList();
	
	void insertCustomer(Customer customer);
	
	void updateCustomer(Customer customer);
	
	void deleteCustomer(int cid);
	
}