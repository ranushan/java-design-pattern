package com.ranushan;

public class CommandExecutorProxy implements CommandExecutor{

	private boolean isAdmin;
	private CommandExecutor executor;
	
	public CommandExecutorProxy(String user, String pwd) {
		if("root".equals(user) && "rootpwd".equals(pwd)) {
			isAdmin = true;
		}
		
		executor = new CommandExecutorImpl();
		
	}
	
	@Override
	public void runCommand(String cmd) throws Exception {
		if(isAdmin) {
			executor.runCommand(cmd);
		}
		else {
			if(cmd.trim().startsWith("rm")) {
				throw new Exception("rm not allowed for non-admin users.");
			}else {
				executor.runCommand(cmd);
			}
		}
	}
	
}
