public class MessageSubscriberTwo extends MessageSubscriber {
    public MessageSubscriberTwo(MessagePublisher pub) {
		super(pub);
		// TODO Auto-generated constructor stub
	}

	@Override
    public void printMessage() {
        System.out.println("MessageSubscriberTwo :: " + this.getPub().getMessage());
    }
}