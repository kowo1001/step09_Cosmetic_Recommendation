//ȸ������
//��� �Է��ؼ� ����

package validation.model;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MemberJoin {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		File file = new File("C:\\Users\\Playdata\\Desktop\\MemberDB.txt"); //����ȭ�鿡 MemberDB.txt ����� �Ӽ����� ��θ� ����
		try {
			FileWriter filewriter = new FileWriter(file, true); //file�� �̾��
			if(file.isFile() && file.canWrite()) { //������ �ְ� ������ �� �� �ִٸ�
				System.out.println("ȸ�������� ���� ID�� ��й�ȣ�� �Է��ϼ���.");
				System.out.print("ID �Է� : ");
				filewriter.append(scan.nextLine()); //���͸� ĥ������ �ؽ�Ʈ�� �Է��� �� �ְ�, ����ڰ� �Է��� ������ ���Ͽ� �߰����ش�
				filewriter.append("\t");
				System.out.print("��й�ȣ �Է� : ");
				filewriter.append(scan.nextLine());
				filewriter.append("\r"); //���� ����� �߰��� �� �ֵ��� ���๮�� 
				System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�.");
			}
			filewriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
}

