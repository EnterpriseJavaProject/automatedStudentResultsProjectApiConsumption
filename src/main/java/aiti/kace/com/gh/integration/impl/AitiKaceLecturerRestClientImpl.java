package aiti.kace.com.gh.integration.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import aiti.kace.com.gh.integration.AitiKaceLecturersRestClient;
import aiti.kace.com.gh.integration.dto.LecturerProfile;


public class AitiKaceLecturerRestClientImpl implements AitiKaceLecturersRestClient {
	
	
	
	RestTemplate restTemplate = new RestTemplate();
	
	
	
	
	LecturerProfile csdResults = new LecturerProfile();
	
	
	
	
	
	
	
	
	
	
	
//  METHOD TO SAVE LECTURER

	@Override
	public void saveLecturer(LecturerProfile addLecturer) {
		
		csdResults.setId(addLecturer.getId());
		csdResults.setName(addLecturer.getName());
		csdResults.setEmail(addLecturer.getEmail());
		csdResults.setPhone(addLecturer.getPhone());
		csdResults.setPassword(addLecturer.getPassword());
		
		
		restTemplate.postForObject("http://localhost:9090/lecturer/saveLecturer", addLecturer, LecturerProfile.class);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// METHOD TO RETRIEVE ALL LECTURER

	@Override
	public LecturerProfile[] findAllLecturers(LecturerProfile findAllLecturers) {
		
		
		LecturerProfile[] RetrieveAllLecturers = restTemplate.getForObject("http://localhost:9090/lecturer/getAllLecturer",  LecturerProfile[].class);
		
		return RetrieveAllLecturers;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	// RETRIEVE A SINGLE LECTURER RECORD
	
	@Override
	public LecturerProfile findLecturerById(String findLecturerById) {
		
		
		LecturerProfile findLecturerByIdRetrival = restTemplate.getForObject("http://localhost:9090/lecturer/getASinglelLecturer",  LecturerProfile.class);
		
		return findLecturerByIdRetrival;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// METHOD TO UPDTAE LECTURER RECORD

	@Override
	public void updateLecturer(LecturerProfile updateLecturer) {
		
		
		Map<String, Long> params = new HashMap<String, Long>();
		params.put("id", updateLecturer.getId());
		
		restTemplate.put("http://localhost:9090/lecturer/updateLecturer", updateLecturer, params);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// METHOD TO DELETE AN LECTURER RECORD

	@Override
	public void deleteLecturer(String deleteLecturer) {
		
		restTemplate.delete("http://localhost:9090/lecturer/delete/" + deleteLecturer);
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
}
