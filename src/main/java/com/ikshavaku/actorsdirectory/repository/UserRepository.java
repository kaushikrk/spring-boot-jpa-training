package com.ikshavaku.actorsdirectory.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ikshavaku.actorsdirectory.model.User.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
