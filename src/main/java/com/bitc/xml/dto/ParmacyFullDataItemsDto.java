package com.bitc.xml.dto;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="items")
public class ParmacyFullDataItemsDto {

//	멤버변수니까 private 선언
//	xml 파일에서 items 밑에 item 이 여러 개니까 List 사용
	private List<ParmacyFullDataItemDto> itemList;

//	ParmacyFullDataItemDto 는 루트이면서, 그냥 Element 이기도 하니까 이름 적어줘야한다.
	@XmlElement(name="item")
	public List<ParmacyFullDataItemDto> getItemList() {
		return itemList;
	}

	public void setItemList(List<ParmacyFullDataItemDto> itemList) {
		this.itemList = itemList;
	}
}
