
public class ForLoopGauntlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 101; i++) {
			System.out.println(i);
		}
		System.out.println("Next Program");
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		System.out.println("Next Program.");
		for (int i = 2; i < 101; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("Next Program.");
		for (int i = 1; i < 100; i = i + 2) {
			System.out.println(i);
		}
		System.out.println("Next Program.");
		for (int i = 0; i < 501; i++) {
			if (i % 2 == 0) {
				System.out.println(i + " is even.");
			} else {
				System.out.println(i + " is odd.");
			}
		}
		System.out.println("Next Program.");
		for (int i = 0; i < 778; i = i + 7) {
			System.out.println(i);
		}
		System.out.println("Next Program.");
		for (int i = 2006; i < 2019; i++) {
			System.out.println();
		}
		System.out.println("Next Program.");
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.println(i + " " + " " + j);
			}
		}
		System.out.println("Next Program.");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {

			}

		}

	}
}
