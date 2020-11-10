package object.domain;

import java.util.ArrayList;
import java.util.logging.Logger;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeDTO {
	static Logger logger = Logger.getLogger("log4jtest.CustomerTest");
	
	public String id; //���̵�
	private String password; //��й�ȣ
	public String grade; //���
	public String skin_type; //�Ǻ�Ÿ��

	public static void printCosmetics(CosmeticDTO[] cosmetic) {//ȭ��ǰ ���� ���
		System.out.println("=====�Ǻ�Ÿ�Կ� ���� ȭ��ǰ �� ȭ��ǰ ���� ���=====");
		for (int i = 0; i< cosmetic.length; i++) {
			System.out.println("ȭ��ǰ: " + cosmetic[i].getCosmetic() + " / " + "�Ǻ�Ÿ�� : " + cosmetic[i].getSkin_type() + " / " + "���� : " + cosmetic[i].getCosmetic_price() + "��");
		}
	}

	public static void printCustomer(){//�� ���� ���
		System.out.println("=====������ ����Ʈ ���=====");
		CustomerDTO c = CustomerDTO.builder().id("������").skin_type("�Ǽ�").grade("vip").build();
		System.out.println(c.toString());
		
		CustomerDTO c2 = CustomerDTO.builder().id("������").skin_type("����").grade("silver").build();
		System.out.println(c2.toString());
		
		CustomerDTO c3 = CustomerDTO.builder().id("������").skin_type("���ռ�").grade("member").build();
		System.out.println(c3.toString());
		
		CustomerDTO c4 = CustomerDTO.builder().id("������").skin_type("����").grade("nonmember").build();
		System.out.println(c4.toString());
	}
	
	public static void recommendCosmetics() { //�Ǻ�Ÿ�Կ� ���� ȭ��ǰ ��õ
		System.out.println("=====�Ǻ� Ÿ�Կ� ���� ȭ��ǰ ��õ=====");
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
	public static void buyCosmetics(ArrayList al) { //���̵� ������, --�� --Ÿ���̽ùǷ� --ȭ��ǰ �����ϼ̽��ϴ�. ���� : xxx
		System.out.println("=====���� �� �� ȭ��ǰ �����̷� ���=====");
		if(al.get(0).equals("yaj")) {
			logger.info("ȸ�����̵� : " +al.get(0)+", �������� " +al.get(1)+"�̽ùǷ� "+al.get(2)+ " �����ϼ̽��ϴ�." + "���� : "+al.get(3));
		}else if(al.get(0).equals("jjw")){
			logger.info("ȸ�����̵� : " +al.get(0)+", ������� " +al.get(1)+"�̽ùǷ� "+al.get(2)+ " �����ϼ̽��ϴ�." + "���� : "+al.get(3));
		}else if(al.get(0).equals("ljm")) {
			logger.info("ȸ�����̵� : " +al.get(0)+", �����δ� " +al.get(1)+"�̽ùǷ� "+al.get(2)+ " �����ϼ̽��ϴ�." + "���� : "+al.get(3));
		}else if(al.get(0).equals("cjs")) {
			logger.info("ȸ�����̵� : " +al.get(0)+", �������� " +al.get(1)+"�̽ùǷ� "+al.get(2)+ " �����ϼ̽��ϴ�." + "���� : "+al.get(3));
		}else if(al.get(0).equals("employee")) {
			logger.info("�������̵� : " +al.get(0)+", employee�� " +al.get(1)+"�̽ùǷ� "+al.get(2)+ " �����ϼ̽��ϴ�." + "���� : "+al.get(3));
		}//0 : ���̵�, 1: �Ǻ�Ÿ��, 2: ȭ��ǰ, 3:����
	}
}
