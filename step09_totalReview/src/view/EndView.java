
package view;

import sale.domain.Cosmetic;
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
		al.add("지성"); 
		al.add("건성");
		al.add("예민"); 
		al.add("복합성"); 
		
		for (int i = 0; i< al.size(); i++) {
			System.out.println("화장품: " + al.get(i));
		}
	}

}
	


