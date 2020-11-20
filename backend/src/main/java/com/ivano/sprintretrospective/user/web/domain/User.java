package com.ivano.sprintretrospective.user.web.domain;

import lombok.Data;
import java.util.UUID;

@Data
public class User
{
	/**
	 * The id of the user.
	 */
	private final UUID id = UUID.randomUUID();

	private final String name;
}
