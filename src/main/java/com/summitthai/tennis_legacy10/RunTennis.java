package com.summitthai.tennis_legacy10;

public class RunTennis {
	public static void main(String[] args) {
		
		int scoreA = 2;
		int scoreB = 3;
		getBattle(scoreA, scoreB);

	}
	
	private static String computeScore(int score) {
		String description = "";
		
		if (score == 0) {
			description = "love";
		} else if (score == 1) {
			description = "fifteen";
		} else if (score == 2) {
			description = "thirty";
		} else if (score == 3) {
			description = "forty";
		}
		
		return description;
	}
	
	private static void getBattle(int scoreA, int scoreB) {
		System.out.println(computeScore(scoreA) + "-" + computeScore(scoreB));
		
		findWinner(scoreA, scoreB);
	}
	
	private static void findWinner(int scoreA, int scoreB) {
		
		int deltaScore = scoreA - scoreB;
		
		if (deltaScore >= 4 || deltaScore <= -4) {
			
			String winner = "";
			if (deltaScore >= 0) {
				winner = "A";
			} else {
				winner = "B";
			}
			
			System.out.println(winner+" WIN");
		} else if (deltaScore == 0 && scoreA >=3 && scoreB >=3) {
			System.out.println(" deuce");
		}
	}
	
}
