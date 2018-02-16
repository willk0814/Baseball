public class Stat_Calculator {

	
	private int atBats;
	private int hits;
	private int doubles;
	private int triples;
	private int homeRuns;
	private int runs;
	private int walks;
	
	
	public Stat_Calculator(int atBats, int hits, int doubles, int triples, int homeRuns, int runs, int walks) {
		super();
		this.atBats = atBats;
		this.hits = hits;
		this.doubles = doubles;
		this.triples = triples;
		this.homeRuns = homeRuns;
		this.runs = runs;
		this.walks = walks;
	}
	
	public int singles() {
		return this.hits - this.doubles - this.triples - this.homeRuns;
	}
	
	public double BA() {
		return (double) this.hits/this.atBats;
	}
	
	public int TB() {
		return((this.singles()) + (this.doubles * 2) + (this.triples * 3) + (this.homeRuns * 4)); 
	}
	
	public double SLG (){
		return (double) this.TB() / this.atBats;
	}
	
	public double OBP() {
		return (double) (this.hits + this.walks) / (this.atBats + this.walks);
	}

	public double OBS() {
		return this.OBP() + this.SLG();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	


}
