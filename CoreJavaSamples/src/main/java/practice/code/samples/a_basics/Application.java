package practice.code.samples.a_basics;

public class Application {
	
	final static class Constants {
        public static String name = "PI";
    }
	
    public static void main(String[] args) {
        
        Thread thread = new Thread(new Runnable() {
        	
        	public void run() {
        		System.out.println(Constants.name);
        	}
            
        });
        
        thread.start();
    }
}
