package com.in28minutes.rest.webservices.restfulwebservices;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Assert;

import com.in28minutes.rest.webservices.resdtfulwebservices.user.User;
import com.in28minutes.rest.webservices.resdtfulwebservices.user.UserResource;

 @Import(com.in28minutes.rest.webservices.resdtfulwebservices.user.UserDAOService.class)
public class TestUserListSuccess {
	
 
		@Autowired(required=true)
		UserResource userResource;
		User user;
	     
    
		@Test
		public void setUserDetails() {
			user = new User(5,"Sriram",new Date());
	ResponseEntity<User> responseEntity = userResource.createUser(user);
	int code =responseEntity.getStatusCodeValue();
	 String  code1=   String.valueOf(code);
	 System.out.println(code1);
	
	Assert.hasText("200", code1);
	     
			 
			
			
			}
		
		@Test
		public void getUserDetails() {
			
			User user =  userResource.retriveUserid(5);
			
	        Assert.hasText("Sriram",user.getName());
	        assert(user)!=null;
	        if(user!=null) {
	        	
	        System.out.println(user.getName()+" "+user.getId()+" "+ user.getDateofBirth());	
	        	
	        }
	        
	  
		   	
		}
	 
		}

	

	

