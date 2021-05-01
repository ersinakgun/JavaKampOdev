package homeWork3;

public class Student extends User {
		private String studentNumber;
		private String level;
		
		public Student(String studentNumber, String level) {
			super();
			this.studentNumber = studentNumber;
			this.level = level;
		}

		public Student() {
			
		}

		public String getStudentNumber() {
			return studentNumber;
		}

		public void setStudentNumber(String studentNumber) {
			this.studentNumber = studentNumber;
		}

		public String getLevel() {
			return level;
		}

		public void setLevel(String level) {
			this.level = level;
		}
		
		
		
}
