package my_packge;

public class SplitArrrays {

	public static void main(String[] args) {
		int[] b = { 1, 3, 10, 20 }, a = { 2, 6, 7, 8, 45 }, c = new int[a.length + b.length];
		int m = 0, n = 0;
		for (int i = 0; i < a.length + b.length; i++) {
			if (m < a.length) {
				if (n < b.length) {
					if (a[m] < b[n]) {
						System.out.print(a[m++] + " ");
					} else {
						System.out.print(b[n++] + " ");
					}
				} else {
					System.out.print(a[m++] + " ");
				}
			} else {
				System.out.print(b[n++] + " ");
			}

		}
	}
}
