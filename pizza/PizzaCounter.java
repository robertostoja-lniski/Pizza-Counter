package java2019.pizza;

import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.awt.geom.Line2D;
import java.util.Random;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PizzaCounter {

	
	Vector<Double> result;
	
	PizzaCounter() {
		
		result = new Vector<Double>();
	}
	
	public Vector<Double> countPizzaQuality(double firstPizza, double secondPizza, double firstPrice, double secondPrice) {
		
		double firstPizzaArea = firstPizza * firstPizza * 3.14 / 4;
	
		double secondPizzaArea = secondPizza * secondPizza * 3.14 / 4;
		
		double firstPizzaQualityPerPLN = firstPizzaArea / firstPrice;
		double secondPizzaQualityPerPLN = secondPizzaArea / secondPrice;
		
		result.add(firstPizzaArea);
		result.add(secondPizzaArea);
		result.add(firstPizzaQualityPerPLN);
		result.add(secondPizzaQualityPerPLN);
		
		return result;
	}
	

}