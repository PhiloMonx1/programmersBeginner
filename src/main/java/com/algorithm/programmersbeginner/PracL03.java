package com.algorithm.programmersbeginner;

//https://school.programmers.co.kr/learn/courses/30/lessons/12928
public class PracL03 {
	public int solution(int n) {
		int answer = 0;
		String s = n+"";
		for(int i=0; i<s.length(); i++){
			answer += Integer.parseInt(String.valueOf(s.charAt(i)));
		}

		return answer;
	}

	public static void main(String[] args) {
		PracL03 prac = new PracL03();

		System.out.println(prac.solution(123));
		System.out.println(prac.solution(987));
	}
}
