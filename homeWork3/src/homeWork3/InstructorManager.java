package homeWork3;

public class InstructorManager extends UserManager {

		public void getSpeciality(Instructor instructor) {
			System.out.println(instructor.getFirstName()+instructor.getLastName()+", Uzmanl�k durumu: "+instructor.getSpeciality());
		}
}
