package com.ivano.sprintretrospective.user;

import com.ivano.sprintretrospective.user.web.domain.User;
import org.springframework.stereotype.Service;

@Service
public class UserService
{
	public User createUser(String userName)
	{
		return new User(userName);
	}
}
