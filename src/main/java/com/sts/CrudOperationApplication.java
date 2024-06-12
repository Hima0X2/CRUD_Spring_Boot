package com.sts;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sts.entities.UserRepo;
import com.sts.entities.user;

@SpringBootApplication
public class CrudOperationApplication {
	public static void main(String[] args) {
		ApplicationContext run= SpringApplication.run(CrudOperationApplication.class, args);
		UserRepo userRepo=run.getBean(UserRepo.class);
		//saving single user
		user user1=new user();
		user1.setName("narita");
		user1.setPhnno("01333");
		user u1 = userRepo.save(user1);
		
		user user2=new user();
		user2.setName("pp");
		user2.setPhnno("1111");
		user u2 = userRepo.save(user2);
//		
//		System.out.println(u1);
//		System.out.println(u2);
		
		//saving multiple user
//		List<user> list=List.of(user1,user2);
//		Iterable<user> result= userRepo.saveAll(list);
//		//read
//		result.forEach(user->{
//			System.out.println(user);
//		});
		//update
		Optional<user> update= userRepo.findById(253);
		user userupdate=update.get();
		userupdate.setName("Kazi");
		userRepo.save(userupdate);
		//delete
		userRepo.deleteById(303);
	}

}