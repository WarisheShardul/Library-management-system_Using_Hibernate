package com.jsp.controller;

import com.jsp.libraryService.AdminService;

public class AdminGetController {
public static void main(String[] args) {
	AdminService adminService=new AdminService();
	adminService.getAdminById(2);
}
}
