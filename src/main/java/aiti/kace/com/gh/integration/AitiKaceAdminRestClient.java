package aiti.kace.com.gh.integration;

import aiti.kace.com.gh.integration.dto.AdminProfile;

public interface AitiKaceAdminRestClient {
	
	
	
	
	//  METHOD TO SAVE ADMIN
	public void saveAdmin(AdminProfile addAdmin);
	
	
	
	
	// METHOD TO RETRIEVE A SINGLE ADMIN INFO FOR UPDATE
		public AdminProfile findAdminInfoById(String findAdminInfoById);
	
		
	
		
	// METHOD TO RETRIEVE ALL ADMINS
	public AdminProfile[] findAllAdmins(AdminProfile findAllAdmins);
	
	

	// METHOD TO UPDTAE ADMIN RECORD
	public void updateAdmin(AdminProfile updateAdmin);
	
	
	
	
	
	// METHOD TO DELETE AN ADMIN RECORD
	public void deleteAdmin(String deleteAdmin);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
