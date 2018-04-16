package com.cg.bmc.service;

import com.cg.bmc.bean.UserBean;
import com.cg.bmc.exception.FirmException;


public interface IRegisterService {
	int addDetails(UserBean userBean) throws FirmException;
	boolean activateAccount(String email) throws FirmException;
}
