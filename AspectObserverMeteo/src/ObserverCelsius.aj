
aspect ObserverCelsius extends ObserverPattern {

	declare parents: Button implements Subject;
	public Object Button.getData() { return this; }
	declare parents: Celsius implements Observer;
	public void Celsius.update() {
		updateDegrees();
	}
	pointcut stateChanges(Subject s): 
		target(s) &&
		call(void Button.click());
}