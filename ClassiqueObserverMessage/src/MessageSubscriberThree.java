public class MessageSubscriberThree implements Observer 
{
    @Override
    public void update(String m) {
        System.out.println("MessageSubscriberThree :: " + m);
    }
}