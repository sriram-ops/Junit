package com.in28minutes.rest.webservices.restfulwebservices;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import com.in28minutes.rest.webservices.resdtfulwebservices.user.UserResource;

 
 

@SpringBootTest(classes =com.in28minutes.rest.webservices.resdtfulwebservices.user.UserResource.class)
@Import(com.in28minutes.rest.webservices.resdtfulwebservices.user.UserDAOService.class)
class RestfulWebServicesApplicationTests {
	
	@Autowired(required=true)
	UserResource userResource;
     

	@Test
	void contextLoads() {
		
		assert(userResource) != null;
		if(userResource!=null) {
			
			System.out.println(userResource.retriveUserid(1));
		}
 
	}

}
