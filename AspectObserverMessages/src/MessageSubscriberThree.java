public class MessageSubscriberThree extends MessageSubscriber {
    public MessageSubscriberThree(MessagePublisher pub) {
		super(pub);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void printMessage() {
        System.out.println("MessageSubscriberThree :: " + this.getPub().getMessage());
    }
}