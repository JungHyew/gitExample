package ch14;

import java.util.ArrayList;
import java.util.List;

//ArrayList : Vector와 사용법이 비슷하지만 좀 더 가볍고 속도가 빠름

public class ListExam {
	public static void main(String[] args) {
		List<Object> list=new ArrayList<>(); //좌:부모(List),우:자식(ArrayList)=>다형성기법
		list.add("하나"); //리스트.add(추가할 값)
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.add(2, 4); //인덱스 자리 2번째에 4값을 넣는다 //리스트.add(인덱스,추가할 값)
		list.remove(3); //인덱스 자리 3번째 값을 삭제한다
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+"\t");
		}
	}

}
