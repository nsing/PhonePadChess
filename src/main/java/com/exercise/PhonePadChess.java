package com.exercise;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * This class stores possible moves for all chess pieces on phone pad.<br>
 * This also contains function to count the number of given digits possible by
 * moving a chess piece from a given position
 */
public class PhonePadChess {
	/*
	 * Constant storing data file name
	 */
	private static final String DATA_FILE = "data.txt";

	/*
	 * Map to store all chess piece moves
	 */
	private static Map<ChessPiece, Map<Integer, List<Integer>>> allPiecesMoves;

	/*
	 * static block to load chess piece moves data
	 */
	static {
		loadData();
	}

	/**
	 * This enum for chess pieces
	 */
	private enum ChessPiece {
		// All chess pieces:
		KING, QUEEN, BISHOP, KNIGHT, ROOK, PAWN;

		/**
		 * Returns ChessPiece from a given String
		 * 
		 * @param pieceName
		 *            - Chess piece name
		 * @return ChessPiece enum
		 */
		static ChessPiece getChessPiece(String pieceName) {
			return ChessPiece.valueOf(pieceName.toUpperCase());
		}
	}

	/**
	 * Loads moves for all chess pieces from a file
	 */
	private static void loadData() {
		// Create EnumMap to store moves for all chess pieces:
		allPiecesMoves = new EnumMap<ChessPiece, Map<Integer, List<Integer>>>(
				ChessPiece.class);
		// Create Scanner to read moves from a file:
		Scanner sc = new Scanner(
				PhonePadChess.class.getResourceAsStream(DATA_FILE));
		// Read file line by line and load data:
		while (sc.hasNextLine()) {
			String line = sc.nextLine();
			if (0 == line.indexOf("--")) {
				// Ignore comment line:
				continue;
			}
			// Split line into fields:
			String[] fields = line.split(" ");
			// 1st field is chess piece name:
			String chessPieceName = fields[0];
			// Get corresponding enum for chess piece name:
			ChessPiece chessPiece = ChessPiece.getChessPiece(chessPieceName);
			// Create a HashMap to store all moves for chess piece:
			Map<Integer, List<Integer>> chessPieceMoves = new HashMap<Integer, List<Integer>>();
			// Extract moves for chess piece from 2nd and subsequent fields:
			for (int i = 1; i < fields.length; i++) {
				/*
				 * Create an ArrayList to store all next moves from i-1 (i-1 =
				 * 0,1,....9)
				 */
				List<Integer> chessPieceMovesFrom = new ArrayList<Integer>(10);
				if (!fields[i].equals("NA")) {
					/*
					 * If field value is not "NA" i.e. value is not to be
					 * ignored then extract moves and add into the ArrayList<br>
					 * NA is applicable to positions 1, 2 and 3 where PAWN
					 * becomes QUEEN
					 */
					for (int j = 0; j < fields[i].length(); j++) {
						chessPieceMovesFrom.add(Character
								.getNumericValue(fields[i].charAt(j)));
					}
				}
				// Add all next moves from position i-1:
				chessPieceMoves.put(i - 1, chessPieceMovesFrom);
			}
			// Add all moves for chess piece:
			allPiecesMoves.put(chessPiece, chessPieceMoves);
		}
		sc.close(); // Close scanner
	}

	/**
	 * Recursive method to count numbers
	 * 
	 * @param chessPiece
	 *            - ChessPiece enum
	 * @param from
	 *            - Starting position
	 * @param n
	 *            - Number of digits
	 * @return Count of numbers
	 */
	private static int countNumbers(ChessPiece chessPiece, int from, int n) {
		if (chessPiece == ChessPiece.PAWN
				&& (from == 1 || from == 2 || from == 3)) {
			// Convert PAWN into QUEEN if position is any of 1, 2 or 3:
			chessPiece = ChessPiece.QUEEN;
		}
		if (1 == n) {
			/*
			 * Count of possible 1 digit numbers from a position = No. of all
			 * next moves from that position
			 */
			return allPiecesMoves.get(chessPiece).get(from).size();
		} else {
			/*
			 * Count of n digits numbers from a position = Sum of counts of n-1
			 * digits numbers from all positions reached by next moves from that
			 * position
			 */
			List<Integer> movesFrom = allPiecesMoves.get(chessPiece).get(from);
			int count = 0;
			for (int i = 0; i < movesFrom.size(); i++) {
				count += countNumbers(chessPiece, movesFrom.get(i), n - 1);
			}
			return count;
		}
	}

	/**
	 * Returns count of n digits numbers from a position
	 * 
	 * @param pieceName
	 *            - Piece name
	 * @param from
	 *            - Starting position
	 * @param n
	 *            - Number of digits
	 * @return Count of numbers
	 */
	public static int countNumbers(String pieceName, int from, int n) {
		// Get chess piece enum from the string:
		ChessPiece chessPiece = ChessPiece.getChessPiece(pieceName);
		// Return result of countNumbers function:
		return countNumbers(chessPiece, from, n);
	}

	/**
	 * Main method taking two arguments<br>
	 * Chess piece name (String) is expected as args[0]<br>
	 * Starting position (int) is expected as args[1]
	 * 
	 * @param args
	 *            - Program arguments
	 */
	public static void main(String[] args) {
		if (args.length < 2) {
			// Not enough arguments
			throw new IllegalArgumentException(
					"All arguments (chess piece name and starting position) haven't been provided");
		} else {
			// Set chess piece name:
			String pieceName = args[0];
			// Set starting position:
			int from = Integer.parseInt(args[1]);
			/*
			 * Call countNumbers function (for chess piece name, starting
			 * position & 10 digits) and print the output
			 */
			System.out.println(PhonePadChess.countNumbers(pieceName, from, 10));
		}
	}

}