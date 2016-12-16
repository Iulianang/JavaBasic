



import java.util.Scanner;

public class NumerosPares2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int resto = 0;
		int num_veces_imprimo = 0;

		int num_veces = pedirCantidadPares();

		for (int i = 0; i <= 100; i++) {
			resto = i % 2;

			if ((resto == 0) && (num_veces_imprimo < num_veces)) {
				System.out.println("Numero par " + i);
				num_veces_imprimo = num_veces_imprimo + 1;
			}

		}

	}

	public static int pedirCantidadPares() {
		int num_veces = 0;
		Scanner scanner = null;

		scanner = new Scanner(System.in);
		System.out.println("¿Cuantos pares quieres?");
		num_veces = scanner.nextInt();

		return num_veces;

	}
}
