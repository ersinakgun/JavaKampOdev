package homeWork3;

public class Instructor extends User {
	
	private int id;
	private String speciality;
	private String firstName;
	private String lastName;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSpeciality() {
		return speciality;
	}


	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Instructor(int id, String speciality, String firstName, String lastName) {
		super();
		this.id = id;
		this.speciality = speciality;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	public Instructor() {
		
	}
}
	