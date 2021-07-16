package aiti.kace.com.gh.integration.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import aiti.kace.com.gh.integration.AitiKaceAdminRestClient;
import aiti.kace.com.gh.integration.dto.AdminProfile;

public class AitiKaceAdminRestClientImpl implements AitiKaceAdminRestClient {
	
	
	
	RestTemplate restTemplate = new RestTemplate();
	
	
	
	
	AdminProfile adminProfile = new AdminProfile();
	
	
	
	
	
	
	
	
	
	
	
	//  METHOD TO SAVE ADMIN

	@Override
	public void saveAdmin(AdminProfile addAdmin) {
		

		adminProfile.setId(addAdmin.getId());
		adminProfile.setName(addAdmin.getName());
		adminProfile.setEmail(addAdmin.getEmail());
		adminProfile.setPassword(addAdmin.getPassword());
		
		restTemplate.postForObject("http://localhost:9090/admin/saveAdmin", addAdmin, AdminProfile.class);

	}
	
	
	
	
	
	
	
	
	
	
	
	//   METHOD TO RETRIEVE ALL ADMIN INFO
	

	@Override
	public AdminProfile[] findAllAdmins(AdminProfile findAllAdmins) {
		
		
		AdminProfile[] retrieveAllAdmin = restTemplate.getForObject("http://localhost:9090/admin/getAllAdmin", AdminProfile[].class);

		return retrieveAllAdmin;
	}
	
	
	
	
	
	
	
	
	
//  METHOD TO RETRIEVE A SINGLE ADMIN FOR UPDATE

	@Override
	public AdminProfile findAdminInfoById(String findAdminInfoById) {
		
		
		AdminProfile RetrieveAdminInfoById = restTemplate.getForObject("http://localhost:9090/admin/getAsingleAdminInfo",  AdminProfile.class);
		
		return RetrieveAdminInfoById;
		
	}
	
	
	
	
	
	
	
	
	//    METHOD TO UPDATE AN ADMIN INFO
	
	

	@Override
	public void updateAdmin(AdminProfile updateAdmin) {

		
		Map<String, Long> params = new HashMap<String, Long>();
		params.put("id", updateAdmin.getId());
		
		restTemplate.put("http://localhost:9090/admin/updateAdmin", updateAdmin, params);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//   METHOD TO DELETE DELETE
	

	@Override
	public void deleteAdmin(String deleteAdmin) {

		restTemplate.delete("http://localhost:9090/admin/delete/" + deleteAdmin);

		
	}

}
