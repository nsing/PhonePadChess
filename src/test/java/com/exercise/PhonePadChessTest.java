package com.exercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Junit test class for PhonePadChess 
 */
public class PhonePadChessTest {
	
	/**
	 * Test for 1 digit numbers
	 */
	@Test
	public void testOneDigitNumbers() {
		assertEquals(4, PhonePadChess.countNumbers("King", 0, 1));
		assertEquals(4, PhonePadChess.countNumbers("King", 1, 1));
		assertEquals(6, PhonePadChess.countNumbers("King", 2, 1));
		assertEquals(4, PhonePadChess.countNumbers("King", 3, 1));
		assertEquals(6, PhonePadChess.countNumbers("King", 4, 1));
		assertEquals(9, PhonePadChess.countNumbers("King", 5, 1));
		assertEquals(6, PhonePadChess.countNumbers("King", 6, 1));
		assertEquals(5, PhonePadChess.countNumbers("King", 7, 1));
		assertEquals(7, PhonePadChess.countNumbers("King", 8, 1));
		assertEquals(5, PhonePadChess.countNumbers("King", 9, 1));
		
		assertEquals(6, PhonePadChess.countNumbers("Queen", 0, 1));
		assertEquals(7, PhonePadChess.countNumbers("Queen", 1, 1));
		assertEquals(8, PhonePadChess.countNumbers("Queen", 2, 1));
		assertEquals(7, PhonePadChess.countNumbers("Queen", 3, 1));
		assertEquals(7, PhonePadChess.countNumbers("Queen", 4, 1));
		assertEquals(8, PhonePadChess.countNumbers("Queen", 5, 1));
		assertEquals(7, PhonePadChess.countNumbers("Queen", 6, 1));
		assertEquals(8, PhonePadChess.countNumbers("Queen", 7, 1));
		assertEquals(8, PhonePadChess.countNumbers("Queen", 8, 1));
		assertEquals(7, PhonePadChess.countNumbers("Queen", 9, 1));
		
		assertEquals(3, PhonePadChess.countNumbers("Bishop", 0, 1));
		assertEquals(3, PhonePadChess.countNumbers("Bishop", 1, 1));
		assertEquals(3, PhonePadChess.countNumbers("Bishop", 2, 1));
		assertEquals(3, PhonePadChess.countNumbers("Bishop", 3, 1));
		assertEquals(3, PhonePadChess.countNumbers("Bishop", 4, 1));
		assertEquals(5, PhonePadChess.countNumbers("Bishop", 5, 1));
		assertEquals(3, PhonePadChess.countNumbers("Bishop", 6, 1));
		assertEquals(4, PhonePadChess.countNumbers("Bishop", 7, 1));
		assertEquals(3, PhonePadChess.countNumbers("Bishop", 8, 1));
		assertEquals(4, PhonePadChess.countNumbers("Bishop", 9, 1));
		
		assertEquals(3, PhonePadChess.countNumbers("Knight", 0, 1));
		assertEquals(3, PhonePadChess.countNumbers("Knight", 1, 1));
		assertEquals(3, PhonePadChess.countNumbers("Knight", 2, 1));
		assertEquals(3, PhonePadChess.countNumbers("Knight", 3, 1));
		assertEquals(4, PhonePadChess.countNumbers("Knight", 4, 1));
		assertEquals(1, PhonePadChess.countNumbers("Knight", 5, 1));
		assertEquals(4, PhonePadChess.countNumbers("Knight", 6, 1));
		assertEquals(3, PhonePadChess.countNumbers("Knight", 7, 1));
		assertEquals(3, PhonePadChess.countNumbers("Knight", 8, 1));
		assertEquals(3, PhonePadChess.countNumbers("Knight", 9, 1));
		
		assertEquals(3, PhonePadChess.countNumbers("Rook", 0, 1));
		assertEquals(5, PhonePadChess.countNumbers("Rook", 1, 1));
		assertEquals(6, PhonePadChess.countNumbers("Rook", 2, 1));
		assertEquals(5, PhonePadChess.countNumbers("Rook", 3, 1));
		assertEquals(5, PhonePadChess.countNumbers("Rook", 4, 1));
		assertEquals(6, PhonePadChess.countNumbers("Rook", 5, 1));
		assertEquals(5, PhonePadChess.countNumbers("Rook", 6, 1));
		assertEquals(5, PhonePadChess.countNumbers("Rook", 7, 1));
		assertEquals(6, PhonePadChess.countNumbers("Rook", 8, 1));
		assertEquals(5, PhonePadChess.countNumbers("Rook", 9, 1));
		
		assertEquals(3, PhonePadChess.countNumbers("Pawn", 0, 1));
		assertEquals(7, PhonePadChess.countNumbers("Pawn", 1, 1));
		assertEquals(8, PhonePadChess.countNumbers("Pawn", 2, 1));
		assertEquals(7, PhonePadChess.countNumbers("Pawn", 3, 1));
		assertEquals(2, PhonePadChess.countNumbers("Pawn", 4, 1));
		assertEquals(2, PhonePadChess.countNumbers("Pawn", 5, 1));
		assertEquals(2, PhonePadChess.countNumbers("Pawn", 6, 1));
		assertEquals(3, PhonePadChess.countNumbers("Pawn", 7, 1));
		assertEquals(3, PhonePadChess.countNumbers("Pawn", 8, 1));
		assertEquals(3, PhonePadChess.countNumbers("Pawn", 9, 1));
		
	}
	
