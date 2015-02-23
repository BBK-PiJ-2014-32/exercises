package day18;

import java.util.concurrent.*;
import java.util.Queue;
import java.util.ArrayDeque;

public class MyExecutor implements Executor{

	private static Queue<Runnable> tasks = new ArrayDeque<Runnable>();
	

	@Override
	public synchronized void execute(Runnable command) {
		tasks.offer(command);
		
	
	}
		
	}


