import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
 
public class MessagePublisher {
private String messageToPublish;

	public void publish(String m){
		this.messageToPublish = m;
	}
	
	public String getMessage(){
		return this.messageToPublish;
	}
}