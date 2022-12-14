package ch09;

public class Employee {
	private int num; //사원번호
	public String name; //이름
	String address; //주소
	String email; //이메일주소
	protected int salary; //연봉
	private String rrn; //주민번호
	
	public Employee(int num,String name,String address,String email,int salary,String rrn) {
		this.num=num;
		this.name=name;
		this.address=address;
		this.email=email;
		this.salary=salary;
		this.rrn=rrn;
	}
	
	//getter, setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getRrn() {
		return rrn;
	}

	public void setRrn(String rrn) {
		this.rrn = rrn;
	}

	//개발자를 위한 디버깅용 메소드
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", address=" + address + ", email=" + email + ", salary="
				+ salary + ", rrn=" + rrn + "]";
	}
	
	
	
	
	
	 
	 



}
