package com.ny.makecan.db.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ny.makecan.db.user.model.UserModel;

@Mapper
public interface UserMapper {

	public UserModel selectByUserId(String userId);

	public List<UserModel> selectList();

	public void insert(UserModel user);

	public void update(UserModel user);

	public void deleteByUserId(String userId);

}
