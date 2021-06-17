package h3;

public class UserManager {
	
	User user;
	public UserManager (User user) {
		
		this.user = user;
		
	}
	
	public void Add (User user) {
		
		System.out.println(user.getName() + " "+"Eklendi");
		
	}
	
	

}
