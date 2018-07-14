package com.vipulb.windmech.app.service;

import com.vipulb.windmech.app.beans.TraceUser;

public interface TraceUserService {

	public TraceUser getLoginDetails(String username, String password);
}
