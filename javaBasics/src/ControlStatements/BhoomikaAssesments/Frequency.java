package ControlStatements.BhoomikaAssesments;

public class Frequency {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[] { 1, 2, 3, 4, 5, 5, 2, 1, 4, 8 };
		int countArr[] = new int[a.length];
		int visit = -1;
		for (int i = 0; i < a.length; i++) {
			int count = 1;
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
					countArr[j] = visit;
				}
			}
			if (countArr[i] != visit) {
				countArr[i] = count;
			}
		}

		for (int i = 0; i < countArr.length; i++) {
			if (countArr[i] != visit) {
				System.out.println("Frequency of " + a[i] + ":" + countArr[i]);
			}
		}
	}
}
