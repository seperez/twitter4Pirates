package t4p

class LogoutController {
	def index(){
		session.removeAttribute("username")
		redirect controller:'login', action:'index'
	}
}
