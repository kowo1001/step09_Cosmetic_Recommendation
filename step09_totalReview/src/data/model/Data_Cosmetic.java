
package data.model;

import object.domain.CosmeticDTO;

public class Data_Cosmetic {
	public static CosmeticDTO [] getCosmetic() {
		CosmeticDTO [] all = {new CosmeticDTO("������������Ʈ ũ��", "combination_skin", 34300), 
					new CosmeticDTO("��Ʈ������ ���̵�� �ν�Ʈ ũ��", "dry_skin", 24086),
					new CosmeticDTO("���̶ֹ�Ŭ����� ��ũ��", "oily_skin",51300), 
					new CosmeticDTO("���� ���̿� ũ��", "sensitive_skin",20400)}; 
		
		return all;
	}

}
