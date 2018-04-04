package demo5;

import javax.swing.JOptionPane;

public class Practice1 {
	public static void main(String[] args) {
		int i;
		while (true) {
			String intString = JOptionPane.showInputDialog("Enter an integer");
			i = Integer.parseInt(intString);
			if(i == 0) 
				return;
			System.out.println("i = " + i);
		}
	}
}
