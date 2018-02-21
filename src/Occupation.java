
public class Occupation {
	String CompanyName="";
	String JobTitle="";
	public Occupation(){
		CompanyName="Backspace Inc.";
		JobTitle="Scrumling";
	}
	public String nameTag() {
		String tag=CompanyName+"/n"+JobTitle;
		return tag;
	}
}
