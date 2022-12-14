package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {
	public static void print(Map<String,Object> map) {
		ArrayList<EC> list=(ArrayList<EC>)map.get("list");
		System.out.println("------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t주문상품\t카드명\t카드번호\t결제금액");
		System.out.println("------------------------------------------------------");
		for(EC e : list) {
			System.out.println(e.getNo()+"\t"+e.getOrderDate()+"\t"+e.getProduct()
			+"\t"+e.getCardName()+"\t"+e.getCardNo()+"\t"+e.getPay());
		}
		System.out.println("------------------------------------------------------");
	}
	
	public static void main(String[] args) {
		Map<String,Object> map=new HashMap<>();
		List<EC> list=new ArrayList<>();
		list.add(new EC(1234,"2022-08-24","하이트맥주","삼성","37918123468",55900));
		list.add(new EC(2345,"2022-09-11","꼬깔콘","롯데","35691457845",23600));
		list.add(new EC(3456,"2022-10-29","노트북","현대","36160513782",2600000));
		map.put("list",list);
		print(map);
		
	}

}
