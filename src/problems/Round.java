package problems;
import java.util.*;
public class Round {
	
	int leaves ;
	int rounds;
	
	Scanner sc = new Scanner(System.in);
	public Round(){
		System.out.println("enter the no of leaves");
		this.leaves=sc.nextInt();
		
		this.rounds=leaves/30;
		System.out.println("asif completes "+rounds+" rounds");
		
		
	}
	
	public static void main(String[] args) {
		new Round();
	}

}
