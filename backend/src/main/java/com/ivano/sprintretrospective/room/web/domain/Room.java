package com.ivano.sprintretrospective.room.web.domain;

import com.ivano.sprintretrospective.column.web.domain.Column;
import com.ivano.sprintretrospective.user.web.domain.User;
import lombok.*;
import java.util.List;
import java.util.UUID;

@Data
public class Room
{
	/**
	 * The id of the room.
	 */
	private final UUID id = UUID.randomUUID();

	private final String name;

	private final User moderator;

	private final List<User> users;

	private final List<Column> columns;
}
