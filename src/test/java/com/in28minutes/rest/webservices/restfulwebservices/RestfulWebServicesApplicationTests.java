package com.in28minutes.rest.webservices.restfulwebservices;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.in28minutes.rest.webservices.resdtfulwebservices.user.RestfulWebServicesApplication;
import com.in28minutes.rest.webservices.resdtfulwebservices.user.UserResource;



 
 
 
@SpringBootTest(classes =com.in28minutes.rest.webservices.resdtfulwebservices.user.UserResource.class)
@Import(com.in28minutes.rest.webservices.resdtfulwebservices.user.UserDAOService.class)
@ContextConfiguration(classes = RestfulWebServicesApplication.class)
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
