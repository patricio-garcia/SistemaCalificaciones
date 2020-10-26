package utilidades;

public class Utilidad {

	public static void showMessage(String message) {
		System.out.println(message);
	}

	public static void cleanScreen() {
		for (int i = 0; i < 10; i++) {
			Utilidad.showMessage("");
		}
		System.out.flush();
	}

}
