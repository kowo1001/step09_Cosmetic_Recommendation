
package view;

import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;

import data.model.Data_Cosmetic;
import log.Log;
import sale.domain.Customer;

public class StartView {

	
	public static void main(String[] args) {
		EndView.printCosmetics(Data_Cosmetic.getCosmetic()); //MVC pattern을 이용한 피부타입에 따른 화장품 및 화장품 가격 출력
		EndView.printCosmetics(); // ArrayList를 이용한 피부 타입에 따른 화장품 추천 
		Log.getChoice(); //Log를 이용한 화장품 추천 기록
		EndView.printCustomer(); //Builder를 이용한 고객정보 리스트 출력
	}
}

