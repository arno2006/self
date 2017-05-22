package self.multithread;
import java.util.concurrent.*;
import java.util.*;

public class TaskWithResult implements Callable<String>{

	private int id;
	
	public  TaskWithResult(int id ) {
		this.id = id;
	}
	@Override
	public String call() {
		return "result of taskwithResult "+id;
	}
	
	public static void main(String[] args){
		ExecutorService executor = Executors.newCachedThreadPool();
		ArrayList<Future<String>> results = new ArrayList<Future<String>>();
		for (int i = 0; i < 10; i++) {
			results.add(executor.submit(new TaskWithResult(i)));
		}
		
		for (Future<String> future : results) {
			
			try {
				System.out.println(future.get());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally{
				executor.shutdown();
			}
			
		}
	}

}
