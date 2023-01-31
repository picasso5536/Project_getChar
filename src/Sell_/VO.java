package Sell_;

// VO(Values Object),DTO
public class VO {
	// DB 컬럼명과 같은 변수 생성
	// 나중에 알아서 해당 변수에 값이 저장됨
	private String custid, name, address, phone;

	public VO() {
		
	}
	
	public VO(String custid, String name, String address, String phone) {
		this.custid = custid;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
}
