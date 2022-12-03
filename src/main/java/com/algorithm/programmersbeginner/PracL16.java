package com.algorithm.programmersbeginner;

//https://school.programmers.co.kr/learn/courses/30/lessons/12935
public class PracL16 {
	public int[] solution(int[] arr) {
		int[] answer = new int[arr.length-1];
		if(arr.length == 1){
			return new int[]{-1};
		}else {
			int min = arr[0];
			for (int i = 1; i < arr.length; i++) {
				if(min > arr[i]){
					min = arr[i];
				}
			}

			int j=0;
			for (int i = 0; i < answer.length; i++) {
				if(arr[j] != min){
					answer[i] = arr[j];
					j++;
				}else{
					answer[i] = arr[j+1];
					j+=2;
				}
			}
			return answer;
		}

	}

	public static void main(String[] args) {
		PracL16 prac = new PracL16();

		int[] ar1 = {4,3,2,1};
		int[] ar2 = {10};

		System.out.println(prac.solution(ar1));
		System.out.println(prac.solution(ar2));
	}
}
