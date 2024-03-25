package com.board.users.mapper;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.board.users.domain.UserVo;

@Mapper
public interface UserMapper {
	List<UserVo> getUserList();
	void insertUser(UserVo userVo);
	HashMap<String, Object> getUser(UserVo userVo);
	HashMap<String, Object> getUser(String user_id);
	void updateUser(UserVo userVo);
	void deleteUser(UserVo userVo);
}
