public class Main 
{
    public static void main(String[] args) 
    {
    	
        MessagePublisher p = new MessagePublisher();
        MessageSubscriberOne s1 = new MessageSubscriberOne(p);
        MessageSubscriberTwo s2 = new MessageSubscriberTwo(p);
        MessageSubscriberThree s3 = new MessageSubscriberThree(p);
          
        p.addObserver(s1);
        p.addObserver(s2);
         
        p.publish("First Message");   //s1 and s2 will receive the update
         
        p.removeObserver(s1);
        p.addObserver(s3);
         
        p.publish("Second Message"); //s2 and s3 will receive the update
    }
}