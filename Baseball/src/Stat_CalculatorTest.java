import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Stat_CalculatorTest {

	@Test
	void test() {
		int atBats = 8399;
	    int hits = 2873;
		int doubles = 506;
		int triples = 136;
		int homeRuns = 714;
		int runs = 2174;
		int walks = 2062;
		
		

		Stat_Calculator stat = new Stat_Calculator(atBats, hits, doubles, triples, homeRuns, runs, walks);
	

		double dExpectedBA = 0.342;
		double dExpectedOBP = 0.474;
		double dExpectedSLG = 0.690;
		double dExpectedOBS = 1.164;
		double dExpectedTB = 5793;
		

		assertEquals(dExpectedBA, stat.BA(), 0.01);
		assertEquals(dExpectedOBP, stat.OBP(), 0.01);
		assertEquals(dExpectedSLG, stat.SLG(), 0.01);
		assertEquals(dExpectedOBS, stat.OBS(), 0.01);
		assertEquals(dExpectedTB, stat.TB(), 0.01);
	}

}
