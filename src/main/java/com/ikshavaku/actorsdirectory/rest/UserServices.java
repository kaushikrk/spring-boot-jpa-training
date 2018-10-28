package com.ikshavaku.actorsdirectory.rest;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ikshavaku.actorsdirectory.model.User.User;
import com.ikshavaku.actorsdirectory.service.UserLogics;


@Controller
@RequestMapping("/user")
public class UserServices {

	@Autowired
	UserLogics userProcess;

	@PostMapping("register")
	@ResponseBody
	public Map<String, String> registerNewUser(@RequestBody @Valid User user) {
		Map<String, String> resultMap;
		try {
			Long userId = userProcess.registerUser(user);
			resultMap = resultMap(userId);
		} catch (Exception e) {
			resultMap = resultMap(e.getMessage());

		}
		return resultMap;
	}

	public Map<String, String> resultMap(Long userId) {
		Map<String, String> resultMap = new HashMap<>();
		resultMap.put("success", "true");
		resultMap.put("message", "Saved Successfully");
		resultMap.put("data", userId.toString());
		return resultMap;
	}

	public Map<String, String> resultMap(String error) {
		Map<String, String> resultMap = new HashMap<>();
		resultMap.put("success", "false");
		resultMap.put("message", "Save failed");
		resultMap.put("error", error);
		return resultMap;
	}
}
