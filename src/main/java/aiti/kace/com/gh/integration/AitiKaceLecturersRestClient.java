package aiti.kace.com.gh.integration;



import aiti.kace.com.gh.integration.dto.LecturerProfile;

public interface AitiKaceLecturersRestClient {
	
	
	
	
	//  METHOD TO SAVE LECTURER
	public void saveLecturer(LecturerProfile addLecturer);
	
	
	
		
	// METHOD TO RETRIEVE ALL LECTURER
	public LecturerProfile[] findAllLecturers(LecturerProfile findAllLecturers);
	
	
	
	
	// RETRIEVE A SINGLE LECTURER RECORD
	public LecturerProfile findLecturerById(String findLecturerById);
	
	
	

	// METHOD TO UPDTAE LECTURER RECORD
	public void updateLecturer(LecturerProfile updateLecturer);
	

	
	// METHOD TO DELETE AN LECTURER RECORD
	public void deleteLecturer(String deleteLecturer);

}
