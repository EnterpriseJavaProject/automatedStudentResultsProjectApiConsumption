package aiti.kace.com.gh.integration;


import aiti.kace.com.gh.integration.dto.CsdResults;

public interface AitiKaceCsdResultsRestClient {
	
	
	
	//  METHOD TO SAVE CSD STUDENT RESULTS
	public void saveCsdResults(CsdResults saveCsdResults);
	
	
	
	
	// METHOD TO RETRIEVE A SINGLE CSD STUDENT ID
	public CsdResults findcsdStudentId(CsdResults findcsdStudentId);
	
	
	
		
	// METHOD TO RETRIEVE ALL CSD STUDENT RESULTS
	public CsdResults[] findAllCsdResults(CsdResults findAllCsdResults);
	
	
	
	
	
	
	// RETRIEVE SINGLE CSD STUDENT RESULT
	public CsdResults findCsdResultById(String findCsdResultById);
	
	

	// METHOD TO UPDTAE CSD STUDENT RESULTS
	public void updateCsdResults(CsdResults updateCsdResults);
	
	
	
	
	
	// METHOD TO DELETE CSD STUDENT RESULTS
	public void deleteCsdResults(String deleteCsdResults);
	
	
	
	
	

}
