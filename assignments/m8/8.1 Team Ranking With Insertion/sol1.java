import java.util.*;
import java.util.Arrays;

public class sol1 {


	sol1() {

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i = 0;
		Team[] teams = new Team[100];
		String[] tokens = scan.nextLine().split(",");
		while(scan.hasNext()) {
			 teams[i++] = new Team(tokens[0] ,Integer.parseInt(tokens[1]) ,Integer.parseInt(tokens[2]) ,Integer.parseInt(tokens[3]));	
		}
		Selectionsort.sort(teams);
			String result = Arrays.toString(teams);

	}
}



class Team implements Comparable<Team>{
	String name;
	int win;
	int loss;
	int draw;

	Team(String name, int win, int loss, int draw) {
		this.name = name;
		this.win = win;
		this.loss = loss;
		this.draw = draw;
	}


	public String getName() {
		return this.name;
	}

	public int getWin() {
		return  this.win;
	}

	public int getLoss() {
		return this.loss;
	}

	public int getDraw() {
		return this.draw;
	}



	public int compareTo(final Team that) {

		if(this.win > that.win) {
			return 1;
		}

		if(this.win < that.win) {
			return -1;
		}

		if(this.loss > that.loss) {
			return 1;
		}

		if(this.loss < that.loss) {
			return -1;
		}

		if(this.draw > that.draw) {
			return 1;
		}

		if(this.draw < that.draw) {
			return -1;
		}

		return 0;
	}


public String toString(){
	return this.name;
	}
}
