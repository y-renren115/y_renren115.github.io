
 class memberdateregist {

	private String name;		// 名前
	private int no;		// 会員番号
	private int age;		// 年齢
    private String address;    //住所
    
	memberdateregist(String name, int no, int age, String address) {
		this.name = name;
		this.no = no;
		this.age = age;
		this.address = address;
	}
 

	void print() {
		System.out.println("No." + no + "：" + name +
								 "（" + age + "歳）");	
		System.out.println("住所:" +address);
	}	
 }
	


