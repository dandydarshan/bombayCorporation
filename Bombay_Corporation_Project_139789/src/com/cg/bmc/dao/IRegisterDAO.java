package com.cg.bmc.dao;

import com.cg.bmc.bean.UserBean;
import com.cg.bmc.exception.FirmException;


public interface IRegisterDAO {

	int addDetails(UserBean userBean) throws FirmException;
	boolean activateAccount(String email) throws FirmException;
}
