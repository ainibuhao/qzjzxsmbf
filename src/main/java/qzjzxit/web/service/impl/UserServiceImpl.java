package qzjzxit.web.service.impl;


import java.util.List;

import qzjzxit.web.mybait.entity.User;


public interface UserServiceImpl {
	   int deleteByPrimaryKey(Integer id);

	    int insert(User record);

	    int insertSelective(User record);

	    User selectByPrimaryKey(Integer id);

	    int updateByPrimaryKeySelective(User record);

	    int updateByPrimaryKey(User record);

}
