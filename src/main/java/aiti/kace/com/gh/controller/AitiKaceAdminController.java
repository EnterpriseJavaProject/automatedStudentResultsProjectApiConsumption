package aiti.kace.com.gh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import aiti.kace.com.gh.integration.AitiKaceAdminRestClient;
import aiti.kace.com.gh.integration.dto.AdminProfile;





@Controller
@RequestMapping("/aitiKaceAdminApiConsumption")
public class AitiKaceAdminController {
	
	
	
	
	@Autowired
	AitiKaceAdminRestClient aitiKaceAdminRestClient;
	
	
	
	
	
	
	
	
	
	
	
	//  ADMIN HOMEPAGE
//  METHODS TO RETRIEVE ALL ADMIN RECORDS WITHOUT ACTIONS
	
@RequestMapping(value = "/getAllAdminInfo=VIEW=ADMIN-JJD-DN-OSPS-PAGE-Jkdiso=dDFSFUJD-DNDNjfdhnd=dkdoeyrijfd-cnfsd", method = RequestMethod.GET)
public String getAllAdminInfoWithoutAction(AdminProfile addAdmin,  ModelMap modelMap) {
	
	
	AdminProfile[] allAitiKaceAdminObject = aitiKaceAdminRestClient.findAllAdmins(addAdmin);
	modelMap.addAttribute("allAitiKaceAdmin", allAitiKaceAdminObject);
	
	return "";
	
	
}
	
	












	
//METHODS TO RETRIEVE ALL ADMIN RECORDS FOR ACTIONS(update, delete)

@RequestMapping(value = "/getAllAdminsInfoForAction=JhThoso=kOgssR-VcGh-DN-OSPS-OpBv-kHTTT=JK-Yo=hDGD-Nod", method = RequestMethod.GET)
public String getAllAdminsInfoForAction(AdminProfile findAllAdmins,  ModelMap modelMap) {


	AdminProfile[] allAitiKaceAdminsObject = aitiKaceAdminRestClient.findAllAdmins(findAllAdmins);
modelMap.addAttribute("allAitiKaceAdmins", allAitiKaceAdminsObject);

return "";


}	
	
	
	
	
	
	
	
	
	




	
	
	
//  METHOD TO SAVE ADMIN INFO
@RequestMapping("/saveAdmin=SaMEmE=HsuSGS-MlsjHS-DN-aDDF-Fdddde-sAmKoG=SmO-sLnINbds=LonCrshs-bBidbdd")
public String saveAdmin(AdminProfile addAdmin) {
	
	
	aitiKaceAdminRestClient.saveAdmin(addAdmin);
	
	return "";
}
	
	
	
	
	
	










// METHOD TO RETRIEVE A SINGLE ADMIN INFO FOR UPDATE

@RequestMapping(value = "/getAitiKaceAdminById=SaMEmE=HsuSGS-MlsjHS-DN-aDDF-Fdddde-sAmKoG=SmO-sLnINbds=LonCrshs-bBidbdd", method = RequestMethod.GET)
public String getAdminById(@RequestParam("id") String findAdminInfoById) {
	
	
	aitiKaceAdminRestClient.findAdminInfoById(findAdminInfoById);
	
	return "";
	
}














// METHOD TO UPDTAE ADMIN INFO
@RequestMapping("/editAitiKaceAdminInfo=VIEw=aLlAdmINs-hBSIS=adMIN-GbsGhHS=PAGE-hGhgKg=VGSN=Vhanxjjj-hsdSBDSHNDHNNDH-Gh=yOPPJD")
public String updateAdmin(AdminProfile updateAdmin) {
	
	
	aitiKaceAdminRestClient.updateAdmin(updateAdmin);
	
	return "";
}













// METHOD TO DELETE ADMIN INFO
@RequestMapping("/deleteAdminInfo=VIEw=aLlAdmINs-hBSIS=adMIN-GbsGhHS=PAGE-hGhgKg=VGSN=Vhanxjjj-hsdSBDSHNDHNNDH-Gh=yOPPJD")
public String deleteAdmin(@RequestParam("id") String deleteAdmin) {
	
	
	aitiKaceAdminRestClient.deleteAdmin(deleteAdmin);
	
	return "";
}










}
