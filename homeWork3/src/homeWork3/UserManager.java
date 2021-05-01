package homeWork3;

public class UserManager {

		public void add(User user) {
			System.out.println("Eklendi: " + user.getFirstName());
		}
		
		public void update(User user) {
			System.out.println("Güncellendi: " + user.getFirstName());
		}
		
		public void delete(User user) {
			System.out.println("Silindi: " + user.getFirstName());
		}
}
