package helloword;

import java.util.Random;

public class HelloWorld {

	public static void main(String[] args) {
		Random ra = null;
		
		while(true) {
			int flaaag = ra.nextInt(1);
			
			if(flaaag == 1) {
				System.out.println("…½ÊºÀ²Äã¡£");
			}else {
				System.out.println("I'am sorry , Brother FeiFan.");
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
