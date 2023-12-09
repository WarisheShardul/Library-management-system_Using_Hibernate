package com.jsp.libraryService;

import java.util.List;

import com.jsp.libraryDao.AdminDao;
import com.jsp.libraryDao.LibrarianDao;
import com.jsp.libraryDto.Admin;
import com.jsp.libraryDto.Librarian;

public class AdminService {
	
AdminDao adminDao=new AdminDao();
LibrarianDao librarianDao=new LibrarianDao();

public boolean validateAdmin(int id, String loginusername, String loginpassword) {
	Admin admin=adminDao.getAdminById(id);
	if(admin.getUsername().equals(loginusername)&& admin.getPassword().equals(loginpassword)) {
		return true;
	}
	else {
		return false;
	}
}

public void viewAllunauthorisedLibrarians() {
	
}

public Admin savAdmin(Admin admin) {
	return adminDao.saveAdmin(admin);
}
 
public Admin deleteAdminById(int id) {
	return adminDao.deleteAdminById(id);
}

public Admin updateUsernameById(int id,String newpassword) {
	return adminDao.updateUsernameById(id, newpassword);
}

public Admin updatePasswordById(int id,String newpassword) {
return adminDao.updatePasswordById(id, newpassword);
}

public Admin getAdminById(int id) {
	return adminDao.getAdminById(id);
}

public List<Admin> getAllAdmins(){
return adminDao.getAllAdmins();
}

public boolean approveLibrarianBId(int libid, int adminid) {
	Librarian librarian=librarianDao.getLibrarianById(adminid);
	Admin admin=adminDao.getAdminById(adminid);
	if(librarian!=null && admin!=null) {
		librarian.setStatus("Approved");
		librarian.setAdmin(admin);
		return librarianDao.approve(librarian);
	}
	return false;
}
}


































