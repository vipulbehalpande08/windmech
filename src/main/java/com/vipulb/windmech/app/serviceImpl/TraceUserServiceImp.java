package com.vipulb.windmech.app.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vipulb.windmech.app.beans.TraceUser;
import com.vipulb.windmech.app.dao.TraceUserDao;
import com.vipulb.windmech.app.service.TraceUserService;

@Service
public class TraceUserServiceImp implements TraceUserService{

	private TraceUser user = null;
	@Autowired
	private TraceUserDao traceUserDao;
	
	@Override
	public TraceUser getLoginDetails(String username, String password) {
		user  = traceUserDao.getLoginDetails(username);
		if(user != null)	
			{ 
			  if(user.getPassword() != null && user.getPassword().equalsIgnoreCase(password))
				  return user;
			  else
				  return new TraceUser();
			}
		else		
			return user;
	}

}
