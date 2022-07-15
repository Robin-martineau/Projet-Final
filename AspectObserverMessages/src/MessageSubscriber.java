public class MessageSubscriber {
	private MessagePublisher pub;
	
	public MessageSubscriber(MessagePublisher pub) {
		super();
		this.pub = pub;
	}
	
	public MessagePublisher getPub(){
		return this.pub;
	}

	public void printMessage(){
		System.out.println("Goo");
	}
}
