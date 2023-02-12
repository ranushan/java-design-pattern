package com.ranushan;

public class TestClassProxy {

	public static void main(String[] args) {
		
		CommandExecutor executor = new CommandExecutorProxy("root", "rootpwd");
		
		try {
			executor.runCommand("ls -lstr");
			executor.runCommand("rm -rf abc.pdf");
		}catch (Exception e) {
			System.out.println("Exception Message : " + e.getMessage());
		}
	}

}
