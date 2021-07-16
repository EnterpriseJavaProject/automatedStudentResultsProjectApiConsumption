package aiti.kace.com.gh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import aiti.kace.com.gh.integration.AitiKaceLecturersRestClient;
import aiti.kace.com.gh.integration.dto.LecturerProfile;





@Controller
@RequestMapping("/aitiKaceLecturersApiConsumption")
public class AitiKaceLecturerController {
	
	
	
	
	@Autowired
	AitiKaceLecturersRestClient aitiKaceLecturersRestClient;
	
	
	
	
	
	
	
	
	

//  METHODS TO RETRIEVE ALL LECTURERS RECORDS WITHOUT ACTIONS
	
@RequestMapping(value = "/getAllLecturersInfoWithoutAction=VIEW=ADMIN-JJD-DN-OSPS-PAGE-Jkdiso=dDFSFUJD-DNDNjfdhnd=dkdoeyrijfd-cnfsd", method = RequestMethod.GET)
public String getAllLecturersInfoWithoutAction(LecturerProfile findAllLecturers,  ModelMap modelMap) {
	
	
	LecturerProfile[] allAitiKaceLecturesObject = aitiKaceLecturersRestClient.findAllLecturers(findAllLecturers);
	modelMap.addAttribute("allAitiKaceLecturers", allAitiKaceLecturesObject);
	
	return "";
	
	
}
	
	












	
//METHODS TO RETRIEVE ALL LECTURERS RECORDS FOR ACTIONS(update, delete)

@RequestMapping(value = "/getAllLecturersInfoForAction=JhThoso=kOgssR-VcGh-DN-OSPS-OpBv-kHTTT=JK-Yo=hDGD-Nod", method = RequestMethod.GET)
public String getAllLecturersInfoForAction(LecturerProfile findAllLecturers,  ModelMap modelMap) {


	LecturerProfile[] allAitiKaceLecturesObject = aitiKaceLecturersRestClient.findAllLecturers(findAllLecturers);
	modelMap.addAttribute("allAitiKaceLecturers", allAitiKaceLecturesObject);

return "";


}	
	
	
	
	
	
	
	
	
	




	
	
	
//  METHOD TO SAVE LECTURERS INFO
@RequestMapping("/saveLecturer=SaMEmE=HsuSGS-MlsjHS-DN-aDDF-Fdddde-sAmKoG=SmO-sLnINbds=LonCrshs-bBidbdd")
public String saveLecturer(LecturerProfile addLecturer) {
	
	
	aitiKaceLecturersRestClient.saveLecturer(addLecturer);
	
	return "redirect: ";
}
	
	
	
	
	
	










// METHOD TO RETRIEVE A SINGLE LECTURERS INFO FOR UPDATING

@RequestMapping(value = "/getAitiKaceLecturerById=SaMEmE=HsuSGS-MlsjHS-DN-aDDF-Fdddde-sAmKoG=SmO-sLnINbds=LonCrshs-bBidbdd", method = RequestMethod.GET)
public String getLecturerById(@RequestParam("id") String findLecturerById) {
	
	
	aitiKaceLecturersRestClient.findLecturerById(findLecturerById);
	
	return "";
	
}














// METHOD TO UPDTAE LECTURERS INFO
@RequestMapping("/editAitiKaceLecturerInfo=VIEw=aLlsTudENTs-hBSIS=STUDENTS-GbsGhHS=PAGE-hGhgKg=VGSN=Vhanxjjj-hsdSBDSHNDHNNDH-Gh=yOPPJD")
public String updateLecturer(LecturerProfile updateLecturer) {
	
	
	aitiKaceLecturersRestClient.updateLecturer(updateLecturer);
	
	return "redirect: ";
}













// METHOD TO DELETE LECTURERS INFO
@RequestMapping("/deleteLecturerInfo=VIEw=deLETeCtuRER-hBSIS=lEctUREr-GbsGhHS=PAGE-hGhgKg=VGSN=Vhanxjjj-hsdSBDSHNDHNNDH-Gh=yOPPJD")
public String deleteLecturer(@RequestParam("id") String deleteLecturer) {
	
	
	aitiKaceLecturersRestClient.deleteLecturer(deleteLecturer);
	
	return "redirect: ";
}










}
