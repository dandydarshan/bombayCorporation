package com.cg.bmc.service;

import com.cg.bmc.bean.UserBean;
import com.cg.bmc.dao.IRegisterDAO;
import com.cg.bmc.dao.RegisterDAOImpl;
import com.cg.bmc.exception.FirmException;


public class RegisterServiceImpl implements IRegisterService{

	@Override
	public int addDetails(UserBean userBean) throws FirmException {
		IRegisterDAO iRegisterDAO=new RegisterDAOImpl();
		int flag=iRegisterDAO.addDetails(userBean);
		return flag;
	}

	@Override
	public boolean activateAccount(String email) throws FirmException {
		IRegisterDAO iRegisterDAO=new RegisterDAOImpl();
		boolean flag=iRegisterDAO.activateAccount(email);
		return flag;
	}

}
