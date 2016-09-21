import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {


	
	@Test
	public void testNoStrikesNoSpares() throws BowlingException {
		BowlingGame game = new BowlingGame();
		Frame[] frame = new Frame[10];
		frame[0] = new Frame(1,5);
		frame[1] = new Frame(3,6);
		frame[2] = new Frame(7,2);
		frame[3] = new Frame(3,6);
		frame[4] = new Frame(4,4);
		frame[5] = new Frame(5,3);
		frame[6] = new Frame(3,3);
		frame[7] = new Frame(4,5);
		frame[8] = new Frame(8,1);
		frame[9] = new Frame(2,6);
		
		for( int i = 0; i < 10; i++) {
			game.addFrame(frame[i]);
		}
		assertEquals(game.score(), 81);
	}
	
	@Test
	public void testOneSpare() throws BowlingException {
		BowlingGame game = new BowlingGame();
		Frame[] frame = new Frame[10];
		frame[0] = new Frame(1,5);
		frame[1] = new Frame(3,6);
		frame[2] = new Frame(7,3);
		frame[3] = new Frame(3,6);
		frame[4] = new Frame(4,4);
		frame[5] = new Frame(5,3);
		frame[6] = new Frame(3,3);
		frame[7] = new Frame(4,5);
		frame[8] = new Frame(8,1);
		frame[9] = new Frame(2,6);
		
		for( int i = 0; i < 10; i++) {
			game.addFrame(frame[i]);
		}
		assertEquals(game.score(), 85);
	}
	
	@Test
	public void testOneStrike() throws BowlingException {
		BowlingGame game = new BowlingGame();
		Frame[] frame = new Frame[10];
		frame[0] = new Frame(1,5);
		frame[1] = new Frame(3,6);
		frame[2] = new Frame(10,0);
		frame[3] = new Frame(3,6);
		frame[4] = new Frame(4,4);
		frame[5] = new Frame(5,3);
		frame[6] = new Frame(3,3);
		frame[7] = new Frame(4,5);
		frame[8] = new Frame(8,1);
		frame[9] = new Frame(2,6);
		
		for( int i = 0; i < 10; i++) {
			game.addFrame(frame[i]);
		}
		assertEquals(game.score(), 91);
	}
	
	@Test
	public void testTwoStrike() throws BowlingException {
		BowlingGame game = new BowlingGame();
		Frame[] frame = new Frame[10];
		frame[0] = new Frame(1,5);
		frame[1] = new Frame(3,6);
		frame[2] = new Frame(10,0);
		frame[3] = new Frame(10,0);
		frame[4] = new Frame(4,4);
		frame[5] = new Frame(5,3);
		frame[6] = new Frame(3,3);
		frame[7] = new Frame(4,5);
		frame[8] = new Frame(8,1);
		frame[9] = new Frame(2,6);
		
		for( int i = 0; i < 10; i++) {
			game.addFrame(frame[i]);
		}
		assertEquals(game.score(), 91);
		
		
		
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
