package java2019.pizza;

import java.awt.EventQueue;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) 
    {
    	 EventQueue.invokeLater(new Runnable() {
  	       public void run() {
  	    	 
  	    	 System.out.println("App has started.");
  	    	 PizzaCounter model = new PizzaCounter();
  	    	 PizzaView emptyFrame = new PizzaView(model);
  	    	 Pizzoller controller = new Pizzoller(model, emptyFrame);
  	    	 emptyFrame.injectListener(controller);
  	    
  	    	
  	       }
  	   });
    }
}
