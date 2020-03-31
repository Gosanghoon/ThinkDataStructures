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
	 *	swapElements�� ����ð� �����̴�. 
	 *	��Ҹ� �а� ���� ���� ����ð� �����̰� ����� ũ��� ù��° ��ġ�� �˰� �ִٸ� �ѹ��� ������ �������� � ����� ��ġ�� �� �� �ֱ� ����
	 *	swapElements �޼��忡 �ִ� ��� ������ ��� �ð��̹Ƿ� ��ü �޼���� ��� �ð��� �ȴ�. 
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
	 * indexLowest�� star���ڰ��� ��ġ���� �����Ͽ� �迭�� �ִ� ���� ���� ����� �ε����� ã�´�.
	 * Loop�� �������� �迭�� �� ��ҿ� �����ϰ� �ѹ��� �񱳿����� �Ѵ�.
	 * �̵��� ��� ��� �ð� �����̹Ƿ� ������� ������ �߿����� �ʴ�.
	 *
	 * �������, start �Ķ���Ͱ� 0�̸� indexLowest �޼��忡�� ��ü �迭�� �˻��ϰ� ��ü ��Ƚ���� �迭�� ������ n�� �ȴ�.
	 * ����, start ���ڰ� 1�̸� ��Ƚ���� n-1�� �ȴ�.
	 * �Ϲ������� ��Ƚ���� n - start�� �Ǿ� indexLowest �޼���� ���� �˰����� �ȴ�.
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
