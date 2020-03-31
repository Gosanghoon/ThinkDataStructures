/**
 * 
 */
package com.allendowney.thinkdast;

import java.util.Arrays;

/**
 * @author downey
 *
 */
public class SelectionSort {

	/**
	 * Swaps the elements at indexes i and j.
	 */
	
	/*
	 *	swapElements는 상수시간 연산이다. 
	 *	요소를 읽고 쓰는 것은 상수시간 연산이고 요소의 크기와 첫번째 위치를 알고 있다면 한번의 곱셈과 덧셈으로 어떤 요소의 위치라도 알 수 있기 때문
	 *	swapElements 메서드에 있는 모든 연산이 상수 시간이므로 전체 메서드는 상수 시간이 된다. 
	 */
	public static void swapElements(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	/**
	 * Finds the index of the lowest value
	 * between indices low and high (inclusive).
	 *
	 * indexLowest는 star인자값의 위치에서 시작하여 배열에 있는 가장 작은 요소의 인덱스를 찾는다.
	 * Loop를 돌때마다 배열의 두 요소에 접근하고 한번의 비교연산을 한다.
	 * 이들은 모두 상수 시간 연산이므로 어느것을 세든지 중요하지 않다.
	 *
	 * 예를들어, start 파라미터가 0이면 indexLowest 메서드에서 전체 배열을 검색하고 전체 비교횟수는 배열의 길이인 n이 된다.
	 * 만약, start 인자가 1이면 비교횟수는 n-1이 된다.
	 * 일반적으로 비교횟수는 n - start가 되어 indexLowest 메서드는 선형 알고리즘이 된다.
	 * 
	 */
	public static int indexLowest(int[] array, int start) {
		int lowIndex = start;
		for (int i = start; i < array.length; i++) {
			if (array[i] < array[lowIndex]) {
				lowIndex = i;
			}
		}
		return lowIndex;
	}

	/**
	 * Sorts the cards (in place) using selection sort.
	 */
	public static void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int j = indexLowest(array, i);
			swapElements(array, i, j);
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array = {2, 5, 6, 1, 3};
		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}

}
