public class Frame {
	private int firstThrow;
	private int secondThrow;
	boolean isStrike;
	int myScore;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score(){
		int score = 0;

		
		if(this.isStrike) {
			score = 10;
		} else {
			score = this.firstThrow+this.secondThrow;
		}
		
		this.myScore = score;
		return this.myScore;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(this.getFirstThrow() == 10) {
			this.isStrike = true;
			return true;
		} else {
			this.isStrike = false;
			return false;
		}
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if(this.getFirstThrow()+this.getSecondThrow() == 10) {
			return true;
		} else {
			return false;
		}
	}
}
