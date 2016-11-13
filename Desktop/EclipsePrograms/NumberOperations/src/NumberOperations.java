import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class NumberOperations{

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("NumberOperations");
		JPanel panel = new JPanel();
		JButton singleNumber = new JButton("Single number operations");
		JButton doubleNumber = new JButton("Two number operations");
		SpinnerModel model = new SpinnerNumberModel(0,-10000,10000,0.1);
		JSpinner singleSpinner = new JSpinner(model);
		String[] ssc = {"Absolute value"};
		JComboBox singleCB = new JComboBox(ssc);
		JButton singleEnter = new JButton("Enter");
		JLabel answer = new JLabel("");	
		answer.setFont(new Font("Aldrich", Font.PLAIN, 30));
		
		setFrameAttributes(frame,500,500,Color.LIGHT_GRAY);
		
		singleNumber.setSize(100,30);
		doubleNumber.setSize(100,30);
		
		panel.add(singleNumber);
		panel.add(doubleNumber);
		
		frame.add(panel);
		
		frame.setVisible(true);
		frame.pack();
		
		singleNumber.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	singleNumber.setVisible(false);
	        	doubleNumber.setVisible(false);
	        	panel.add(singleSpinner);
	        	panel.add(singleCB);
	        	panel.add(singleEnter);
	        	SwingUtilities.updateComponentTreeUI(frame);
	        	frame.pack();
	        	 String SSI = (String)singleCB.getSelectedItem();
	        	singleEnter.addActionListener(new ActionListener() {
	                public void actionPerformed(ActionEvent e) {
	                	singleSpinner.setVisible(false);
	                	singleCB.setVisible(false);
	                	singleEnter.setVisible(false);
	                    if(singleCB.getSelectedItem() == ssc[0]) answer.setText(String.valueOf(Math.abs((double)singleSpinner.getValue())));
	                    panel.add(answer);
	                    SwingUtilities.updateComponentTreeUI(frame);
	                    
	               }
	               });
	        }
	        });
		
		doubleNumber.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	singleNumber.setVisible(false);
	        	doubleNumber.setVisible(false);
	        	SwingUtilities.updateComponentTreeUI(frame);
	        }
	        });
	}
	private static void setFrameAttributes(JFrame frame,int sizeX,int sizeY,Color backgroundColor)
	{
		frame.setSize(sizeX,sizeY);
		frame.setBackground(backgroundColor);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	private static double abs(double n){
		return Math.abs(n);
	}
}