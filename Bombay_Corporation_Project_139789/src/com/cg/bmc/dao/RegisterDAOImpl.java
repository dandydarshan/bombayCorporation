package com.cg.bmc.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.bmc.bean.UserBean;
import com.cg.bmc.exception.FirmException;
import com.cg.bmc.util.DBUtil;

public class RegisterDAOImpl implements IRegisterDAO{

	@Override
	public int addDetails(UserBean userBean) throws FirmException {
		int count=0;
		try {
			Connection con=DBUtil.obtainConnection();
			String query="INSERT INTO FIRMS_MASTER VALUES(seq_firm_master.NEXTVAL,?,?,?,?,'N')";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, userBean.getName());
			st.setString(2, userBean.getBusiness());
			st.setString(3, userBean.getEmail());
			st.setString(4, userBean.getPhone());
			count = st.executeUpdate();
			return count;
		} catch (SQLException e) {
			throw new FirmException("error while inserting values:"+e.getMessage());
		}
	}

	@Override
	public boolean activateAccount(String email) throws FirmException {
		boolean flag=false;
		try {
			Connection con=DBUtil.obtainConnection();
			String query="UPDATE FIRMS_MASTER SET isactive='Y' WHERE email=?";
			PreparedStatement st = con.prepareStatement(query);
			st.setString(1, email);
			int count = st.executeUpdate();
			if(count>0)
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		return flag;
		} catch (SQLException e) {
			throw new FirmException("error while updating status"+e.getMessage());
		}
	}

}
