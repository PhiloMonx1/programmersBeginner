package com.algorithm.programmersbeginner;

//https://school.programmers.co.kr/learn/courses/30/lessons/12925

public class PracL07 {
	public int solution(String s) {
		int answer = 0;
		int cnt = 1;

		for(int i = s.length()-1; i>=0; i--){
			switch (s.charAt(i)) {
				case '0':
					answer += 0;
					break;
				case '1':
					answer += cnt;
					break;
				case '2':
					answer += 2 * cnt;
					break;
				case '3':
					answer += 3 * cnt;
					break;
				case '4':
					answer += 4 * cnt;
					break;
				case '5':
					answer += 5 * cnt;
					break;
				case '6':
					answer += 6 * cnt;
					break;
				case '7':
					answer += 7 * cnt;
					break;
				case '8':
					answer += 8 * cnt;
					break;
				case '9':
					answer += 9 * cnt;
					break;
			}
			cnt *= 10;
		}

		if(s.charAt(0) == '-'){
			answer -= answer*2;
		}

		return answer;
	}

	public static void main(String[] args) {
		PracL07 prac = new PracL07();

		System.out.println(prac.solution("-12345"));
	}
}
