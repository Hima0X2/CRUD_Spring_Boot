package com.sts.entities;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepo extends CrudRepository<user,Integer>{

}
