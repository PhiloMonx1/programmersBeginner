package com.algorithm.programmersbeginner;

//https://school.programmers.co.kr/learn/courses/30/lessons/12916

public class PracL06 {
	boolean solution(String s) {
		boolean answer = false;
		s = s.toLowerCase();
		int pCnt = s.length() - s.replaceAll("p", "").length();
		int yCnt = s.length() - s.replaceAll("y", "").length();

		if(pCnt == yCnt){
			answer = true;
		}

		return answer;
	}

	public static void main(String[] args) {
		PracL06 prac = new PracL06();

		System.out.println(prac.solution("pPoooyY"));
		System.out.println(prac.solution("Pyy"));
	}
}
