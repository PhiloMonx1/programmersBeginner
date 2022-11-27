package com.algorithm.programmersbeginner;

//https://school.programmers.co.kr/learn/courses/30/lessons/12912

public class PracL12 {
	public long solution(int a, int b) {
		long answer = 0;

		if(a == b){
			return a;
		} else if (a < b) {
			for(int i = a; i <= b; i++){
				answer += i;
			}
		}else {
			for(int i = b; i <= a; i++){
				answer += i;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		PracL12 prac = new PracL12();

		System.out.println(prac.solution(3,5));
		System.out.println(prac.solution(3,3));
		System.out.println(prac.solution(5,3));
	}
}
