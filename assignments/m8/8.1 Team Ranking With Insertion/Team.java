class Team implements Comparable<Team> {
	String teamname;
	int wins, losses, draws;
	Team(String teamname, int wins, int losses, int draws) {
		this.teamname = teamname;
		this.wins = wins;
		this.losses = losses;
		this.draws = draws;
	}
	public String getTeamname() {
          return this.teamname;
	}
	public int getWins() {
		return this.wins;
	}
	public int getLosses() {
		return this.losses;
	}
	public int getDraws() {
		return this.draws;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public void setWins(int wins) {
		this.wins = wins;
	}
	public void setLosses(int losses) {
		this.losses = losses;
	}
	public void setDraws(int draws) {
		this.draws = draws;
	}
	public String toString() {
		return this.teamname;
	}
	public int compareTo(Team that) {
		if(this.wins > that.wins) return -1;
		if(this.wins < that.wins) return 1;
		if(this.losses < that.losses) return -1;
		if(this.losses > that.losses) return 1;
		if(this.draws > that.draws) return -1;
		if(this.draws < that.draws) return 1;
		return 0;
	}
    
}
