package aiti.kace.com.gh.integration;


import aiti.kace.com.gh.integration.dto.StudentProfile;

public interface AitiKaceStudentsRestClient {
	
	
	
	//  METHOD TO SAVE STUDENT INFO
	public void saveStudentInfo(StudentProfile addStudentInfo);
	
	
	
		
	// METHOD TO RETRIEVE ALL STUDENT INFOS
	public StudentProfile[] findAllStudentInfos(StudentProfile findAllStudentInfos);
	
	
	
	
	// RETRIEVE A SINGLE STUDENT INFO
	public StudentProfile findStudentInfoById(String findStudentInfoById);
	
	
	

	// METHOD TO UPDTAE STUDENT INFO
	public void updateStudentInfo(StudentProfile updateStudentInfo);
	

	
	// METHOD TO DELETE STUDENT INFO
	public void deleteStudentInfo(String deleteStudentInfo);
	
	
	
	
	
	
	
	
	
	
	
	
	

}
