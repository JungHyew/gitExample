package ch07;
//getter, setter를 안만들고 접근하는 기법
public class Student2 {
	//멤버변수 //Ctrl+a : 전체선택, Ctrl+i :정렬
	private String name;
	private String major; //전공
	private int year; //학년
	private String num; //학번
	private double point; //평점평균
	private int money; //등록금
	private int save; //장학금

	public void input(String name,String major,int year,String num,double point,int money) {
		//바로 위의 input의 변수들은 지역변수
		this.name=name; //멤버변수와 지역변수의 이름이 같을 경우에는 전역변수에 this.을 붙인다
		this.major=major;
		this.year=year;
		this.num=num;
		this.point=point;
		this.money=money;
		//장학금 계산(3.5이상 100만원, 4.0이상 250만원, 4.3이상 전액)
		if(point >= 4.3) {
			save=money; //변수이름이 다르므로 this. 안 붙여줘도 된다
		}else if(point >= 4.0){
			save=250;
		}else if(point >= 3.5) {
			save=100;
		}
	}
	public void print() {
		System.out.println("이름\t전공\t학년\t학번\t평점평균\t등록금\t장학금");
		System.out.println(name+"\t"+major+"\t"+year+"\t"+num+"\t"+point+"\t"+
		money+"\t"+save);
	}
	//개발자용 메소드
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", major=" + major + ", year=" + year + ", num=" + num + ", point=" + point
				+ ", money=" + money + ", save=" + save + "]";
	}

}
