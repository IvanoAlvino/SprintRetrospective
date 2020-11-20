package com.ivano.sprintretrospective.user.web.rest;

import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@NoArgsConstructor
public class CreateUserRequest
{
	private String userName;

	private UUID roomId;
}
