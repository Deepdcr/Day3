package layer3;

import java.util.ArrayList;

import layer2.Friend;

public interface FrienDAO {

	
		void 			  insertFriend(Friend friend);
		void 			  updateFriend(Friend friend);
		void 			  deleteFriend(int friendId);
		Friend 			  selectFriend(int friendId);
		ArrayList<Friend> selectAllFriends();
}
