package com.moviebs.service;

import com.moviebs.dto.AdminDTO;
import com.moviebs.model.Admin;

public interface AdminService {

	AdminDTO saveAdmin(Admin admin);
	Admin login(Object object, Object object2);
	Admin login(String userName, String password);
}