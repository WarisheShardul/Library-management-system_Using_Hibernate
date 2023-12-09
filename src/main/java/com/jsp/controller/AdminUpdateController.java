package com.jsp.controller;

import com.jsp.libraryService.AdminService;

public class AdminUpdateController {
public static void main(String[] args) {
	AdminService adminService=new AdminService();
adminService.updateUsernameById(2, "harsh");
}
}
