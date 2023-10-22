package com.ny.makecan.db.user.service;

import java.util.List;

import com.ny.makecan.db.user.model.UserModel;

public interface UserService {

	public UserModel getByUserId(String userId);

	public List<UserModel> getList();

	public void add(UserModel user);

	public void set(UserModel user);

	public void removeByUserId(String userId);

}
