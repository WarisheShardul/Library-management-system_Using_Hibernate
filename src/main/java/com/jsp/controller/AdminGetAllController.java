package com.jsp.controller;

import com.jsp.libraryService.AdminService;

public class AdminGetAllController {
public static void main(String[] args) {
	AdminService adminService=new AdminService();
	adminService.getAllAdmins();
}
}
