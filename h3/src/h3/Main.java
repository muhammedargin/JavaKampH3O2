package h3;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor= new Instructor();
		instructor.setId(1);
		instructor.setName("Engin Demiroğ");
		instructor.setVerilenKurslar(new String[] {"Java,C#"} );
		
		Student student = new Student();
		student.setId(2);
		student.setName("Muhammed");
		student.setAlınanKurslar(new String [] {"Java"});
		
		UserManager userManager = new UserManager(student);
		
		userManager.Add(student);
		userManager.Add(instructor);
		
		

	}

}
