
package data.model;

import sale.domain.Cosmetic;

public class Data_Cosmetic {
	public static Cosmetic [] getCosmetic() {
		Cosmetic [] all = {new Cosmetic("������������Ʈ ũ��", "combination_skin", 34300), 
					new Cosmetic("��Ʈ������ ���̵�� �ν�Ʈ ũ��", "dry_skin", 24086),
					new Cosmetic("���̶ֹ�Ŭ����� ��ũ��", "oily_skin",51300), 
					new Cosmetic("���� ���̿� ũ��", "sensitive_skin",20400)}; 
		
		return all;
	}

}
