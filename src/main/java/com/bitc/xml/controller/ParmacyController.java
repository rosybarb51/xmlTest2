package com.bitc.xml.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bitc.xml.dto.ParmacyFullDataItemDto;
import com.bitc.xml.service.PharmacyService;

@Controller
public class ParmacyController {
	@Autowired
	private PharmacyService pharmacyService;
	
	@RequestMapping(value="/parmacy/fullData", method=RequestMethod.GET)
	public ModelAndView getFullData() throws Exception {
		ModelAndView mv = new ModelAndView("/parmacy/fullData");
		
//		pharmacyService 사용하기 위해서 @Autowired 해줘야한다.
//		실행하면 itemlist가 넘어오고, 그것을 아래에서 mv에 parmacyDatas 이름으로 넣어줘서 html에서 타임리프로 불러서 사용할 수 있다. 
		List<ParmacyFullDataItemDto> itemList = pharmacyService.getItemList();
		
		mv.addObject("parmacyDatas", itemList);
		
		return mv;
	}
}
