
package view;

import java.util.ArrayList;
import object.domain.CustomerDTO;

public class EndView {
	public static void main(String[] args) {
	//ȭ��ǰ ��õ�� �ް� ȭ��ǰ�� ������ �� ����(ȭ��ǰ ��õ �ޱ� �� ȭ��ǰ ����)
		
	CustomerDTO.getChoice(); //Slf4j�� �̿��� ȭ��ǰ ��õ ���� ���
	
	ArrayList al2 = new ArrayList(); //ArrayList�� �̿��� �� ���̵�,�Ǻ�Ÿ��,ȭ��ǰ,ȭ��ǰ���� ������ ����
	al2.add("jjw");
	al2.add("combination skin");
	al2.add("������������Ʈ ũ��");
	al2.add(34300);
//	ArrayList al = new ArrayList(); 
//	al.add("cjs");
//	al.add("sensitive skin");
//	al.add("���� ���̿� ũ��");
//	al.add(20400);
//	ArrayList al1 = new ArrayList(); 
//	al1.add("ljm");
//	al1.add("dry skin");
//	al1.add("��Ʈ������ ���̵�� �ν�Ʈ ũ��");
//	al1.add(24086);
//	ArrayList al3 = new ArrayList(); 
//	al3.add("yaj");
//	al3.add("oily skin");
//	al3.add("���̶ֹ�Ŭ����� ��ũ��");
//	al3.add(51300);
	

	CustomerDTO.buyCosmetics(al2); //Log4j�� �̿��� �� ȭ��ǰ �����̷� ���
//	CustomerDTO.buyCosmetics(al);
//	CustomerDTO.buyCosmetics(al1);
//	CustomerDTO.buyCosmetics(al3);
	}
}
	


