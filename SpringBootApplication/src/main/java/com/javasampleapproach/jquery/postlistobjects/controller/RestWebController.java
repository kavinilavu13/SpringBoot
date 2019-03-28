package com.javasampleapproach.jquery.postlistobjects.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasampleapproach.jquery.postlistobjects.model.Customer;
import com.javasampleapproach.jquery.postlistobjects.model.MeccaRegister;
import com.javasampleapproach.jquery.postlistobjects.model.MeccaRegisterRepository;
import com.javasampleapproach.jquery.postlistobjects.model.RegisterRepository;

/*@RestController
@RequestMapping("/api/customer")
public class RestWebController {

	@Autowired
	RegisterRepository registerRepository;
	
	List<Customer> cust = new ArrayList<Customer>();
	
	@GetMapping(value = "/all")
	public List<Customer> getResource(){
			return cust;
	}	
	@PostMapping(value="/save")
	public String postCustomer(@RequestBody Customer meccaRegister){
	
		
		//System.out.println(cust);
	//	Customer savedmeccaRegister = meccaRegisterRepository.save(meccaRegister);
		return "Post Successfully!";
	}
	@RequestMapping("/register")
	public Customer meccaRegister(@RequestBody Customer cusreg) {
		String name = cusreg.getName();
		System.err.println(name);
		Customer savedmeccaRegister = registerRepository.save(cusreg);
		return savedmeccaRegister;
	}
	@PostMapping(value="/save")
	public MeccaRegister meccaRegister(@RequestBody MeccaRegister meccaRegister) {
		String name = meccaRegister.getName();
		System.err.println(name);
	//	MeccaRegister savedmeccaRegister = meccaRegisterRepository.save(meccaRegister);
		return meccaRegister;
	}
	@PostMapping(value="/save")
	public String postCustomer(@RequestBody Customer customers){		
		System.out.println(customers);
		Customer savedmeccaRegister = meccaRegisterRepository.save(customers);
		return "Post Successfully!";
	}
}*/

@RestController
@RequestMapping("/api/customer")
public class RestWebController {
  
  List<Customer> cust = new ArrayList<Customer>();
  
  @GetMapping(value = "/all")
  public List<Customer> getResource(){
      return cust;
  }
  
  @PostMapping(value="/save")
  public String postCustomer(@RequestBody List<Customer> customers){
    cust.addAll(customers);
    return "Post Successfully!";
  }
}