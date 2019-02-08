package com.bl.Dao;
import com.bl.Model.UserPojo;

public interface IUserDao {

	public boolean getConnection();
	public boolean getEmployee(String email, String password);
	public boolean insertStudentInformation(UserPojo userDetail);

}
