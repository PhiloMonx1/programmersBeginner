package com.algorithm.programmersbeginner;

//https://school.programmers.co.kr/learn/courses/30/lessons/76501
public class PracL17 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;

		for (int i = 0; i < absolutes.length; i++) {
			if(signs[i]){
				answer += absolutes[i];
			}else answer -= absolutes[i];
		}

		return answer;
	}

	public static void main(String[] args) {
		PracL17 prac = new PracL17();

	}
}
