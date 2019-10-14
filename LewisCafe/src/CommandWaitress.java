
public class CommandWaitress extends OrderPlacer {

	public void invokeCommand() {
		this.getCommand().execute();
	}
	
	public void takeOrder() {
		invokeCommand();
	}
	
	public void serveOrder() {
		invokeCommand();
	}	
}

//Command