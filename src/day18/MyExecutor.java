package day18;

import java.util.concurrent.*;
import java.util.Queue;
import java.util.ArrayDeque;

public class MyExecutor implements Executor{

	private static Queue<Runnable> tasks = new ArrayDeque<Runnable>();
	private Executor executor;
	Runnable active;

	@Override
	public synchronized void execute(Runnable command) {
		if(tasks.poll() == null){
			tasks.offer(command);
		} else {
			command.run();
		}
	}

	protected synchronized void scheduleNext(){
		if ((active = tasks.poll()) != null){
			System.out.println(active);
			executor.execute(active);
		}
	}
	}


