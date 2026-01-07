public class Start{
	public static void main(String[] args){
		Passport passport1 = new Passport("A06694", "25/12/2035", 48);
		Passport passport2 = new Passport("B06694", "15/12/2030", 64);
		
		passport1.showPassportInfo();
		passport2.showPassportInfo();
		System.out.println();
		
		Person person1 = new Person("Anya Chan", 5, passport2);
		Person person2 = new Person("An Yujin", 22, passport2);
		
		person1.showAllInfo();
		person1.showAllInfo();
		System.out.println();
		
	}
}