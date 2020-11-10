
package data.model;

import sale.domain.Cosmetic;

public class Data_Cosmetic {
	public static Cosmetic [] getCosmetic() {
		Cosmetic [] all = {new Cosmetic("라네즈베이직라이트 크림", "combination_skin", 34300), 
					new Cosmetic("뉴트로지나 하이드로 부스트 크림", "dry_skin", 24086),
					new Cosmetic("오휘미라클아쿠아 젤크림", "oily_skin",51300), 
					new Cosmetic("닥터 바이오 크림", "sensitive_skin",20400)}; 
		
		return all;
	}

}
