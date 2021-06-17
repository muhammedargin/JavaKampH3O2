package h3;

public class StudentManager extends UserManager {

	public StudentManager(User student) {
		super(student);
		
	}
  

	public void kayıtOl (User user,String kursAdi) {
		
		System.out.println(user.getName() + "Kursa kaydoldu:"+ kursAdi);
	}
}
