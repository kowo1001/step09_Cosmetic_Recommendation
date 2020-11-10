package object.domain;

import java.util.ArrayList;
import java.util.logging.Logger;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Slf4j
public class CustomerDTO extends EmployeeDTO { //���
	
		//��� ����
		public String id; //���̵�
		private String password; //��й�ȣ
		public String grade; //���
		public String skin_type; //�Ǻ�Ÿ��
		
		
		@Override
		public String toString() {
			return "Customer [id=" + id + ", password=" + password + ", grade=" + grade + ", skin_type=" + skin_type
					+ "]";
		}
		
		public static void getChoice() {
			CustomerDTO c = new CustomerDTO("jjw","0022","member","combination skin");
			CosmeticDTO s = new CosmeticDTO("���� ���̿� ũ��","sensitive skin ",20400);
			
			log.info(c.getId() + "," + c.getPassword() + ","
			+ c.getGrade() + "," + c.getSkin_type() + "," + s.getCosmetic());

			System.out.println(c.getId()+"��! " + "����� ������ " + c.getGrade() + " �Դϴ�. \n"
					+ c.getSkin_type() +"Ÿ���� �Ǻθ� ������ ��ó׿�. \n"
				    + "������ ����� �Ǻθ� ���� ���� LCJY �ڽ���ƽ������ "
				    + s.getCosmetic() + " ��õ�帳�ϴ�. \n"
				    + "�����Ͻðڽ��ϱ�?");
		}
}

	