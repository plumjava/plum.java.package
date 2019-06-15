package plum.thread;
public class MyThread{
 public static void pause(long delai){
	 MyThread sl=new MyThread();
	 try {
		sl.execpause(delai);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 }
public synchronized void execpause(long delai) throws InterruptedException {
		try {
			wait(delai);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}