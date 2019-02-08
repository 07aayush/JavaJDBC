package com.bl.Service;

import com.bl.Dao.IUserDao;
import com.bl.Dao.UserDaoImpl;
import com.bl.Model.UserPojo;
//business logic
public class UserService {

	IUserDao userDao=new UserDaoImpl();
	public boolean getConn()
	{
		boolean flag=userDao.getConnection();
		return flag;
	}
	public boolean verifyUser(String email, String password) {

		boolean flag=userDao.getEmployee(email,password);
		return flag;
	}
	public boolean insert(UserPojo userDetail)
	{
		userDao.insertStudentInformation(userDetail);
		return true;
	}
	
	
}

