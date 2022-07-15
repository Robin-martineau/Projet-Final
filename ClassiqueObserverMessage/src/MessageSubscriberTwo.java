public class MessageSubscriberTwo implements Observer 
{
    @Override
    public void update(String m) {
        System.out.println("MessageSubscriberTwo :: " + m);
    }
}