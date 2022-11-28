package com.algorithm.programmersbeginner;

//https://school.programmers.co.kr/learn/courses/30/lessons/12943

public class PracL13 {
	public int solution(long num) {
		int answer = -1;
		int cnt = 0;

		while (cnt < 500){
			if(num == 1){
				return cnt;
			}
			if(num % 2 == 0){
				num /= 2;
			}else {
				num = (num*3)+1;
			}
			cnt++;
		}

		return answer;
	}

	public static void main(String[] args) {
		PracL13 prac = new PracL13();

		System.out.println(prac.solution(6));
		System.out.println(prac.solution(16));
		System.out.println(prac.solution(626331));
	}
}
