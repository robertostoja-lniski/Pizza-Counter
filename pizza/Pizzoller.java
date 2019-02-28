package java2019.pizza;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Pizzoller implements ActionListener{
	
	private PizzaCounter counter;
	private PizzaView view;
	
	Pizzoller(PizzaCounter counter, PizzaView view) {
		
		this.view = view;
		this.counter = counter;
	}
	public void actionPerformed(ActionEvent e) {

		if(e.getActionCommand().equals("generate")) {
			
			System.out.println("Hey");
			double firstPizza = Double.parseDouble(view.getFirstPizza());
			double secondPizza = Double.parseDouble(view.getSecondPizza());
			double firstPrice = Double.parseDouble(view.getFirstPrice());
			double secondPrice = Double.parseDouble(view.getSecondPrice());
			
			view.showResults(counter.countPizzaQuality(firstPizza, secondPizza, firstPrice, secondPrice));
		}
	}

}