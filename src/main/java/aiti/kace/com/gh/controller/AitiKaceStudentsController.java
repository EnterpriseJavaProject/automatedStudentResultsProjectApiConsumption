package aiti.kace.com.gh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import aiti.kace.com.gh.integration.AitiKaceStudentsRestClient;
import aiti.kace.com.gh.integration.dto.StudentProfile;



@Controller
@RequestMapping("/aitiKaceStudentsApiConsumption")
public class AitiKaceStudentsController {
	
	
	
	
	@Autowired
	AitiKaceStudentsRestClient aitiKaceStudentsRestClient;
	
	
	
	
	
	
	
	
	
	
	
	//  ADMIN HOMEPAGE
//  METHODS TO RETRIEVE ALL STUDENT RECORDS WITHOUT ACTIONS
	
@RequestMapping(value = "/getAllStudentInfo=VIEW=ADMIN-JJD-DN-OSPS-PAGE-Jkdiso=dDFSFUJD-DNDNjfdhnd=dkdoeyrijfd-cnfsd", method = RequestMethod.GET)
public String getAllStudentsInfoWithoutAction(StudentProfile findAllStudentInfos,  ModelMap modelMap) {
	
	
	StudentProfile[] allAitiKaceStudentsObject = aitiKaceStudentsRestClient.findAllStudentInfos(findAllStudentInfos);
	modelMap.addAttribute("allAitiKaceStudents", allAitiKaceStudentsObject);
	
	return "";
	
	
}
	
	












	
//METHODS TO RETRIEVE ALL STUDENT RECORDS FOR ACTIONS(update, delete)

@RequestMapping(value = "/getAllStudentsInfoForAction=JhThoso=kOgssR-VcGh-DN-OSPS-OpBv-kHTTT=JK-Yo=hDGD-Nod", method = RequestMethod.GET)
public String getAllStudentsInfoForAction(StudentProfile findAllStudentInfos,  ModelMap modelMap) {


StudentProfile[] allAitiKaceStudentsObject = aitiKaceStudentsRestClient.findAllStudentInfos(findAllStudentInfos);
modelMap.addAttribute("allAitiKaceStudents", allAitiKaceStudentsObject);

return "";


}	
	
	
	
	
	
	
	
	
	




	
	
	
//  METHOD TO SAVE STUDENT INFO
@RequestMapping("/saveCsd1_1Student=SaMEmE=HsuSGS-MlsjHS-DN-aDDF-Fdddde-sAmKoG=SmO-sLnINbds=LonCrshs-bBidbdd")
public String saveCsd1_1Student(StudentProfile addStudentInfo) {
	
	
	aitiKaceStudentsRestClient.saveStudentInfo(addStudentInfo);
	
	return "redirect: getCsd1_1ResultPage=VIEw=CSD1.1JJD-DN=STUDENTS-Ndgddh=RESULTS=ios-PAGE-AN-bdb=nnIh-BsPbV=dkdoeyrijfd-cnfs";
}
	
	
	
	
	
	










// METHOD TO RETRIEVE A SINGLE STUDENT INFO FOR UPDATING

@RequestMapping(value = "/getAitiKaceStudentById=SaMEmE=HsuSGS-MlsjHS-DN-aDDF-Fdddde-sAmKoG=SmO-sLnINbds=LonCrshs-bBidbdd", method = RequestMethod.GET)
public String getCsd1_7StudentById(@RequestParam("id") String findStudentInfoById) {
	
	
	aitiKaceStudentsRestClient.findStudentInfoById(findStudentInfoById);
	
	return "";
	
}














// METHOD TO UPDTAE STUDENT INFO
@RequestMapping("/editAitiKaceStudentInfo=VIEw=aLlsTudENTs-hBSIS=STUDENTS-GbsGhHS=PAGE-hGhgKg=VGSN=Vhanxjjj-hsdSBDSHNDHNNDH-Gh=yOPPJD")
public String updateCsd1_1Student(StudentProfile updateStudentInfo) {
	
	
	aitiKaceStudentsRestClient.updateStudentInfo(updateStudentInfo);
	
	return "redirect: getCsd1_1Page=VIEw=CSD1.1-JJD-DN=STUDENTS-Hjdi=OSPS-PAGE-Jkdiso=dDFSFUJD-DNDNjfdhnd=dkdoeyrijfd-cnfs";
}













// METHOD TO DELETE STUDENT INFO
@RequestMapping("/deleteCsd1_1StudentInfo")
public String deleteCsd1_1Student(@RequestParam("id") String deleteStudentInfo) {
	
	
	aitiKaceStudentsRestClient.deleteStudentInfo(deleteStudentInfo);
	
	return "redirect: getCsd1_1Page=VIEw=CSD1.1-JJD-DN=STUDENTS-Hjdi=OSPS-PAGE-Jkdiso=dDFSFUJD-DNDNjfdhnd=dkdoeyrijfd-cnfs";
}










}
