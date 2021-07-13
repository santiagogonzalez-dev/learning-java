package santiagogonzalez.javaintro;
public class E18_cantador_3_E {
	public static void main(String[] args) {
		for (int i = 0; i <= 9; i++) {
			for (int k = 0; k <= 9; k++) {
				for (int m = 0; m <= 9; m++) {
					System.out.print(i != 3 ? i : "E");
					System.out.print(k != 3 ? k : "E");
					System.out.println(m != 3 ? m : "E");
				}
			}
		}
	}
}