public class Frame {
	private int firstThrow;
	private int secondThrow;
	
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
		if(this.isStrike()) {
			score = 10 ;
		} else {
			score = this.firstThrow+this.secondThrow;
		}
		
		return score;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(this.getFirstThrow() == 10) {
			return true;
		} else {
			return false;
		}
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		//to be implemented
		return false;
	}
}
