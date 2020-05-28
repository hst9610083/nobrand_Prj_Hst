package com.min.edu.dto;

public class BikeDto {
	private String new_addr;	//대여소
	private String content_id; 	//대여소번호
	private String addr_gu;		//구분
	private int longitude; 		//경도
	private int cradle_count;	//거치대수
	private int latitude;		//위도
	private String content_nm;	//대여소명
	
	public BikeDto() {
	}

	public BikeDto(String new_addr, String content_id, String addr_gu, int longitude, int cradle_count, int latitude,
			String content_nm) {
		super();
		this.new_addr = new_addr;
		this.content_id = content_id;
		this.addr_gu = addr_gu;
		this.longitude = longitude;
		this.cradle_count = cradle_count;
		this.latitude = latitude;
		this.content_nm = content_nm;
	}

	public String getNew_addr() {
		return new_addr;
	}

	public void setNew_addr(String new_addr) {
		this.new_addr = new_addr;
	}

	public String getContent_id() {
		return content_id;
	}

	public void setContent_id(String content_id) {
		this.content_id = content_id;
	}

	public String getAddr_gu() {
		return addr_gu;
	}

	public void setAddr_gu(String addr_gu) {
		this.addr_gu = addr_gu;
	}

	public int getLongitude() {
		return longitude;
	}

	public void setLongitude(int longitude) {
		this.longitude = longitude;
	}

	public int getCradle_count() {
		return cradle_count;
	}

	public void setCradle_count(int cradle_count) {
		this.cradle_count = cradle_count;
	}

	public int getLatitude() {
		return latitude;
	}

	public void setLatitude(int latitude) {
		this.latitude = latitude;
	}

	public String getContent_nm() {
		return content_nm;
	}

	public void setContent_nm(String content_nm) {
		this.content_nm = content_nm;
	}

	@Override
	public String toString() {
		return "BikeDto [new_addr=" + new_addr + ", content_id=" + content_id + ", addr_gu=" + addr_gu + ", longitude="
				+ longitude + ", cradle_count=" + cradle_count + ", latitude=" + latitude + ", content_nm=" + content_nm
				+ "]";
	}
	
	
}
