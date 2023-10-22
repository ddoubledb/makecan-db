package com.ny.makecan.db.user.service.rds;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ny.makecan.db.user.mapper.UserMapper;
import com.ny.makecan.db.user.model.UserModel;
import com.ny.makecan.db.user.service.UserService;

@Service("userServiceRds")
public class UserServiceRds implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public UserModel getByUserId(String userId) {
		return userMapper.selectByUserId(userId);
	}

	@Override
	public List<UserModel> getList() {
		return userMapper.selectList();
	}

	@Override
	public void add(UserModel user) {
		userMapper.insert(user);
	}

	@Override
	public void set(UserModel user) {
		userMapper.update(user);
	}

	@Override
	public void removeByUserId(String userId) {
		userMapper.deleteByUserId(userId);
	}

}
