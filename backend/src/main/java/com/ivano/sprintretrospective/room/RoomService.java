package com.ivano.sprintretrospective.room;

import com.ivano.sprintretrospective.column.web.domain.Column;
import com.ivano.sprintretrospective.room.web.domain.Room;
import com.ivano.sprintretrospective.user.web.domain.User;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class RoomService
{
	/**
	 * A list of all currently opened rooms.
	 */
	private static final Map<UUID, Room> rooms = new HashMap<>();

	public Room createRoom(String roomName, User moderator)
	{
		List<Column> columns = new ArrayList<>();
		Room room = new Room(roomName, moderator, Collections.singletonList(moderator), columns);
		rooms.put(room.getId(), room);
		return room;
	}

	public void addUserToRoom(User user, UUID roomId) throws Exception
	{
		Room room = rooms.get(roomId);
		if (room == null)
		{
			throw new Exception("No room found with given roomId");
		}
		// TODO avoid adding same user more than one time
		room.getUsers().add(user);
	}
}
