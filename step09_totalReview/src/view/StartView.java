
package view;

import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;

import data.model.Data_Cosmetic;
import log.Log;
import sale.domain.Customer;

public class StartView {

	
	public static void main(String[] args) {
		EndView.printCosmetics(Data_Cosmetic.getCosmetic()); //MVC pattern�� �̿��� �Ǻ�Ÿ�Կ� ���� ȭ��ǰ �� ȭ��ǰ ���� ���
		EndView.printCosmetics(); // ArrayList�� �̿��� �Ǻ� Ÿ�Կ� ���� ȭ��ǰ ��õ 
		Log.getChoice(); //Log�� �̿��� ȭ��ǰ ��õ ���
		EndView.printCustomer(); //Builder�� �̿��� ������ ����Ʈ ���
	}
}

