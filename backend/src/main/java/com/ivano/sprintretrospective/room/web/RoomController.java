package com.ivano.sprintretrospective.room.web;

import com.ivano.sprintretrospective.room.RoomService;
import com.ivano.sprintretrospective.room.web.domain.Room;
import com.ivano.sprintretrospective.room.web.rest.CreateRoomRequest;
import com.ivano.sprintretrospective.room.web.rest.CreateRoomResponse;
import com.ivano.sprintretrospective.user.UserService;
import com.ivano.sprintretrospective.user.web.domain.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/room")
@RequiredArgsConstructor
public class RoomController
{
	private final RoomService roomService;

	private final UserService userService;

	@PostMapping
	public CreateRoomResponse createRoom(@RequestBody CreateRoomRequest request)
	{
		User moderator = userService.createUser(request.getUserName());
		Room room = roomService.createRoom(request.getRoomName(), moderator);
		return new CreateRoomResponse(room.getId());
	}
}
