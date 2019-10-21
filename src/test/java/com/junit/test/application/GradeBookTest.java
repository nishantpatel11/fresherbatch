package com.junit.test.application;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.java.gradebook.GradeBook;

public class GradeBookTest {



	private GradeBook g1;
	private GradeBook g2;

	@Before
	public void setUp() throws Exception {

		g1 = new GradeBook(4);
		g2 = new GradeBook(4);

		g1.addScore(45);
		g1.addScore(68);
		g1.addScore(35);
		g1.addScore(22);

		g2.addScore(99);
		g2.addScore(10);
		g2.addScore(77);
		g2.addScore(43);
	}

	@After
	public void tearDown() throws Exception {

		g1 = null;
		g2 = null;

	}

	@Test
	public void testAddScore() {

		System.out.println(g1.toString());
		assertTrue(g1.toString().equals("45.0 68.0 35.0 22.0"));
		assertTrue(g2.toString().equals("99.0 10.0 77.0 43.0"));

		assertEquals(22,g1.minimum(),.001);
		assertEquals(170,g1.sum(),.001);
		assertEquals(148,g1.finalScore(),.001);
		assertEquals(4,g1.getScoresSize(),.001);

		assertEquals(229,g2.sum(),.001);
		assertEquals(10,g2.minimum(),.001);
		assertEquals(219,g2.finalScore(),.001);
		assertEquals(4,g2.getScoresSize(),.001);

	}
}
