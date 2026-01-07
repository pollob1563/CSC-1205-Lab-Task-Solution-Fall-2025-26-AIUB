public class Passport{
	private String passportNo;
	private String country;
	private int pages;
	
	public Passport(){}
	
	public Passport( String passportNo, String country, int pages){
		this.passportNo = passportNo;
		this.country =  country;
		this.pages = pages;
	}
	
	public void setPassportNo(String passportNo){
		this.passportNo = passportNo;
	}
	
	public void setCountry(String country){
		this.country =  country;

	}
	public void setPages(int pages){
		this.pages = pages;
		
	}
	
	public String getPassportNo() {
		return passportNo;
	}
	
	public String getCountry() {
		return country;
	}
	
	public int getPages() {
		return pages;
	}
	
	public void showPassportInfo(){
		System.out.println("Showing Passport Info");
		System.out.println("Passport No: " + passportNo);
		System.out.println("Country: " + country);
		System.out.println("Total Pages: " + pages+ "\n");
	}
	
}
