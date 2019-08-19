package sk.jankiss;

public class RockPaperScissorsTestDrive {

	public static void main(String[] args) {
		new RockPaperScissorsTestDrive().test();
	}

	public void test() {
		RockPaperScissor testUnit = new RockPaperScissor();
		 
		// players -- score -- winner -- repeat -- endwinner
		
		
		//Test Player class
		Player p1 = new Player();
		Player p2 = new Player("Jakub velkolepy");
		Player p3 = new Player("Jozef Treti", 0);
		Player p4 = new Player("Rado Stvrty", 1, 10);
		Player p5 = new Player("Jaro Piaty", 2, 20);
		
		
		
		Player uiPlayer = new Player();
		Player realPlayer = new Player("janika");
	
		// included in testUnit.setUpGame();
		uiPlayer.makeMove();			//test basic makeMove()
		realPlayer.makeMove("Rock");	//test overloaded makeMove()
		
		//show winner + increse score
		Player winner = vyhodnot(uiPlayer, realPlayer);
		
		//showResult();		//I think this one should be called from vyhodnot()
		
		//nicely centered windows -- buttons reaction (pics changing, score indicators, menu items new game, 
		//show score, exit, about 
		
		testUnit.buildGUI();			//show GUI
		
		
		
		
	}
}
