package lab3;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {
	GradeBook g1;
	GradeBook g2;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		
		g1.addScore(2);
		g1.addScore(5);
		g1.addScore(7);
		g1.addScore(16);
		g1.addScore(9);
		
		g2.addScore(6);
		g2.addScore(12);
		g2.addScore(23);
		g2.addScore(21);
		g2.addScore(8);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = g2 = null;
	}
	
	@Test
	public void testAddScore() {
		 assertTrue(g1.toString().equals("2.0 5.0 7.0 16.0 9.0 "));
		 assertTrue(g2.toString().equals("6.0 12.0 23.0 21.0 8.0 " ));
		 
		 assertEquals(5,g1.getScoreSize(),.001);
		 assertEquals(5,g2.getScoreSize(),.001);
	}

	@Test
	public void testSum() {
		assertEquals(39, g1.sum(), .0001);
		assertEquals(70, g2.sum(), .0001);
	}

	@Test
	public void testMinimum() {
		assertEquals(2, g1.minimum(), .001);
		assertEquals(6, g2.minimum(), .001);
	}

	@Test
	public void testFinalScore() {
		assertEquals(37, g1.finalScore(), .0001);
		assertEquals(64, g2.finalScore(), .0001);
	}

	@Test
	public void testGetScoreSize() {
		assertEquals(5, g1.getScoreSize(),.001);
		assertEquals(5, g2.getScoreSize(),.001);
	}

	@Test
	public void testToString() {
		assertTrue(g1.toString().equals("2.0 5.0 7.0 16.0 9.0 "));
		assertTrue(g2.toString().equals("6.0 12.0 23.0 21.0 8.0 " ));
	}

}
