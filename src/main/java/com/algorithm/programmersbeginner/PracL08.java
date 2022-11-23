package com.algorithm.programmersbeginner;

//https://school.programmers.co.kr/learn/courses/30/lessons/12947

public class PracL08 {
	public boolean solution(int x) {
		boolean answer = false;
		String s = x+"";
		int sum = 0;

		for (int i = 0; i < s.length(); i++) {
			sum += Integer.parseInt(String.valueOf(s.charAt(i)));
		}

		while (0<x){
			x -= sum;
			if(x == 0){
				answer = true;
				break;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		PracL08 prac = new PracL08();

		System.out.println(prac.solution(10));
		System.out.println(prac.solution(11));
	}
}
