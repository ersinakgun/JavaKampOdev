package homeWork3;

public class Main {

	public static void main(String[] args) {
		Student student = new Student();
		student.setId(1);
		student.setFirstName("ersin");
		student.setLastName("akgun");
		student.setCode(960001);
		student.setPassword("12345");
		student.setLevel("başlangıç");
		student.setStudentNumber("413");
		
		Instructor instructor = new Instructor(10,"PROF.","Engin","Demiroğ");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		studentManager.update(student);
		studentManager.delete(student);
		studentManager.getlevel(student);
		studentManager.getStudentNumber(student);
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
		instructorManager.getSpeciality(instructor);
	}

	
		
}
