package h3;

public class InstructorManager extends UserManager {

	public InstructorManager(User Instructor) {
		super(Instructor);
		
	}

   
   public void yeniKursOlustur (User user, String kursAdi) {
		
		System.out.println(user.getName() + "Yeni Kurs Oluþturdu :" + kursAdi);
	}
}
