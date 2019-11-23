package com.lti.app;

import java.time.LocalDate;

import com.lti.entity.Customer;
import com.lti.repository.registerRepo;

public class App {

	public static void main(String args[]) 
	{
		Customer c = new Customer();
		c.setId(12);
		c.setFirstname("Jyoti");
		c.setMiddlename("");
		c.setLastname("Dixit");
		c.setAadhar(121321);
		c.setAddress("Ghansoli");
		c.setDateofbirth(LocalDate.of(2002, 10, 15));
		c.setEmailId("jyoti@gmail.com");
		c.setFathername("J P Dixit");
		c.setGender("Female");
		c.setIncome(211211);
		c.setZipcode(121212);
		c.setState("UP");
		c.setPassword("qw");
		c.setOccType("Pro");
		c.setMobileNo(121212211);
		
		registerRepo dao=new registerRepo();
		dao.addToTable(c);
	
//	CustomerDao dao= new CustomerDao();
//	Customer cust= dao.fetchData(102);
//	System.out.println(cust.getcName());
//	System.out.println(cust.getCity());
	
//		CustomerDao dao= new CustomerDao();
//		List<Customer> custs = dao.fetchDataByCity("Pune");
//		for(Customer c:custs)
//		{
//			System.out.println(c.getcId()+" "+c.getcName()+" "+c.getCity());
//		}	
	
	
//	User u=new User();
////	u.setId(12);
//	u.setName("Komu");
//	u.setEmail("komu@gmail.com");
//	u.setPassword("komu");
//	
//	UserAddressDao dao=new UserAddressDao();
//	dao.addUser(u);
	
	
//	Address a=new Address();
////	u.setId(12);
//	a.setCity("Mumbai");
//	a.setLandmark("Near Burger King");
//	a.setPincode(400701);
//	
//	UserAddressDao dao1=new UserAddressDao();
//	dao1.addAddr(a);
	
		
		/*UserAddressDao dao= new UserAddressDao();
		User u = dao.fetchUser(61);
		
		Address addr=new Address();*/
		
	}
}
