
public class Address {
	private String street;
	private String city;
	private String state;
	private int zipcode;
	public Address() {
		street = "1234 abc ln";
		city = "brookfield";
		state = "wisconsin";
		zipcode = 53045;
	}
	public String mailingLabel() {
		return "MailingLabel: "+street+", "+city+", "+state+", "+zipcode;
	}
}
