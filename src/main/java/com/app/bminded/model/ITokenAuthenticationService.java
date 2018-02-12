package com.app.bminded.model;

import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.userdetails.User;

public interface ITokenAuthenticationService {
	void login(HttpServletResponse response);
	//void addAuthentication(HttpServletResponse response, SessionUser user);
}
