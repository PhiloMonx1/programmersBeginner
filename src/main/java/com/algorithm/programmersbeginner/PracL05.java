package com.algorithm.programmersbeginner;

//https://school.programmers.co.kr/learn/courses/30/lessons/12932

public class PracL05 {
	public int[] solution(long n) {
		String s = n+"";
		int[] answer = new int[s.length()];
		int cnt = 0;

		for (int i = answer.length-1; i >= 0; i--) {
			answer[cnt] = (s.charAt(i)) - 48;
			cnt++;
		}

		return answer;
	}

	public static void main(String[] args) {
		PracL05 prac = new PracL05();

		System.out.println(prac.solution(12345));
	}
}
