package com.jsp.controller;

import com.jsp.libraryService.AdminService;

public class AdminLoginController {
public static void main(String[] args) {
	AdminService adminService=new AdminService();
boolean flag=adminService.validateAdmin(1, "neeraj23", "neeraj@26");
if(flag) {
	System.out.println("login successful");
}
else {
	System.out.println("Invalid Info");
}
}
}
