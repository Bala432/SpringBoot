package com.example.demo;

import java.util.List;
import java.util.ArrayList;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyApplication {
	
//	@RequestMapping("/")
//	public String getMessage() {
//		return "Working by Spring starter project";
//	}
	
//	@RequestMapping("/getallcustomers")
//	public List<Customer> getAllCustomers(){
//		List<Customer> cList = new ArrayList<Customer>();
//		cList.add(new Customer(101,"ravi"));
//		cList.add(new Customer(107,"kiran"));
//		return cList;
//	}
//	
//	@RequestMapping("/getcustomer")
//	public List<Customer> getCustomer(@RequestParam(value="id",defaultValue="101") Integer id){
//		List<Customer> cList2 = new ArrayList<Customer>();
//		List<Customer>res = new ArrayList<Customer>();
//		cList2.add(new Customer(101,"ravi"));
//		cList2.add(new Customer(107,"kiran"));
//		for(Customer cus:cList2) {
//			if(cus.getId() == id) {
//				res.add(cus);
//			}
//		}
//		return res;
//	}
//	
	

	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
		
//		Customer c = context.getBean(Customer.class);
//		c.show();
		
	}

}
