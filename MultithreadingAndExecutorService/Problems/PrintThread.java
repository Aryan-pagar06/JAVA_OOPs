public class PrintThread extends Thread { 
    
    private final int Threadnumber;


    public PrintThread(int Threadnumber) {
        this.Threadnumber = Threadnumber;
    }

    @Override 
    public void run() { 

        System.out.printf("\nStarting Thread %s and %d\n", Thread.currentThread().getName(), Threadnumber); 
        
        try { 
            Thread.sleep(5000); 
        } catch (InterruptedException e) { 
            System.out.println(e.getMessage()); 
        } 

        System.out.printf("\nEnding Thread %s and %d \n", Thread.currentThread().getName(), Threadnumber); 
    }
}
