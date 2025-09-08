package com.sm.DemoSpring14th;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Emp {
	@Value("#{flist}")
	private List<String> FriendList;

	public List<String> getFriendList() {
		return FriendList;
	}

	public void setFriendList(List<String> friendList) {
		FriendList = friendList;
	}
	

}
