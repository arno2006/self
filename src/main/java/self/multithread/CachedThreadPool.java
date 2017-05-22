package self.multithread;

import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;

public class CachedThreadPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ExecutorService exec = Executors.newFixedThreadPool(5);*/
		/*ExecutorService exec = Executors.newCachedThreadPool();*/
		ExecutorService exec = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++)	exec.execute(new LiftOff());
		exec.shutdown();

	}

}
