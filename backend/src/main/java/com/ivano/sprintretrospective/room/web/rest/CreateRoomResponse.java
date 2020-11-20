package com.ivano.sprintretrospective.room.web.rest;

import lombok.Data;
import java.util.UUID;

@Data
public class CreateRoomResponse
{
	private final UUID roomId;
}
