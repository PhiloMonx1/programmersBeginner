package com.algorithm.programmersbeginner;

//https://school.programmers.co.kr/learn/courses/30/lessons/12948

public class PracL15 {
	public String solution(String phone_number) {
		String answer = "";
		for (int i = 0; i < phone_number.substring(0, phone_number.length()-4).length(); i++) {
			answer += "*";
		}

		return answer + phone_number.substring(phone_number.length()-4);
	}

	public static void main(String[] args) {
		PracL15 prac = new PracL15();

		System.out.println(prac.solution("01033334444"));
		System.out.println(prac.solution("027778888"));
	}
}
