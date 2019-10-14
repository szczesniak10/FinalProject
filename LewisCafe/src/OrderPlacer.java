
public abstract class OrderPlacer {

		
		//Name of Waiter
		
		private String name;
		
		//Command to invoke
		private Command command;
		
		public abstract void invokeCommand();

	
		public String getName() {
			return name;
		}

	
		public void setName(String name) {
			this.name = name;
		}

	
		public Command getCommand() {
			return command;
		}

		public void setCommand(Command command) {
			this.command = command;
		} 

}
