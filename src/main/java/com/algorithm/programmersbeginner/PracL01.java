package com.algorithm.programmersbeginner;

// https://school.programmers.co.kr/learn/courses/30/lessons/12928
public class PracL01 {
	public int solution(int n) {
		int answer = 0;
		for(int i=1; i<n+1; i++){
			if(n%i == 0){
				answer += i;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		PracL01 pracL01 = new PracL01();

		System.out.println(pracL01.solution(12));
	}
}
