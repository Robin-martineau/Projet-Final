public class MessageSubscriberOne extends MessageSubscriber{
    @Override
    public void printMessage() {
        System.out.println("MessageSubscriberOne :: " + this.getPub().getMessage());
    }

	public MessageSubscriberOne(MessagePublisher pub) {
		super(pub);
		// TODO Auto-generated constructor stub
	}
}