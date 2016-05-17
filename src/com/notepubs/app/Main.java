package com.notepubs.app;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int temp;
		int[] a = new int[3];

		do {
			for (int i = 0; i < 3; i++)
				a[i] = scan.nextInt();

		} while (!(1 <= a[0] && a[0] <= 100 && 1 <= a[1] && a[1] <= 100 && 1 <= a[2] && a[2] <= 100));
		for (int x = 0; x < 3; x++) {
			for (int y = x + 1; y < 3; y++) {
				if (a[x] > a[y]) {
					temp = a[x];
					a[x] = a[y];
					a[y] = temp;
				}
			}
		}
		System.out.println(a[1]);

	}

}
