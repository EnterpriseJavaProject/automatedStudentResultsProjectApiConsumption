package aiti.kace.com.gh.integration.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import aiti.kace.com.gh.integration.AitiKaceStudentsRestClient;
import aiti.kace.com.gh.integration.dto.StudentProfile;

public class AitiKaceStudentsRestClientImpl implements AitiKaceStudentsRestClient {
	
	
	
	
	
	RestTemplate restTemplate = new RestTemplate();
	
	
	
	
	StudentProfile studentProfile = new StudentProfile();
	
	
	
	
	
	
	
	
	
	
	//  METHOD TO SAVE STUDENT INFO

	@Override
	public void saveStudentInfo(StudentProfile addStudentInfo) {
		
		studentProfile.setId(addStudentInfo.getId());
		studentProfile.setStudent_id(addStudentInfo.getStudent_id());
		studentProfile.setStudent_name(addStudentInfo.getStudent_name());
		studentProfile.setAddress(addStudentInfo.getAddress());
		studentProfile.setCourse(addStudentInfo.getCourse());
		studentProfile.setCourse_level(addStudentInfo.getCourse_level());
		studentProfile.setDate_of_birth(addStudentInfo.getDate_of_birth());
		studentProfile.setEmail(addStudentInfo.getEmail());
		studentProfile.setGender(addStudentInfo.getGender());
		studentProfile.setPhone(addStudentInfo.getPhone());
		studentProfile.setCourse_start_date(addStudentInfo.getCourse_start_date());
		studentProfile.setCourse_end_date(addStudentInfo.getCourse_end_date());
		studentProfile.setDate_of_issue(addStudentInfo.getDate_of_issue());
		studentProfile.setReg_date(addStudentInfo.getReg_date());
		studentProfile.setUpdate_time(addStudentInfo.getUpdate_time());
		
		
		restTemplate.postForObject("http://localhost:9090/student/saveStudent", addStudentInfo, StudentProfile.class);

		
	}

	
	
	
	
	
	
	
	
	// METHOD TO RETRIEVE ALL STUDENT INFOS
	
	@Override
	public StudentProfile[] findAllStudentInfos(StudentProfile findAllStudentInfos) {
		
		StudentProfile[] RetrieveAllCsdStudentResults = restTemplate.getForObject("http://localhost:9090/student/getAllStudent",  StudentProfile[].class);
		
		return RetrieveAllCsdStudentResults;
	}

	
	
	
	
	
	
	
	
	
	
	// RETRIEVE A SINGLE STUDENT INFO
	
	@Override
	public StudentProfile findStudentInfoById(String findStudentInfoById) {
		
		StudentProfile RetrieveStudentInfoById = restTemplate.getForObject("http://localhost:9090/student/getAsingleStudentInfo",  StudentProfile.class);
		
		return RetrieveStudentInfoById;
	}

	
	
	
	
	
	
	
	
	
	
	// METHOD TO UPDTAE LSTUDENT INFO
	
	@Override
	public void updateStudentInfo(StudentProfile updateStudentInfo) {
		
		
		Map<String, Long> params = new HashMap<String, Long>();
		params.put("id", updateStudentInfo.getId());
		
		restTemplate.put("http://localhost:9090/student/updateStudent", updateStudentInfo, params);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	// METHOD TO DELETE STUDENT INFO

	@Override
	public void deleteStudentInfo(String deleteStudentInfo) {
		
		
		restTemplate.delete("http://localhost:9090/student/delete/" + deleteStudentInfo);
		
	}

	
	
	
	
	
}
