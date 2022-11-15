package com.algorithm.programmersbeginner;

//https://school.programmers.co.kr/learn/courses/30/lessons/132267
public class PracL02 {
	public int solution(int a, int b, int n) {
		int answer = 0;
		while (n >= a){
			n = n - (a-b);
			answer += b;
		}
		return answer;
	}

	public static void main(String[] args) {
		PracL02 prac = new PracL02();

		System.out.println(prac.solution(2, 1, 20));
		System.out.println(prac.solution(3, 1, 20));
	}
}
