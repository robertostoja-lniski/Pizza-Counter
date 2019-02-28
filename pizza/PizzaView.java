package java2019.pizza;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PizzaView extends JFrame {

	PizzaView view;
	PizzaCounter counter;
	JButton generate;
	
	JTextField firstPizza;
	JTextField secondPizza;
	JTextField firstPrice;
	JTextField secondPrice;
	
	JLabel firstPizzaArea;
	JLabel secondPizzaArea;
	JLabel firstPizzaQuality;
	JLabel secondPizzaQuality;
	
	public PizzaView(PizzaCounter counter) {
		
		this.counter = counter;
		initComponents();
		setDefaultParameters();
		setVisible(true);
		
	}

	public void injectListener(Pizzoller controller) {
		
		generate.addActionListener(controller);
	}

	private void setDefaultParameters() {
		
        setSize(360, 420);
        setResizable(false);
        getContentPane().setLayout(null);
        setImage();
        
	}
	private void setImage() {
		
		JLabel bg;
		ImageIcon img = new ImageIcon("pizza.jpg");
		
		bg = new JLabel("", img, JLabel.CENTER);
		bg.setBounds( 0 , 0 , 360, 420 );
		getContentPane().add(bg);
	}
	private void initComponents() {

		generate = new JButton("generate");
		generate.setBounds(30, 30, 290, 60);
		getContentPane().add(generate);
		
		  try {
		    Image img = ImageIO.read(getClass().getResource("coins.jpg"));
		    generate.setIcon(new ImageIcon(img));
		  } catch (Exception ex) {
		    System.out.println(ex);
		  }
		
		firstPizza = new JTextField("Podaj rozmiar pizzy");
		firstPizza.setBounds(30, 120, 120, 20);
		getContentPane().add(firstPizza);
		
		secondPizza = new JTextField("Podaj rozmiar pizzy");
		secondPizza.setBounds(200, 120, 120, 20);
		getContentPane().add(secondPizza);
		
		firstPrice = new JTextField("Podaj cene pizzy");
		firstPrice.setBounds(30, 150, 120, 20);
		getContentPane().add(firstPrice);
		
		secondPrice = new JTextField("Podaj cena pizzy");
		secondPrice.setBounds(200, 150, 120, 20);
		getContentPane().add(secondPrice);
		
		firstPizzaArea = new JLabel("");
		firstPizzaArea.setBounds(30, 200, 120, 20 );
		getContentPane().add(firstPizzaArea);
		
		secondPizzaArea = new JLabel("");
		secondPizzaArea.setBounds(200, 200, 120, 20);
		getContentPane().add(secondPizzaArea);
		
		firstPizzaQuality = new JLabel("");
		firstPizzaQuality.setBounds(30, 240, 120, 20);
		getContentPane().add(firstPizzaQuality);
		
		secondPizzaQuality = new JLabel("");
		secondPizzaQuality.setBounds(200, 240, 120, 20);
		getContentPane().add(secondPizzaQuality);
	}
	public String getFirstPizza() {
		
		return firstPizza.getText();
	}
	public String getSecondPizza() {
		
		return secondPizza.getText();
	}
	public String getFirstPrice() {
	
		return firstPrice.getText();
	}
	public String getSecondPrice() {
	
		return secondPrice.getText();
	}
	
	public void close() {
		try {
			WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
			Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
		} catch (Exception e) {	
			System.out.println("In model.closeMenu() null pointer exception");
		}
	}

	public void showResults(Vector<Double> countPizzaQuality) {
		
		String firstPizzaAreaStr = String.format( "%.2f" , countPizzaQuality.get(0));
		firstPizzaArea.setText( firstPizzaAreaStr + " cm ^ 2");
		
		String secondPizzaAreaStr = String.format( "%.2f" ,countPizzaQuality.get(1));
		secondPizzaArea.setText( secondPizzaAreaStr + " cm ^ 2 ");
		
		String firstPizzaQualityStr = String.format( "%.2f" ,countPizzaQuality.get(2));
		firstPizzaQuality.setText( firstPizzaQualityStr + " cm ^ 2 / 1 zł ");
		
		String secondPizzaQualityStr = String.format( "%.2f" ,countPizzaQuality.get(3));
		secondPizzaQuality.setText( secondPizzaQualityStr + " cm ^ 2 / 1 zł");
		
		countPizzaQuality.clear();
		
	}


}