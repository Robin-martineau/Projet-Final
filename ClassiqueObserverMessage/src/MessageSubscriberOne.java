public class MessageSubscriberOne implements Observer 
{
    @Override
    public void update(String m) {
        System.out.println("MessageSubscriberOne :: " + m);
    }
}