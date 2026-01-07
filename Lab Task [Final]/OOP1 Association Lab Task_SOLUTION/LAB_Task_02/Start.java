public class Start{
	public static void main(String[] args){
		Passport passport11 = new Passport("BDA06694", "Bangladesh", 48);
		Passport passport12 = new Passport("SK06694", "South Korea", 64);
		Passport passport13 = new Passport("D306694", "Uganda", 64);
		Passport passport14 = new Passport("JP332694", "Japan", 48);
		Passport passport15 = new Passport("CN2694", "China", 48);
		
		Person p1 = new Person("Anya Forger Chan", 5, 10);
		
		
		
		p1.addPassport(passport11);
		p1.addPassport(passport12);
		p1.addPassport(passport13);
		p1.addPassport(passport14);
		p1.addPassport(passport15);
		
		System.out.println();
		System.out.println();
		System.out.println();

		p1.showAllInfo();

		System.out.println();
		System.out.println();
		System.out.println();

		
		p1.deletePassport(passport13);
		
		p1.deletePassport(passport13);
		
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		p1.showAllInfo();

		
		// obj1.showPassportInfo();
		// obj2.showPassportInfo();
		// System.out.println();
		
		// Person obj3 = new Person("Anya Chan", 5, obj1);
		// Person obj4 = new Person("An Yujin", 22, obj2);
		
		// obj3.showAllInfo();
		// obj4.showAllInfo();
		// System.out.println();
		
	}
}