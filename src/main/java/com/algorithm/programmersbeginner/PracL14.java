package com.algorithm.programmersbeginner;

//https://school.pro서울에서 김서방 찾기grammers.co.kr/learn/courses/30/lessons/12919

public class PracL14 {
	public String solution(String[] seoul) {
		int cnt = 0;
		String answer = "김서방은 1에 있다";

		for (String s : seoul) {
			if(s.equals("Kim")){
				answer = "김서방은 "+cnt+"에 있다";
				return answer;
			}else cnt++;
		}
		return answer;
	}

	public static void main(String[] args) {
		PracL14 prac = new PracL14();
		String[] ar = {"Jane", "zz","Jane", "zz","Jane", "zz", "Kim"};
		System.out.println(prac.solution(ar));
	}
}
