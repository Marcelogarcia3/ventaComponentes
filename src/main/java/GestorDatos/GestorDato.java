package GestorDatos;

import java.util.HashMap;
import java.util.Map;

public class GestorDato {
	private Map<String, String> datos;

	public GestorDato() {
		datos = new HashMap<>();
	}

	public void agregarDato(String clave, String valor) {
		datos.put(clave, valor);
		System.out.println("Dato agregado exitosamente.");
	}

	public String obtenerDato(String clave) {
		return datos.get(clave);
	}

	public void eliminarDato(String clave) {
		if (datos.containsKey(clave)) {
			datos.remove(clave);
			System.out.println("Dato eliminado exitosamente.");
		} else {
			System.out.println("La clave especificada no existe.");
		}
	}
}