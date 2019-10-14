
public class Cook extends OrderPlacer {
	public void invokeCommand() {
		this.getCommand().execute();
	}
	
	public void prepareOrder() {
		invokeCommand();
	}	

}
//command