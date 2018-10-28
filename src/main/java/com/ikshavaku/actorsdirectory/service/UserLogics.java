package com.ikshavaku.actorsdirectory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ikshavaku.actorsdirectory.model.User.User;
import com.ikshavaku.actorsdirectory.repository.UserRepository;

@Service
public class UserLogics {

	@Autowired
	UserRepository userRepo;

	public Long registerUser(User user) throws Exception {
		User registeredUser = userRepo.save(user);
		return registeredUser.getUserId();

	}

}
