package com.bitc.xml.service;

import java.util.List;

import com.bitc.xml.dto.ParmacyFullDataItemDto;

public interface PharmacyService {

//	우리가 필요한 것이 결국 item 부분이라서, 그 부분 가져온다.
//	우리가 getItemList 쓰면 구현체(Impl)에서 파싱해서 우리에게 아이템 가져다주게 만들것임.
	List<ParmacyFullDataItemDto> getItemList() throws Exception;
}
