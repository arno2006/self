package self.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTask extends LiftOff{
	
	public void run() {
		
		try {
			while(countDown-- >0){
				System.out.println(status());
					/*Thread.sleep(1000);*/
				TimeUnit.MILLISECONDS.sleep(1000);
			}
		} catch (InterruptedException e) {// 中断异常
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exec.execute(new SleepingTask());
		}
		exec.shutdown();
		

	}

}
