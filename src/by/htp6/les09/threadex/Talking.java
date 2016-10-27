package by.htp6.les09.threadex;

public class Talking extends Thread {
	
	public void run(){
		for(int i=0; i< 10 ; i++){
			System.out.println("Talking");
			
			try {
				Thread.sleep(150);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

}
