package com.mkyong.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import org.springframework.stereotype.Component;

import com.mkyong.customer.bo.CustomerBo;
import com.springinaction.springidol.MindReader;
import com.springinaction.springidol.Performer;
import com.springinaction.springidol.Thinker;

@Component("app")
public class App {
	
	  @Autowired
	  MindReader magician;

	  @Autowired
	  Thinker volunteer;	
	  
	  public void magicianShouldReadVolunteersMind() {
		    volunteer.thinkOfSomething("Queen of Hearts");

		  }	  
	
	public static void main(String[] args) throws Exception {

		

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

		
		//CustomerBo customer = (CustomerBo) appContext.getBean("customerBo");
		//customer.addCustomer();
		
		//customer.addCustomerReturnValue();
		
		//customer.addCustomerThrowException();
		
		//customer.addCustomerAround("mkyong");
		
		App p = (App) appContext.getBean("app");
		p.magicianShouldReadVolunteersMind();
		
	    Performer eddie = (Performer) appContext.getBean("eddie");
	    eddie.perform();
	    
	    

	}
}