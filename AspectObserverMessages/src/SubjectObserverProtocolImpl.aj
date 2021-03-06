import java.util.Vector;

aspect SubjectObserverProtocolImpl extends SubjectObserverProtocol {

    declare parents: MessagePublisher implements Subject;
    public Object MessagePublisher.getData() { return this; }

    declare parents: MessageSubscriber implements Observer;
    public void MessageSubscriber.update() {
    	printMessage();
    }

    pointcut stateChanges(Subject s):
        target(s) &&
        call(void MessagePublisher.publish(String));

}
