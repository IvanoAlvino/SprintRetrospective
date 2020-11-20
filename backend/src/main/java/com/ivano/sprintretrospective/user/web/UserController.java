package com.ivano.sprintretrospective.user.web;

import com.ivano.sprintretrospective.room.RoomService;
import com.ivano.sprintretrospective.user.UserService;
import com.ivano.sprintretrospective.user.web.domain.User;
import com.ivano.sprintretrospective.user.web.rest.CreateUserRequest;
import com.ivano.sprintretrospective.user.web.rest.CreateUserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
@RequiredArgsConstructor
public class UserController
{
	private final UserService userService;

	private final RoomService roomService;

	@PostMapping
	public CreateUserResponse createUser(@RequestBody CreateUserRequest request)
	{
		User user = userService.createUser(request.getUserName());
		try
		{
			roomService.addUserToRoom(user, request.getRoomId());
		}
		catch (Exception e)
		{
			// TODO handle here the problem properly
		}
		return new CreateUserResponse(user.getId());
	}
}
