package com.ivano.sprintretrospective.room.web.rest;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateRoomRequest
{
	private String roomName;

	private String userName;
}
