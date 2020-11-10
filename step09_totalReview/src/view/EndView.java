
package view;

import sale.domain.Cosmetic;
import sale.domain.Customer;

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
		ArrayList al2 = new ArrayList();
		
		al.add("����"); 
		al.add("�Ǽ�");
		al.add("����"); 
		al.add("���ռ�");
		
		al2.add("���̶ֹ�Ŭ����� ��ũ��");
		al2.add("��Ʈ������ ���̵�� �ν�Ʈ ũ��");
		al2.add("���͹��̿� ũ��");
		al2.add("������������Ʈ ũ��");
		
		for (int i = 0; i< al.size(); i++) {
			System.out.println( al.get(i)+"�̸� " +al2.get(i)+"�Դϴ�.");
		}
	}
	
	public static void printCustomer(){
		Customer c = Customer.builder().id("������").skin_type("�Ǽ�").grade("vip").build();
		System.out.println(c.toString());
		
		Customer c2 = Customer.builder().id("������").skin_type("����").grade("silver").build();
		System.out.println(c2.toString());
		
		Customer c3 = Customer.builder().id("������").skin_type("���ռ�").grade("member").build();
		System.out.println(c3.toString());
		
		Customer c4 = Customer.builder().id("������").skin_type("����").grade("nonmember").build();
		System.out.println(c4.toString());
	}

}
	


