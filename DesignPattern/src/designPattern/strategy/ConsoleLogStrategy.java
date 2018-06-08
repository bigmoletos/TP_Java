package designPattern.strategy;

public class ConsoleLogStrategy implements ILoggerStrategy{
	@Override
	public void performLog(String s) {	
		System.out.println(s);
	}
}
