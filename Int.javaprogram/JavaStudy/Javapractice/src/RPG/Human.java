package RPG;

public class Human {

	private String name = null;
	private int gender = 0;
	private int length = 0;
	private int weigth = 0;
	private int vitality = 0;
	private int magic = 0;

	public Human() {

	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = name;
	}

	public int getGender() {
		return gender;
	}

	public void setGender() {
		this.gender = gender;
	}
	public int getLength() {
		return length;
	}

	public void setLength() {
		this.length = length;
	}
	public int getWeigth() {
		return weigth;
	}

	public void setWeigth() {
		this.weigth = weigth;
	}

	public int getVitality() {
		return vitality;
	}

	public void setVitality() {
		this.vitality = vitality;
	}
	public int getMagic() {
		return magic;
	}

	public void setMagic() {
		this.magic = magic;
	}
	//話す
	public void talk(String about) {
		System.out.println(about);
	}
	//食べる
	public void eatFood(String food) {
		int foodType = 0;
		if("薬草".equals(food)) {
			foodType = 1;
		} else if("魔法の水".equals(food)) {
			foodType = 2;
		} else {
			foodType = 3;
		}
	}

	private void digestFood(int foodType) {
		if(foodType == 1) {
			vitality += 10;
		} else if(foodType == 2) {
			magic += 10;
		} else {
			vitality += 1;
		}
	}
}












