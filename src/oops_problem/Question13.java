package oops_problem;

//Create an interface Playable with method play(). Implement it in classes Guitar and Piano.

interface Playable{
	void play();
}

class Guitar implements Playable{
	public void play() {
		System.out.println("I am playing Guitar");
	}
}

class Piano implements Playable{
	public void play() {
		System.err.println("I am playing Piano");
	}
}
public class Question13 {
	
	public static void main(String[] args) {
		Playable p1 = new Guitar();
		p1.play();
		
		Playable p2 = new Piano();
		p2.play();
	}
}

