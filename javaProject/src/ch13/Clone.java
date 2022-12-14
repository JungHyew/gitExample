package ch13;

//인스턴스를 복제하려면 Cloneable 인터페이스를 구현해야함
public class Clone implements Cloneable {
	int num=10;
	void print() {
		System.out.println(num);
	}
	public static void main(String[] args) {
		Clone t1=new Clone();
		Clone t2=null; //선언만 하고 주소값은 없다(초기화시킴)
		try { //예외(에러)가 발생할만한 가능성이 있는 코드 처리
			t2=(Clone)t1.clone(); //인스턴스를 복제함, Object의 메소드이기 때문에 좌변과 우변의
			//데이터 타입 맞추기 위해 (Clone) 형변환 해야한다
			
		} catch (CloneNotSupportedException e) { //예외가 발생한 시점에서 처리(예외 발생하면 catch문에서 처리)
			e.printStackTrace(); //개발자를 위한 디버깅 정보 제공 용도의 메소드
		}
		System.out.println(t1);
		System.out.println(t2);
		t1.print();
		t2.print();
	}

}
