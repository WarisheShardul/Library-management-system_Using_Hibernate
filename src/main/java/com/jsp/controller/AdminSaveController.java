package com.jsp.controller;

import com.jsp.libraryDto.Admin;
import com.jsp.libraryService.AdminService;

public class AdminSaveController {
public static void main(String[] args) {
	AdminService adminService=new AdminService();
	Admin admin=new Admin();
	admin.setName("neeraj");
	admin.setUsername("neeraj23");
	admin.setPassword("neeraj@26");
	
	adminService.savAdmin(admin);
}
}
