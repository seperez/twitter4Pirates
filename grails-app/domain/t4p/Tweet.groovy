package t4p

class Tweet {

	//User user
	String texto
	Long tweetOriginalId
	
    static constraints = {
		texto maxLength: 140
		tweetOriginalId nullable: true
    }
	
	static belongsTo = [user:User]
}
