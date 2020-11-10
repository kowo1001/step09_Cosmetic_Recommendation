package log;


import lombok.extern.slf4j.Slf4j;
import sale.domain.Customer;
import sale.domain.Cosmetic;

@Slf4j
public class Log {
	public static void getChoice() {
		Customer c = new Customer("jjw","0022","vip","combination skin");
		Cosmetic s = new Cosmetic("닥터 바이오 크림","sensitive skin ",20400);
		
		log.info(c.getId() + "," + c.getPassword() + ","
		+ c.getGrade() + "," + c.getSkin_type() + "," + s.getCosmetic());

		System.out.println(c.getId()+"님! " + "당신은 소중한" + c.getGrade() + "입니다. \n"
				+ c.getSkin_type() +"타입의 피부를 가지고 계시네요."
			    + "소중한 당신의 피부를 위해 저희 LCJY 코스메틱에서는 "
			    + s.getCosmetic() + "추천드립니다. \n"
			    + "구매하시겠습니까?");
	}
}