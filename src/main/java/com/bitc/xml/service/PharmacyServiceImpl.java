package com.bitc.xml.service;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.springframework.stereotype.Service;

import com.bitc.xml.dto.ParmacyFullDataBodyDto;
import com.bitc.xml.dto.ParmacyFullDataDto;
import com.bitc.xml.dto.ParmacyFullDataItemDto;
import com.bitc.xml.dto.ParmacyFullDataItemsDto;

@Service
public class PharmacyServiceImpl implements PharmacyService{

	@Override
	public List<ParmacyFullDataItemDto> getItemList() throws Exception {
//		컨트롤러에서 만들었던 소스 가져오기
		
//		Jaxb 라이브러리 로드
//		JAXB 라이브러리를 사용하여 xml 데이터를 파싱할 부분
//		괄호 안에 우리가 파싱할 dto 중 가장 큰 dto를 적어준다. 우리는 response 태그가 가장 큰데, 그 요소의 dto 파일을 ParmacyFullDataDto 와 같이 만들어줌.
		JAXBContext jc = JAXBContext.newInstance(ParmacyFullDataDto.class);
//		언마샬 사용 준비
		Unmarshaller um = jc.createUnmarshaller();
		
//		실제 xml 데이터 파일을 로드하여 jaxb 라이브러리로 언마샬 실행
//		File 은 java.io 로 import
		ParmacyFullDataDto fullData = (ParmacyFullDataDto)um.unmarshal(new File("c://java102//pharmacyFullData.xml"));
		
		
//		방법1))
//		items 가진 body에서 getBody하고, item 가진 items 에서 getItems하고, 또 그안의 item을 사용하기 위해서 getItemList함
//		아래의 방법2)) 처럼 네가지 문장을 적을 필요 없이, 이 방법1 처럼 한 문장에 다 적으면, 메모리 낭비가 덜해서 좋다. 
//		List<ParmacyFullDataItemDto> itemList = fullData.getBody().getItems().getItemList();
		
//		방법2))
//		위의 fullData에 이미 파싱이 다 돼있는 상태임, 아래는 과정을 보여주기 위해서 하나하나 따로 한 것임.
//		header 부분 우리 필요없어서 안 썼음, 그래서 주석처리함.
//		ParmacyFullDataHeaderDto header = fullData.getHeader();
		ParmacyFullDataBodyDto body = fullData.getBody();
		
//		items 에 대한 정보는 body가 다들고 있어서 body.getItems()로 불러옴, 근데 사실 이건 크게 의미없다
		ParmacyFullDataItemsDto items = body.getItems();
		List<ParmacyFullDataItemDto> itemList = items.getItemList();
		
		
		return itemList;
	}
}
