package com.gautam.spring.Service;

import java.util.ArrayList;
import java.util.Collections;

public class Game {
	static int q = 3;

	public static ArrayList<String> getStartNumbers() {

		int k = 1;
		int n = (q * q);
		String[][] b = new String[q][q];
		String[][] c = new String[q][q];
		ArrayList<String> a = new ArrayList<String>();

		ArrayList<String> adjacents = new ArrayList<String>(n);

		for (int i = 0; i < n; i++) {
			if (k <= n - 1) {
				a.add(Integer.toString(k));
				k++;
			} else {

				a.add("[]");
			}

		}
		k = 0;
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < q; j++) {

				b[i][j] = a.get(k);
				k++;
			}
		}

		Collections.shuffle(a);

		k = 0;
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < q; j++) {

				c[i][j] = a.get(k);
				k++;
			}
		}

		int m[] = getIndex(c, "[]");

		int row = m[0];
		int column = m[1];

		int top = row - 1;
		int bottom = row + 1;
		int left = column - 1;
		int right = column + 1;

		if (top == -1 && left == -1) {
			adjacents.add(c[bottom][column]);
			adjacents.add(c[row][right]);
			a.add(c[bottom][column]);
			a.add(c[row][right]);

		} else if (top == -1 && right > q - 1) {
			adjacents.add(c[bottom][column]);
			adjacents.add(c[row][left]);
			a.add(c[bottom][column]);
			a.add(c[row][left]);

		} else if (bottom > q - 1 && right > q - 1) {
			adjacents.add(c[top][column]);
			adjacents.add(c[row][left]);
			a.add(c[top][column]);
			a.add(c[row][left]);

		}

		else if (left == -1 && bottom > q - 1) {
			adjacents.add(c[top][column]);
			adjacents.add(c[row][right]);
			a.add(c[top][column]);
			a.add(c[row][right]);

		}

		else if (top == -1) {
			adjacents.add(c[row][left]);
			adjacents.add(c[row][right]);
			adjacents.add(c[bottom][column]);
			a.add(c[row][left]);
			a.add(c[row][right]);
			a.add(c[bottom][column]);

		} else if (bottom > q - 1) {
			adjacents.add((c[top][column]));
			adjacents.add(c[row][right]);
			adjacents.add(c[row][left]);
			a.add(c[top][column]);
			a.add(c[row][right]);
			a.add(c[row][left]);

		}

		else if (right > q - 1) {
			adjacents.add(c[top][column]);
			adjacents.add(c[bottom][column]);
			adjacents.add(c[row][left]);
			a.add(c[top][column]);
			a.add(c[bottom][column]);
			a.add(c[row][left]);

		}

		else if (left == -1) {
			adjacents.add(c[top][column]);
			adjacents.add(c[bottom][column]);
			adjacents.add(c[row][right]);
			a.add(c[top][column]);
			a.add(c[bottom][column]);
			a.add(c[row][right]);

		}

		else {
			adjacents.add(c[top][column]);
			adjacents.add(c[bottom][column]);
			adjacents.add(c[row][right]);
			adjacents.add(c[row][left]);
			a.add(c[top][column]);
			a.add(c[bottom][column]);
			a.add(c[row][right]);
			a.add(c[row][left]);
		}

		return a;

	}

	public static int[] getIndex(String[][] a, String s) {
		int[] x = new int[2];
		for (int i = 0; i < a.length; i++)
			for (int j = 0; j < a.length; j++) {
				if (a[i][j].contains(s)) {
					x[0] = i;
					x[1] = j;

				}

			}
		return x;
	}

	public static ArrayList<String> beginNumberGame(int input, ArrayList<String> b) {

		int k = 0;
		ArrayList<String> adjacents = new ArrayList<String>(q * q);
		ArrayList<String> a = new ArrayList<String>();
		ArrayList<String> x=new ArrayList<String>();
		String[][] c = new String[q][q];

		for (int i = 0; i < q; i++) {
			for (int j = 0; j < q; j++) {

				c[i][j] = b.get(k);
				k++;
			}
		}

		int m[] = getIndex(c, "[]");

		int row = m[0];
		int column = m[1];

		int t[] = getIndex(c, "" + input);
		int t1 = t[0];
		int t2 = t[1];
		c[t1][t2] = "[]";
		c[row][column] = "" + input;
		for (int i = 0; i < q; i++) {
			for (int j = 0; j < q; j++) {
				a.add(c[i][j]);
			}

		}

		m = getIndex(c, "[]");

		row = m[0];
		column = m[1];

		int top = row - 1;
		int bottom = row + 1;
		int left = column - 1;
		int right = column + 1;

		if (top == -1 && left == -1) {
			adjacents.add(c[bottom][column]);
			adjacents.add(c[row][right]);
			
		} else if (top == -1 && right > q - 1) {
			adjacents.add(c[bottom][column]);
			adjacents.add(c[row][left]);
		

		} else if (bottom > q - 1 && right > q - 1) {
			adjacents.add(c[top][column]);
			adjacents.add(c[row][left]);
	

		}

		else if (left == -1 && bottom > q - 1) {
			adjacents.add(c[top][column]);
			adjacents.add(c[row][right]);
	

		}

		else if (top == -1) {
			adjacents.add(c[row][left]);
			adjacents.add(c[row][right]);
			adjacents.add(c[bottom][column]);
	
		} else if (bottom > q - 1) {
			adjacents.add((c[top][column]));
			adjacents.add(c[row][right]);
			adjacents.add(c[row][left]);

		}

		else if (right > q - 1) {
			adjacents.add(c[top][column]);
			adjacents.add(c[bottom][column]);
			adjacents.add(c[row][left]);


		}

		else if (left == -1) {
			adjacents.add(c[top][column]);
			adjacents.add(c[bottom][column]);
			adjacents.add(c[row][right]);
	

		}

		else {
			adjacents.add(c[top][column]);
			adjacents.add(c[bottom][column]);
			adjacents.add(c[row][right]);
			adjacents.add(c[row][left]);
	
		}
		for(int i=1; i<=q*q; i++) {
			if(i!=9) {
				x.add(i+"");
			}
			else {
				x.add("[]");
			}
		}
		if(a.equals(x)) {
			a.clear();
			a.add("over");
			return a;
		}

		a.addAll(adjacents);
		return a;
	}
	
	
	}


