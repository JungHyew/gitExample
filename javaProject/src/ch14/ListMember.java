package ch14;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		//ArrayList<클래스객체> - <Object>대신 만들어 놓은 Member객체를 제너릭하면
		//Member에서만 쓰이는 모든 자료형을 받을 준비가 가능해짐
		//ArrayList<클래스객체>에서 클래스객체는 생략가능
		List<Member>list=new ArrayList<>(); //다형성기법
		//Member에는 String 타입만 있으므로 String 타입이 된다
		
		//방법1) Member 인스턴스 생성 후 setter를 활용
		Member m1=new Member();
		m1.setName("김철수");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-1234-5678");
		m1.setEmail("kim@naver.com");
		
		//List에 Member 인스턴스를 추가
		list.add(m1); //ArrayList에 Member객체를 1개 추가
		System.out.println(list.size());
		
		//방법2) setter를 안쓰고 생성자(매개변수)를 활용
		Member m2=new Member("hong","1234","홍길동","02-222-3333","hong@nate.com");
		list.add(m2); //ArrayList에 Member 객체를 또 1개 추가
		System.out.println(list.size());
		
		//방법3) 참조변수를 재사용 안하고 한번만 데이터를 사용하고 말거라면
		list.add(new Member("choi","1234","최철수","02-111-3333","choi@nate.com"));
		System.out.println(list.size());
		
		System.out.println("이름\t아이디\t비번\t전화번호\t이메일");
		for(int i=0; i<list.size(); i++) {
			Member m=list.get(i); //여기서 m은 ArrayList의 각 데이터를 가리킬 임시 참조변수로 활용
			System.out.println(m.getName()+"\t"+m.getUserid()+"\t"+m.getPasswd()
			+"\t"+m.getTel()+"\t"+m.getEmail());
		}
	}

}
