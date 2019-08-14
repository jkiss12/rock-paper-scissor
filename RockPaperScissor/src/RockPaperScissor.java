/**
 * 
 */


import java.awt.*;
import java.awt.event.*;
import java.util.*;


import javax.swing.*;

/**
 * @author janika kiss
 * @since  13. 8. 2019
 * @version 0.0.1
 */
public class RockPaperScissor {

	ArrayList<String> weapons;
	
	JFrame frame;
	JPanel mainPanel;
	JPanel bPanel;
	JButton bRock;
	JButton bPaper;
	JButton bScissor;
	JTextField result;
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new RockPaperScissor().go();
	}
	
	/**
	 * Method where everything is put together.
	 * 
	 */
	 
	public void go() {
		setUpGame();
		//buildGUI();
		//startGame();
		
	}

	public void setUpGame() {
		weapons = new ArrayList<String>(); 
		weapons.add(0,"Rock");
		weapons.add(1,"Paper");
		weapons.add(2,"Scissor");
		System.out.println(weapons);
		
		Player p1 = new Player();
		System.out.println(p1.getName() + ": " + weapons.get(p1.getGuess()));
		Player p2 = new Player("Jozef Borovicka", 0);
		System.out.println(p2.getName() + ": " + weapons.get(p2.getGuess()));
		Player p3 = new Player("Janko Isty", 1);
		System.out.println(p3.getName() + ": " + weapons.get(p3.getGuess()));
		
		
		System.out.println(vyhodnot(p1,p2));
		System.out.println(vyhodnot(p1,p3));
		System.out.println(vyhodnot(p2,p3));

		System.out.println("The final score is:");
		System.out.println("Player 1: " + p1.getName() + " " + p1.getScore());
		System.out.println("Player 2: " + p2.getName() + " " + p2.getScore());
		System.out.println("Player 3: " + p3.getName() + " " + p3.getScore());
		
	}
	
	
	
	
	void buildGUI() {
		frame = new JFrame("Rock Paper Scissor GAME");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JMenuBar menuBar = new JMenuBar();
		JMenu gameMenu = new JMenu("Game");
		JMenuItem newGameLoad = new JMenuItem("New game");
		newGameLoad.addActionListener(new NewGameListener());
		JMenuItem exitGame = new JMenuItem("Exit");
		
		gameMenu.add(newGameLoad);
		gameMenu.add(exitGame);
		
		JMenu aboutMenu = new JMenu("About");
		JMenuItem help = new JMenuItem("Help");
		JMenuItem about = new JMenuItem("About");
		aboutMenu.add(help);
		aboutMenu.add(about);
		menuBar.add(gameMenu);
		menuBar.add(aboutMenu);
		
		result = new JTextField("",20);
		
		mainPanel = new JPanel();
		mainPanel.add(result);
		//// here i ma dDING result of the fight
		
		
		bRock = new JButton("Rock");
		bPaper = new JButton("Paper");
		bScissor = new JButton("Scissor");	
		bPanel = new JPanel();
		bPanel.add(bRock);
		bRock.addActionListener(new RockButtonListener());
		bPanel.add(bPaper);
		bPaper.addActionListener(new PaperButtonListener());
		bPanel.add(bScissor);
		bScissor.addActionListener(new ScissorButtonListener());
		
		frame.setJMenuBar(menuBar);
		frame.getContentPane().add(BorderLayout.CENTER, mainPanel);
		frame.getContentPane().add(BorderLayout.SOUTH, bPanel);
		frame.setSize(600, 400);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null); //simple center the frame
	}
	
	/**
	 * 
	 *	Rock 	beats 	scissors		wins p1
	 *	paper 	beats	Rock			wins p1
	 *	scissor	beats	paper  			wins p1
	 */
	public Player vyhodnot(Player p1, Player p2) { 	
		if (p1.getGuess() == p2.getGuess()) {
			System.out.println("there is no winner");
			return null;
		} if((p1.getGuess() == 0) & (p2.getGuess()==2)) {
			p1.addScore(1);
			return p1;
		} if((p1.getGuess() == 1) & (p2.getGuess()==0)) {
			p1.addScore(1);
			return p1;
		} if((p1.getGuess() == 2) & (p2.getGuess()==1)) {
			p1.addScore(1);
			return p1;
		} else {
			p2.addScore(1);
			return p2;
		}
	 } 
	  
	   
	 	
	
	class NewGameListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			setUpGame();
			
		}
	}
	
	class RockButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Rock");
			
		}
	}
	
	class PaperButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Paper");
			
		}
	}
	
	class ScissorButtonListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Scissor");
		}
		
	}
} 
