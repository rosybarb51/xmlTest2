package com.bitc.xml.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="body")
public class ParmacyFullDataBodyDto {

	private int numOfRows;
	private int pageNo;
	private int totalCount;
//	items 는 클래스 타입이 따로 있으니까, 그걸 적어준다.
	private ParmacyFullDataItemsDto items;
	
	@XmlElement
	public int getNumOfRows() {
		return numOfRows;
	}
	
	public void setNumOfRows(int numOfRows) {
		this.numOfRows = numOfRows;
	}
	
	public int getPageNo() {
		return pageNo;
	}
	
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
	public int getTotalCount() {
		return totalCount;
	}
	
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
//	우리가 만들어준 클래스는 이름이 클래스의 이름과 xml에 들어간 이름과 달라서, 얘는 실제 이름을 적어줘야한다.
	@XmlElement(name="items")
	public ParmacyFullDataItemsDto getItems() {
		return items;
	}
	
	public void setItems(ParmacyFullDataItemsDto items) {
		this.items = items;
	} 
	
	
}
