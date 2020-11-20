package com.ivano.sprintretrospective.user.web.rest;

import lombok.Data;
import java.util.UUID;

@Data
public class CreateUserResponse
{
	/**
	 * The id of the created user.
	 */
	private final UUID userId;
}
