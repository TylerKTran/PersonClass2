
public class Projects {

	private String[] completedProjects;

	public Projects() {
		completedProjects[0] = "Finished Reading Renegade";
		completedProjects[1] = "Squirrel fishing";
		completedProjects[2] = "Coded a girlfriend";
		completedProjects[3] = "Learned source control";
		completedProjects[4] = "Graduated from Yerevan State University";
	}

	public String projectSummary() {
		return completedProjects[0] + "\n" + completedProjects[1] + "\n" + completedProjects[2] + "\n"
				+ completedProjects[3] + "\n" + completedProjects[4] + "\n";

	}
}
