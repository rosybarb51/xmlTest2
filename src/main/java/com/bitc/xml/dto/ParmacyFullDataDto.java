package com.bitc.xml.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="response")
public class ParmacyFullDataDto {

	private ParmacyFullDataHeaderDto header;
	private ParmacyFullDataBodyDto body;
	
	@XmlElement(name="header")
	public ParmacyFullDataHeaderDto getHeader() {
		return header;
	}
	
	public void setHeader(ParmacyFullDataHeaderDto header) {
		this.header = header;
	}
	
	@XmlElement(name="body")
	public ParmacyFullDataBodyDto getBody() {
		return body;
	}
	
	public void setBody(ParmacyFullDataBodyDto body) {
		this.body = body;
	}
	
}
