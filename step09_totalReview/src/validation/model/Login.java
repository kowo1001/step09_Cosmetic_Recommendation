//����ڰ� ���̵�� �Է��� �ϱ�

package validation.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Login {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int pass = 0;
		System.out.println("Login�� ���� ID�� ��й�ȣ�� �Է��ϼ���.");
		System.out.print("ID �Է� : ");
		String id = scan.nextLine(); //id�� nextLine�� ���� ������ Ű���� �Է��� ����
		System.out.print("��й�ȣ �Է� : ");
		String pw = scan.nextLine(); //pw�� nextLine�� ���� ������ Ű���� �Է��� ����
		File file = new File("C:\\Users\\Playdata\\Desktop\\MemberDB.txt");//����ȭ�鿡 MemberDB.txt ����� �Ӽ����� ��θ� ����
		try {
			FileReader filereader = new FileReader(file); //���� �о���̴µ� ���� ó��
			BufferedReader bufReader = new BufferedReader(filereader); //FileReader�� ���� �о�� ������ ������ ����
			String line = "";
			try {
				while((line = bufReader.readLine())!= null) { //���۸����� ���پ� �о ���ο� �ְ� ������ �� ���̵�� ����� �ε����� �̾ƿ�
					System.out.println(line.indexOf(id) + "\t" + line.indexOf(pw)); //���ο� id�� ������ ù��° ������ ��ġ�� �˷��ְ� ������ -1 ���
					int passId = line.indexOf(id);
					int passPw = line.indexOf(pw);
					if(passId != -1 && passPw != -1) { //id�� pw�� ��� ã�Ҵٸ� �α���
						System.out.println("�α��� ����");
						pass = 1; 	}	}
			  if(pass ==0) {System.out.println("�α��� ����");} //�̿��� ��� ���� �α��� ����
			  bufReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
	}
}
