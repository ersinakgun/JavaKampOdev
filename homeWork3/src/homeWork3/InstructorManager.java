package homeWork3;

public class InstructorManager extends UserManager {

		public void getSpeciality(Instructor instructor) {
			System.out.println(instructor.getFirstName()+instructor.getLastName()+", Uzmanlýk durumu: "+instructor.getSpeciality());
		}
}
