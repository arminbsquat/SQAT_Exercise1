import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	Frame[] framesArray;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException {
		if(this.frames.size() > 10) {
			throw new BowlingException();
		} else {
			this.frames.add(frame);
		}
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		int gameScore = 0;
		framesArray = new Frame[this.frames.size()];
		
		
			
			
			
				
		}
		
		
		
		return gameScore;
	}
	
	
	
}
