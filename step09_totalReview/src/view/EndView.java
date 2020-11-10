
package view;

import sale.domain.Cosmetic;
import sale.domain.Customer;

import java.util.ArrayList;

public class EndView {
	//객체 받아서 출력만 담당
	public static void printCosmetics(Cosmetic[] cosmetic) {
		for (int i = 0; i< cosmetic.length; i++) {
			System.out.println("화장품: " + cosmetic[i].getCosmetic() + " / " + "피부타입 : " + cosmetic[i].getSkin_type() + " / " + "가격 : " + cosmetic[i].getCosmetic_price() + "원");
		}
	}
	
	public static void printCosmetics() {
		ArrayList al = new ArrayList(); 
		ArrayList al2 = new ArrayList();
		
		al.add("지성"); 
		al.add("건성");
		al.add("예민"); 
		al.add("복합성");
		
		al2.add("오휘미라클아쿠아 젤크림");
		al2.add("뉴트로지나 하이드로 부스트 크림");
		al2.add("닥터바이오 크림");
		al2.add("라네즈베이직라이트 크림");
		
		for (int i = 0; i< al.size(); i++) {
			System.out.println( al.get(i)+"이면 " +al2.get(i)+"입니다.");
		}
	}
	
	public static void printCustomer(){
		Customer c = Customer.builder().id("이정민").skin_type("건성").grade("vip").build();
		System.out.println(c.toString());
		
		Customer c2 = Customer.builder().id("염아정").skin_type("지성").grade("silver").build();
		System.out.println(c2.toString());
		
		Customer c3 = Customer.builder().id("장종욱").skin_type("복합성").grade("member").build();
		System.out.println(c3.toString());
		
		Customer c4 = Customer.builder().id("최지수").skin_type("예민").grade("nonmember").build();
		System.out.println(c4.toString());
	}

}
	


