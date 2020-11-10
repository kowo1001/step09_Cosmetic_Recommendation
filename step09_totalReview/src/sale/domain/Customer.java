package sale.domain;

import lombok.Builder;

@Builder

public class Customer {
		//��� ����
		private String id; //���̵�
		private String password; //��й�ȣ
		private String grade; //���
		private String skin_type; //�Ǻ�Ÿ��
		
		public Customer () {};
		public Customer(String id, String password, String grade, String skin_type) {
			super();
			this.id = id;
			this.password = password;
			this.grade = grade;
			this.skin_type = skin_type;
		}
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getGrade() {
			return grade;
		}
		public void setGrade(String grade) {
			this.grade = grade;
		}
		public String getSkin_type() {
			return skin_type;
		}
		public void setSkin_type(String skin_type) {
			this.skin_type = skin_type;
		}
		@Override
		public String toString() {
			return "Customer [id=" + id + ", password=" + password + ", grade=" + grade + ", skin_type=" + skin_type
					+ "]";
		}
		
}

	