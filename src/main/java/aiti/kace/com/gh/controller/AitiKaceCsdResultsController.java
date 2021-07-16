package aiti.kace.com.gh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import aiti.kace.com.gh.integration.AitiKaceCsdResultsRestClient;
import aiti.kace.com.gh.integration.dto.CsdResults;





@Controller
@RequestMapping("/aitiKaceCsdResultsApiConsumption")
public class AitiKaceCsdResultsController {
	
	
	
	
	@Autowired
	AitiKaceCsdResultsRestClient aitiKaceCsdResultsRestClient;
	
	
	
	
	
	
	
	
	
	

//  METHODS TO RETRIEVE ALL CSD RESULTS WITHOUT ACTIONS
	
@RequestMapping(value = "/getAllCsdResults=VIEW=ADMIN-JJD-DN-OSPS-PAGE-Jkdiso=dDFSFUJD-DNDNjfdhnd=dkdoeyrijfd-cnfsd", method = RequestMethod.GET)
public String getAllCsdResultsWithoutAction(CsdResults findAllCsdResults,  ModelMap modelMap) {
	
	
	CsdResults[] allAitiKaceCsdResultsObject = aitiKaceCsdResultsRestClient.findAllCsdResults(findAllCsdResults);
	modelMap.addAttribute("allAitiKaceCsdResults", allAitiKaceCsdResultsObject);
	
	return "";
	
	
}
	
	












	
//METHODS TO RETRIEVE ALL CSD RESULTS FOR ACTIONS(update, delete)

@RequestMapping(value = "/getAllCsdResultsForAction=JhThoso=kOgssR-VcGh-DN-OSPS-OpBv-kHTTT=JK-Yo=hDGD-Nod", method = RequestMethod.GET)
public String getAllCsdResultsForAction(CsdResults findAllCsdResults,  ModelMap modelMap) {


	CsdResults[] allAitiKaceCsdResultsObject = aitiKaceCsdResultsRestClient.findAllCsdResults(findAllCsdResults);
modelMap.addAttribute("allAitiKaceCsdResults", allAitiKaceCsdResultsObject);

return "";


}	
	
	
	
	
	
	
	
	
	




	
	
	
//  METHOD TO SAVE CSD RESULTS
@RequestMapping("/saveCsdResults=SaMEmE=HsuSGS-MlsjHS-DN-aDDF-Fdddde-sAmKoG=SmO-sLnINbds=LonCrshs-bBidbdd")
public String saveCsdResults(CsdResults saveCsdResults) {
	
	
	aitiKaceCsdResultsRestClient.saveCsdResults(saveCsdResults);
	
	return "redirect: ";
}
	
	
	
	
	
	










// METHOD TO RETRIEVE A SINGLE CSD RESULTS FOR UPDATING

@RequestMapping(value = "/getAitiKaceCsdResultsById=SaMEmE=HsuSGS-MlsjHS-DN-aDDF-Fdddde-sAmKoG=SmO-sLnINbds=LonCrshs-bBidbdd", method = RequestMethod.GET)
public String getCsdResultsById(@RequestParam("id") String findCsdResultById) {
	
	
	aitiKaceCsdResultsRestClient.findCsdResultById(findCsdResultById);
	
	return "";
	
}














// METHOD TO UPDTAE CSD RESULTS
@RequestMapping("/editAitiKaceCsdResults=VIEw=aLlsTudENTs-hBSIS=STUDENTS-GbsGhHS=PAGE-hGhgKg=VGSN=Vhanxjjj-hsdSBDSHNDHNNDH-Gh=yOPPJD")
public String updateCsdResults(CsdResults updateCsdResults) {
	
	
	aitiKaceCsdResultsRestClient.updateCsdResults(updateCsdResults);
	
	return "redirect: ";
}













// METHOD TO DELETE CSD RESULTS
@RequestMapping("/deleteCsdResults=VIEw=aLlAdmINs-hBSIS=adMIN-GbsGhHS=PAGE-hGhgKg=VGSN=Vhanxjjj-hsdSBDSHNDHNNDH-Gh=yOPPJD")
public String deleteCsdResults(@RequestParam("id") String deleteCsdResults) {
	
	
	aitiKaceCsdResultsRestClient.deleteCsdResults(deleteCsdResults);
	
	return "redirect: ";
}










}
