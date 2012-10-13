package t4p

class TweetController {

	def show(Long tweetId) {
		
		def tweets = [] as List
		
		def temp = Tweet.get(tweetId)
		tweets << temp
		
		while(temp.tweetOriginalId != null) {
			temp = Tweet.get(temp.tweetOriginalId)
			tweets << temp
		}
		
		tweets = tweets.reverse()
		
		render view: 'show', model: [tweets: tweets]
	}
	
	def showByUser(Long userId) {
		User myUser = User.findById(userId);
		render view: 'show', model: [tweets: myUser.tweets]
	}
	
    def list() {
		
		def tweets = Tweet.list()
		
		render view: 'list', model: [tweets: tweets]
		
	}
	
	def create() {
		
	}
	
	def save() {
		def tweet = new Tweet(params)
		User myUser = User.findByUsername(session.getAttribute('username'))  
		
		myUser.addToTweets(tweet)
		
		//tweet.addToUser(myUser)
		
		tweet.user = myUser
		tweet.save(true)
		
		redirect action:'list'
	}
	
	def responder(Long tweetOriginalId){
		
		def username = Tweet.get(tweetOriginalId).user.name
		
		String texto = "@${username}"
		
		render view: 'create', model: [texto: texto,
			tweetOriginalId: tweetOriginalId]	
	}
	
	
}
