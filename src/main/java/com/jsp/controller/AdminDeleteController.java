package com.jsp.controller;

import com.jsp.libraryService.AdminService;

public class AdminDeleteController {
public static void main(String[] args) {
	
	AdminService adminService=new AdminService();
	adminService.deleteAdminById(1);
}
}
