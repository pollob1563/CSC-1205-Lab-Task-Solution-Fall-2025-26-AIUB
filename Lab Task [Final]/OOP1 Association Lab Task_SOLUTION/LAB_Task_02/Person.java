public class Person{
	private String name;
	private int age;
	private Passport pp [];
	
	public Person(){};
	
	public Person(String name, int age, int size){
		this.name = name;
		this.age = age;
		pp = new Passport[size];
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public String getName(){
		return name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void addPassport (Passport ppp){
		for ( int i = 0 ; i < pp.length; i++){
			if(pp[i]== null){
				pp[i] = ppp;
				System.out.println("Passport added succesfully.\nindex no: "+ i + "\nAdded citizenship for "+ pp[i].getCountry());
				System.out.println();
				break;
			}
		}
	}
//System.out.println("Passport added succesfully index no: "+ i + "added citizenship for"+ pp.getCountry());
	
	public void deletePassport(Passport ppp){
		boolean flag = false; 
		
		for (int i = 0; i < pp.length; i++){
			if(pp[i]==ppp){
				System.out.println("Passport deleted succesfully.\nindex no: "+ i + "\nDetained citizenship for "+ pp[i].getCountry());
				System.out.println();
				pp[i] = null;
				flag = true;
				break;
			}
		}
		if (flag == false){
			System.out.println("Passport Not found");
		}
	}
	
	public void showAllInfo(){
		System.out.println("Showing Person Info");
		System.out.println("Person Name: " + name);
		System.out.println();
		
		for (int i = 0; i < pp.length; i++){
			
			System.out.println("Index: "+ i);
			
			if(pp[i]!=null){
				pp[i].showPassportInfo();
				System.out.println();
			}
			
			else {
				System.out.println("Nothing to show");
				System.out.println();
			}
		}
		
	}

}