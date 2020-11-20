package com.ivano.sprintretrospective.room.web.domain;

import com.ivano.sprintretrospective.column.web.domain.Column;
import com.ivano.sprintretrospective.user.web.domain.User;
import java.util.List;

public class Room
{
	String name;

	User moderator;

	List<User> users;

	List<Column> columns;
}
