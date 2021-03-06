public class Frame {
	private int firstThrow;
	private int secondThrow;
	public static int globalIndex = 0;
	public int index;
	public int score;

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
	
	public void updateScore(int value) {
		this.score = this.score+value;
	}

	//returns the score of a single frame
	public int score(){
		if(this.isStrike()) {
			
		} else if(this.isSpare()){
			this.score = this.firstThrow+this.secondThrow;
		} else {
			this.score = this.firstThrow+this.secondThrow;
		}
		return this.score;
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
		if(this.getFirstThrow()+this.getSecondThrow() == 10) {
			return true;
		} else {
			return false;
		}
	}
}
