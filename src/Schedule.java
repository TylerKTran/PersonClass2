
public class Schedule {

	private String[] scheduledMeetings = new String[5];
	
	public Schedule() {
		
		scheduledMeetings[1] = "Meeting 1";
		scheduledMeetings[2] = "Meeting 2";
		scheduledMeetings[3] = "Meeting 3";
		scheduledMeetings[4] = "Meeting 4";
		scheduledMeetings[5] = "Meeting 5";
	
	}
	public String mySchedule() {
		
		return scheduledMeetings[1] + "/n" + scheduledMeetings[2] + "/n" + scheduledMeetings[3] + "/n" + scheduledMeetings[4] + "/n" + scheduledMeetings[5];
		
	}
}
