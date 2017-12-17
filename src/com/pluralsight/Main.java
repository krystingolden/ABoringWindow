package com.pluralsight;

import javax.swing.*;

//Main is the BoringWindow
public class Main extends JFrame{

    public static void main(String[] args) {
	// write your code here
        JFrame f = new Main(); //a.k.a a new BoringWindow
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300,200);
        f.setVisible(true);
    }

}
