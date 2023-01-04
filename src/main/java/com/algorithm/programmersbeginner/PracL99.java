package com.algorithm.programmersbeginner;

public class PracL99 {
	public int solution(String phone_number) {
		int answer = -1;
		
		try {
			if(phone_number.startsWith("+")){
				phone_number.substring(1);
			}
			Long.parseLong(phone_number.replaceAll("-", ""));
		}catch (Exception ignored){
			return answer;
		}

		if(phone_number.length() == 11 && phone_number.startsWith("010")
				&& phone_number.replaceAll("-","").length() == 11){
			answer = 2;
		} else if(phone_number.length() == 13
				&& phone_number.startsWith("010-")
				&& phone_number.replaceAll("-","").length() == 11
				&& phone_number.indexOf("-", 5) == 8){
			answer = 1;
		} else if (phone_number.length() == 16
				&& phone_number.startsWith("+82-10-")
				&& phone_number.replaceAll("-","").length() == 13
				&& phone_number.indexOf("-", 5) == 6
				&& phone_number.indexOf("-", 7) == 11) {
			answer = 3;
		}

		return answer;
	}

	public static void main(String[] args) {
		PracL99 prac = new PracL99();

		System.out.println(prac.solution("01012345678"));
		System.out.println(prac.solution("010-1212-333"));
		System.out.println(prac.solution("010-1212-3334"));
		System.out.println(prac.solution("+82-10-3434-2323"));
		System.out.println(prac.solution("+82-010-3434-2323"));
	}
}
