package sale.domain;

public class Cosmetic {

	public String cosmetic;
	private String skin_type;
	private int cosmetic_price;
	
	public Cosmetic() {}
	public Cosmetic(String cosmetic, String skin_type, int cosmetic_price) {
			this.cosmetic = cosmetic;
			this.skin_type = skin_type;
			this.cosmetic_price = cosmetic_price;
	}
	
	public String getCosmetic() {
		return cosmetic;
	}
	public void setCosmetic(String cosmetic) {
		this.cosmetic = cosmetic;
	}
	public String getSkin_type() {
		return skin_type;
	}
	public void setSkin_type(String skin_type) {
		this.skin_type = skin_type;
	}
	public int getCosmetic_price() {
		return cosmetic_price;
	}
	public void setCosmetic_price(int cosmetic_price) {
		this.cosmetic_price = cosmetic_price;
	}
	public String toString() {
		return "화장품 : " + cosmetic + "\n"   + "피부타입 : " + skin_type + "가격 : "+ "\n" + cosmetic_price;
	}
}


