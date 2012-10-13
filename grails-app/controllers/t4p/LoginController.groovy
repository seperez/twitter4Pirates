package t4p

class LoginController {
	
	def index(){
		
		render view:'index', model :[userSession: session.getAttribute("username")]
	}
	
	def authenticate(String username, String password) {
		
		if (User.login(username, password)) {
			session.setAttribute('username', username)
			redirect controller:'tweet', action:'list'
		} else {
			flash.message = 'Usuario o password incorrectos'
			render view:'index'
		}
	}
}
