package log;


import lombok.extern.slf4j.Slf4j;
import sale.domain.Customer;
import sale.domain.Cosmetic;

@Slf4j
public class Log {
	public static void getChoice() {
		Customer c = new Customer("jjw","0022","vip","combination skin");
		Cosmetic s = new Cosmetic("���� ���̿� ũ��","sensitive skin ",20400);
		
		log.info(c.getId() + "," + c.getPassword() + ","
		+ c.getGrade() + "," + c.getSkin_type() + "," + s.getCosmetic());

		System.out.println(c.getId()+"��! " + "����� ������" + c.getGrade() + "�Դϴ�. \n"
				+ c.getSkin_type() +"Ÿ���� �Ǻθ� ������ ��ó׿�."
			    + "������ ����� �Ǻθ� ���� ���� LCJY �ڽ���ƽ������ "
			    + s.getCosmetic() + "��õ�帳�ϴ�. \n"
			    + "�����Ͻðڽ��ϱ�?");
	}
}