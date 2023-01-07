package com.peenc.mongodb.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.peenc.mongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
