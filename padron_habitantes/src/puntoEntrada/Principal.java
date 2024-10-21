package puntoEntrada;

import presentacion.*;

public class Principal{
	public static void main(String[] args){
// Si escribo `java -cp bin puntoEntrada.Principal añadir Juan García Martínez`
// entonces
// `args[0]` es `añadir`
// `args[1]` es `Juan`
// `args[2]` es `García`
// `args[3]` es `Martínez`
		InterfazUsuario.ejecutar(args);
	}
}
