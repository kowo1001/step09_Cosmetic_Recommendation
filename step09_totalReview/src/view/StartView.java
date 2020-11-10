
package view;

import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;

import data.model.Data_Cosmetic;
import log.Log;
import sale.domain.Customer;

public class StartView {
	//�����̸� ���� ȭ��ǰ
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
	
	public static void main(String[] args) {
	
		BasicConfigurator.configure();
		EndView.printCosmetics(Data_Cosmetic.getCosmetic());
	
		Log.getChoice();
		//new Customer("jjw","0022","vip","combination skin"),new Cosmetic("���� ���̿� ũ��","sensitive skin ",20400)
		
		Customer c = Customer.builder().id("������").skin_type("�Ǽ�").grade("vip").build();
		System.out.println(c.toString());
		
		Customer c2 = Customer.builder().id("������").skin_type("����").grade("silver").build();
		System.out.println(c2.toString());
		
		Customer c3 = Customer.builder().id("������").skin_type("���ռ�").grade("member").build();
		System.out.println(c3.toString());
		
		Customer c4 = Customer.builder().id("������").skin_type("����").grade("nonmember").build();
		System.out.println(c4.toString());
		
		printCosmetics();
	}

	
}

