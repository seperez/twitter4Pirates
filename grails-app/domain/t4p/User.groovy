package t4p

class User {
	String name
	String username
	String password
	
	static constraints = {
		//username blank:false,size:5..8	
	}

	static hasMany = [tweets:Tweet]
	
	static boolean login(String username, String password){
		boolean returnValue = false
		User myUser = User.findByUsernameAndPassword(username,password);
		if(myUser) returnValue = true
		returnValue
	}	
	
	
}
