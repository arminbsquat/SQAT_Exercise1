import java.util.ArrayList;
import java.util.List;

//Finish time:
//ID:

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	public Frame[] framesArray;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame) throws BowlingException {
		if(this.frames.size() > 10) {
			throw new BowlingException();
		} else {
			frame.index = Frame.globalIndex;
			this.frames.add(frame);
			Frame.globalIndex++;
		}
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
	}
	
	// Returns the game score
	public int score(){
		int gameScore = 0;
		
		// update game scores; 
		for(int i = 0; i < frames.size(); i++) {
			if(frames.get(i).isStrike() && i+1 < frames.size()) {
				frames.get(i).updateScore(frames.get(i+1).score);
			}
			if(frames.get(i).isSpare() && i+1 < frames.size()) {
				frames.get(i).updateScore(frames.get(i+1).getFirstThrow());
			}
			if(frames.get(i).isStrike() && i+1 == frames.size()) { // last frame a strike
				
			}
			if(frames.get(i).isSpare() && i+1 == frames.size()) { // last frame a spare
				
			}
		}
		
		for(Frame frame : this.frames) {
			gameScore = gameScore + frame.score;
		}
		
		return gameScore;
	}
	
	
	
}
