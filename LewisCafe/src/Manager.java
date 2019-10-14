
public class Manager extends OrderPlacer {

	public void invokeCommand() {
		this.getCommand().execute();
	}
	
	public void validateOrder() {
		invokeCommand();
	}	
}
//command