	/**
	 * Test for 10 digit numbers
	 */
	@Test
	public void testTwoDigitsNumbers() {
		assertEquals(21, PhonePadChess.countNumbers("King", 0, 2));
		assertEquals(25, PhonePadChess.countNumbers("King", 1, 2));
		assertEquals(35, PhonePadChess.countNumbers("King", 2, 2));
		assertEquals(25, PhonePadChess.countNumbers("King", 3, 2));
		assertEquals(37, PhonePadChess.countNumbers("King", 4, 2));
		assertEquals(52, PhonePadChess.countNumbers("King", 5, 2));
		assertEquals(37, PhonePadChess.countNumbers("King", 6, 2));
		assertEquals(31, PhonePadChess.countNumbers("King", 7, 2));
		assertEquals(42, PhonePadChess.countNumbers("King", 8, 2));
		assertEquals(31, PhonePadChess.countNumbers("King", 9, 2));

		assertEquals(45, PhonePadChess.countNumbers("Queen", 0, 2));
		assertEquals(52, PhonePadChess.countNumbers("Queen", 1, 2));
		assertEquals(58, PhonePadChess.countNumbers("Queen", 2, 2));
		assertEquals(52, PhonePadChess.countNumbers("Queen", 3, 2));
		assertEquals(53, PhonePadChess.countNumbers("Queen", 4, 2));
		assertEquals(58, PhonePadChess.countNumbers("Queen", 5, 2));
		assertEquals(52, PhonePadChess.countNumbers("Queen", 6, 2));
		assertEquals(58, PhonePadChess.countNumbers("Queen", 7, 2));
		assertEquals(59, PhonePadChess.countNumbers("Queen", 8, 2));
		assertEquals(52, PhonePadChess.countNumbers("Queen", 9, 2));
		
		assertEquals(11, PhonePadChess.countNumbers("Bishop", 0, 2));
		assertEquals(12, PhonePadChess.countNumbers("Bishop", 1, 2));
		assertEquals(9, PhonePadChess.countNumbers("Bishop", 2, 2));
		assertEquals(12, PhonePadChess.countNumbers("Bishop", 3, 2));
		assertEquals(9, PhonePadChess.countNumbers("Bishop", 4, 2));
		assertEquals(19, PhonePadChess.countNumbers("Bishop", 5, 2));
		assertEquals(9, PhonePadChess.countNumbers("Bishop", 6, 2));
		assertEquals(15, PhonePadChess.countNumbers("Bishop", 7, 2));
		assertEquals(9, PhonePadChess.countNumbers("Bishop", 8, 2));
		assertEquals(15, PhonePadChess.countNumbers("Bishop", 9, 2));

		assertEquals(11, PhonePadChess.countNumbers("Knight", 0, 2));
		assertEquals(10, PhonePadChess.countNumbers("Knight", 1, 2));
		assertEquals(9, PhonePadChess.countNumbers("Knight", 2, 2));
		assertEquals(10, PhonePadChess.countNumbers("Knight", 3, 2));
		assertEquals(13, PhonePadChess.countNumbers("Knight", 4, 2));
		assertEquals(1, PhonePadChess.countNumbers("Knight", 5, 2));
		assertEquals(13, PhonePadChess.countNumbers("Knight", 6, 2));
		assertEquals(10, PhonePadChess.countNumbers("Knight", 7, 2));
		assertEquals(9, PhonePadChess.countNumbers("Knight", 8, 2));
		assertEquals(10, PhonePadChess.countNumbers("Knight", 9, 2));

		assertEquals(15, PhonePadChess.countNumbers("Rook", 0, 2));
		assertEquals(26, PhonePadChess.countNumbers("Rook", 1, 2));
		assertEquals(31, PhonePadChess.countNumbers("Rook", 2, 2));
		assertEquals(26, PhonePadChess.countNumbers("Rook", 3, 2));
		assertEquals(26, PhonePadChess.countNumbers("Rook", 4, 2));
		assertEquals(31, PhonePadChess.countNumbers("Rook", 5, 2));
		assertEquals(26, PhonePadChess.countNumbers("Rook", 6, 2));
		assertEquals(26, PhonePadChess.countNumbers("Rook", 7, 2));
		assertEquals(31, PhonePadChess.countNumbers("Rook", 8, 2));
		assertEquals(26, PhonePadChess.countNumbers("Rook", 9, 2));
		
		assertEquals(8, PhonePadChess.countNumbers("Pawn", 0, 2));
		assertEquals(52, PhonePadChess.countNumbers("Pawn", 1, 2));
		assertEquals(58, PhonePadChess.countNumbers("Pawn", 2, 2));
		assertEquals(52, PhonePadChess.countNumbers("Pawn", 3, 2));
		assertEquals(9, PhonePadChess.countNumbers("Pawn", 4, 2));
		assertEquals(10, PhonePadChess.countNumbers("Pawn", 5, 2));
		assertEquals(9, PhonePadChess.countNumbers("Pawn", 6, 2));
		assertEquals(12, PhonePadChess.countNumbers("Pawn", 7, 2));
		assertEquals(13, PhonePadChess.countNumbers("Pawn", 8, 2));
		assertEquals(12, PhonePadChess.countNumbers("Pawn", 9, 2));
	}
	
	/**
	 * Test for 10 digit numbers for Queen and starting position 5
	 */
	@Test
	public void testTenDigitsNumbersForQueen5() {
		assertEquals(506435171, PhonePadChess.countNumbers("Queen", 5, 10));
	}	

}
