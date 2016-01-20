package clase1;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Persona1 {

	String nombres;
	String apePaterno;
	String apeMaterno;
	Double altura;
	String dni;
	String celular;
	Date fechaNacimiento;
	String email;
	String tipoSangre;
	String direccion;
	String religion;
	String sexo;
	String estadoCivil;
	Boolean vive;

	public int getEdad() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		Date now = new Date();
		int anioActual = Integer.parseInt(sdf.format(now));
		int anioNacimiento = Integer.parseInt(sdf.format(fechaNacimiento));

		return anioActual - anioNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [nombres=" + nombres + ", apePaterno=" + apePaterno + ", apeMaterno=" + apeMaterno + ", altura="
				+ altura + ", dni=" + dni + ", celular=" + celular + ", fechaNacimiento=" + fechaNacimiento + ", email="
				+ email + ", tipoSangre=" + tipoSangre + ", direccion=" + direccion + ", religion=" + religion
				+ ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", vive=" + vive + "]";
	}

}