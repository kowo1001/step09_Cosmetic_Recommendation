
package view;

import sale.domain.Cosmetic;
import java.util.ArrayList;

public class EndView {
	//��ü �޾Ƽ� ��¸� ���
	public static void printCosmetics(Cosmetic[] cosmetic) {
		for (int i = 0; i< cosmetic.length; i++) {
			System.out.println("ȭ��ǰ: " + cosmetic[i].getCosmetic() + " / " + "�Ǻ�Ÿ�� : " + cosmetic[i].getSkin_type() + " / " + "���� : " + cosmetic[i].getCosmetic_price() + "��");
		}
	}
	public static void printCosmetics() {
		ArrayList al = new ArrayList(); 
		al.add("����"); 
		al.add("�Ǽ�");
		al.add("����"); 
		al.add("���ռ�"); 
		
		for (int i = 0; i< al.size(); i++) {
			System.out.println("ȭ��ǰ: " + al.get(i));
		}
	}

}
	


