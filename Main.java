/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minor1;

import javax.swing.JFrame;

/**
 *
 * @author reham
 */
public class Main {
     public static void main(String[] args) {
                //adding new frame to window for UI
	        JFrame frame = new JFrame();
                //creating gameplay class instance and adding to the frame
	        GamePlay gameplay = new GamePlay();
                frame.add(gameplay);
                //setting bounds of frame
                //distance from x,y and width, height
	        frame.setBounds(10,10,700,600);
                //setting title to frame
	        frame.setTitle("BrickBreaker");
                //setting resizable or not
	        frame.setResizable(false);
                //setting visibility of frame to true
	        frame.setVisible(true);
                //default close operation
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	    }
}
