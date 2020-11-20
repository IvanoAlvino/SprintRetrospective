package com.ivano.sprintretrospective.room;

import com.ivano.sprintretrospective.column.web.domain.Column;
import com.ivano.sprintretrospective.room.web.domain.Room;
import com.ivano.sprintretrospective.user.web.domain.User;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class RoomService
{
	public Room createRoom(String roomName, User moderator)
	{
		List<Column> columns = new ArrayList<>();
		return new Room(roomName, moderator, Collections.singletonList(moderator), columns);
	}
}
