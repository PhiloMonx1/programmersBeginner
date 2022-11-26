package com.algorithm.programmersbeginner;

//https://school.programmers.co.kr/learn/courses/30/lessons/87389
public class PracL11 {
	public int solution(int n) {
		int answer = n-1;

		if(n % 2 != 0){
			answer = 2;
		}else {
			for (int i = 3; i < n; i++) {
				if(n % i == 1){
					answer = i;
					break;
				}
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		PracL11 prac = new PracL11();

		System.out.println(prac.solution(10));
		System.out.println(prac.solution(12));
		System.out.println(prac.solution(13));
	}
}
