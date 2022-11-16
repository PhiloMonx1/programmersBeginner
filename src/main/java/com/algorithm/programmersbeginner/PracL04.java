package com.algorithm.programmersbeginner;

//https://school.programmers.co.kr/learn/courses/30/lessons/12934
public class PracL04 {
	public long solution(long n) {
		long answer = -1;
		for(long i=0; i<=n; i++){
			if(i*i == n){
				answer = (i+1) * (i+1);
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		PracL04 prac = new PracL04();

		System.out.println(prac.solution(121));
		System.out.println(prac.solution(3));
	}
}
