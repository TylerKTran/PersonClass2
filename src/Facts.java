import java.util.ArrayList;

public class Facts {
	private ArrayList<String> facts;
	
	public Facts(){
		facts.add("Im tall");
		facts.add("Im a male");
		facts.add("I like icecream");
		facts.add("My favorite color is blue");
		facts.add("I love learning");
	}
	public String getFacts(){
		String fax = new String();
		fax += facts.get(0)+"\n"+facts.get(1)+"\n"+facts.get(2)+"\n"+facts.get(3)+"\n"+facts.get(4);
		return fax;
	}
}
