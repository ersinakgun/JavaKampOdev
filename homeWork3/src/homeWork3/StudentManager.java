package homeWork3;

public class StudentManager extends UserManager {

		public void getlevel(Student student) {
				System.out.println(student.getFirstName()+" İlerleme durumu: "+student.getLevel());
		}

		public void getStudentNumber(Student student) {
				System.out.println(student.getFirstName()+" İsimli öğrencinin numarası: "+student.getStudentNumber());
		} 



}

