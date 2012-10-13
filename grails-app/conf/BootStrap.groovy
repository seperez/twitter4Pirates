import t4p.Tweet
import t4p.User


class BootStrap {

    def init = { servletContext ->
		
		User myUser1 = new User(name:'Sebastian',
			username:'sp',
			password: '1234'
		)
		
		User myUser2 = new User(name:'Nicolas',
			username:'nico',
			password: '1234'
		)
		
		Tweet myTweet1 = new Tweet(
			texto:'Me encanta Grails! si con G',
			tweetOriginalId:null
		)
		
		
		Tweet myTweet2 = new Tweet(
			texto:'A mi tambien!',
			tweetOriginalId:null
		)
				
		myUser1.addToTweets(myTweet1)
		myUser1.save(true)
		myUser2.addToTweets(myTweet2)
		myUser2.save(true)
			
    }
    def destroy = {
    }
}
