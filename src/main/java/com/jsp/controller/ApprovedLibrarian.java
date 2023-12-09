package com.jsp.controller;

import com.jsp.libraryService.AdminService;

public class ApprovedLibrarian {
public static void main(String[] args) {
	AdminService adminService=new AdminService();
	boolean res=adminService.approveLibrarianBId(1, 1);
	System.out.println(res);
}
}
