package object.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CosmeticDTO {

	public String cosmetic;
	private String skin_type;
	private int cosmetic_price;
	
	public String toString() {
		return "ȭ��ǰ : " + cosmetic + "\n"   + "�Ǻ�Ÿ�� : " + skin_type + "���� : "+ "\n" + cosmetic_price;
	}
}


