
package log4jtest;

import java.util.ArrayList;
import java.util.logging.Logger;

public class CustomerTest {
	static Logger logger = Logger.getLogger("log4jtest.CustomerTest");
	
	static void buyCosmetics(ArrayList al) { //���̵� ������, --�� --Ÿ���̽ùǷ� --ȭ��ǰ �����ϼ̽��ϴ�. ���� : xxx
		if(al.get(0).equals("yaj")) {
			logger.info("ȸ�����̵� : " +al.get(0)+", �������� " +al.get(1)+"�̽ùǷ� "+al.get(2)+ "�����ϼ̽��ϴ�." + "���� : "+al.get(3));
		}else if(al.get(0).equals("jjw")){
			logger.info("ȸ�����̵� : " +al.get(0)+", ������� " +al.get(1)+"�̽ùǷ� "+al.get(2)+ "�����ϼ̽��ϴ�." + "���� : "+al.get(3));
		}else if(al.get(0).equals("ljm")) {
			logger.info("ȸ�����̵� : " +al.get(0)+", �����δ� " +al.get(1)+"�̽ùǷ� "+al.get(2)+ "�����ϼ̽��ϴ�." + "���� : "+al.get(3));
		}else if(al.get(0).equals("cjs")) {
			logger.info("ȸ�����̵� : " +al.get(0)+", �������� " +al.get(1)+"�̽ùǷ� "+al.get(2)+ "�����ϼ̽��ϴ�." + "���� : "+al.get(3));
		}//0 : ���̵�, 1: �Ǻ�Ÿ��, 2: ȭ��ǰ, 3:����
	}
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); 
		al.add("cjs");
		al.add("sensitive skin");
		al.add("���� ���̿� ũ��");
		al.add(20400);
		ArrayList al1 = new ArrayList(); 
		al1.add("ljm");
		al1.add("dry skin");
		al1.add("��Ʈ������ ���̵�� �ν�Ʈ ũ��");
		al1.add(24086);
		ArrayList al2 = new ArrayList(); 
		al2.add("jjw");
		al2.add("combination skin");
		al2.add("������������Ʈ ũ��");
		al2.add(34300);
		ArrayList al3 = new ArrayList(); 
		al3.add("yaj");
		al3.add("oily skin");
		al3.add("���̶ֹ�Ŭ����� ��ũ��");
		al3.add(51300);
		
		buyCosmetics(al);
		buyCosmetics(al1);
		buyCosmetics(al2);
		buyCosmetics(al3);
		
	}
}


