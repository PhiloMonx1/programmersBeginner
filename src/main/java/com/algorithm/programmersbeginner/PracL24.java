package com.algorithm.programmersbeginner;
//https://school.programmers.co.kr/learn/courses/30/lessons/12922
public class PracL24 {
	public String solution(int n) {
		String answer = "";
		for(int i=1; i<=n; i++){
			if(i % 2 != 0){
				answer += "수";
			}else answer += "박";
		}
		return answer;
	}

	public static void main(String[] args) {
		PracL24 prac = new PracL24();

		System.out.println(prac.solution(3));
		System.out.println(prac.solution(5));
	}
}
