
package log4jtest;

import java.util.ArrayList;
import java.util.logging.Logger;

public class CustomerTest {
	static Logger logger = Logger.getLogger("log4jtest.CustomerTest");
	
	static void buyCosmetics(ArrayList al) { //아이디 같으면, --님 --타입이시므로 --화장품 구매하셨습니다. 가격 : xxx
		if(al.get(0).equals("yaj")) {
			logger.info("회원아이디 : " +al.get(0)+", 염아정님 " +al.get(1)+"이시므로 "+al.get(2)+ "구매하셨습니다." + "가격 : "+al.get(3));
		}else if(al.get(0).equals("jjw")){
			logger.info("회원아이디 : " +al.get(0)+", 장종욱님 " +al.get(1)+"이시므로 "+al.get(2)+ "구매하셨습니다." + "가격 : "+al.get(3));
		}else if(al.get(0).equals("ljm")) {
			logger.info("회원아이디 : " +al.get(0)+", 이정민님 " +al.get(1)+"이시므로 "+al.get(2)+ "구매하셨습니다." + "가격 : "+al.get(3));
		}else if(al.get(0).equals("cjs")) {
			logger.info("회원아이디 : " +al.get(0)+", 최지수님 " +al.get(1)+"이시므로 "+al.get(2)+ "구매하셨습니다." + "가격 : "+al.get(3));
		}//0 : 아이디, 1: 피부타입, 2: 화장품, 3:가격
	}
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList(); 
		al.add("cjs");
		al.add("sensitive skin");
		al.add("닥터 바이오 크림");
		al.add(20400);
		ArrayList al1 = new ArrayList(); 
		al1.add("ljm");
		al1.add("dry skin");
		al1.add("뉴트로지나 하이드로 부스트 크림");
		al1.add(24086);
		ArrayList al2 = new ArrayList(); 
		al2.add("jjw");
		al2.add("combination skin");
		al2.add("라네즈베이직라이트 크림");
		al2.add(34300);
		ArrayList al3 = new ArrayList(); 
		al3.add("yaj");
		al3.add("oily skin");
		al3.add("오휘미라클아쿠아 젤크림");
		al3.add(51300);
		
		buyCosmetics(al);
		buyCosmetics(al1);
		buyCosmetics(al2);
		buyCosmetics(al3);
		
	}
}


