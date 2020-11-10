
package view;

import java.util.ArrayList;

import data.model.Data_Cosmetic;
import object.domain.EmployeeDTO;

public class StartView {
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); 
		al.add("employee");
		al.add("sensitive skin");
		al.add("���� ���̿� ũ��");
		al.add(20400);
		
		//ȭ��ǰ ��õ ���� ����(ȭ��ǰ,��,��õ���� ���� �� ȭ��ǰ ����)
		EmployeeDTO.printCosmetics(Data_Cosmetic.getCosmetic()); //MVC pattern�� �̿��� �Ǻ�Ÿ�Կ� ���� ȭ��ǰ �� ȭ��ǰ ���� ���
		EmployeeDTO.printCustomer(); //Builder�� �̿��� ������ ����Ʈ ��� (password�� ���Ȼ� null�� ���)
		EmployeeDTO.recommendCosmetics(); //ArrayList�� �̿��� �Ǻ� Ÿ�Կ� ���� ȭ��ǰ ��õ 
		EmployeeDTO.buyCosmetics(al);//Log4j�� �̿��� ���� ȭ��ǰ �����̷� ���
	}
}

