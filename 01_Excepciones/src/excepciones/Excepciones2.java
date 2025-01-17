package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Las excpeciones en java son errores que pueden
 * ocurrir en tiempo de ejecuci�n, es decir, 
 * mientras el programa se esta ejecutando puede ocurrir algun
 * procesamiento inespeado de datos que nos pare la ejecuci�n
 * del programa
 * 
 * Este tipo de errores es peligroso ya que debemos de controlarlo
 * como programadores y as� evitar que el programa se pare
 * 
 */
public class Excepciones2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero: ");
		//para evintar que el programa se pare debemos de capturar
		//aquellos metodos que arrojen excepciones, para ello podemos
		//utilizar bloques try-catch.
		//En el bloque try pondremos todo el codigo que queramos
		//intentar ejecutar, si no ocurre ninguna excepcion, se 
		//ejecutar� todo el bloque sin problema
		//Si ocurriera alguna expcepcion en el bloque try podriamos
		//entrar en el bloque catch, siempre y cuando capturaramos
		//dicha excepcion, y evitando as� que el programa se pare
		try{
			int numero = sc.nextInt();
			System.out.println("el numero introducido es: " + numero);
			int numero2 = sc.nextInt();
			int resultado = numero / numero2;//Este tipo de operacion
										//puede arrojar excepciones de tipo
										//AritmeticException, por lo que deberiamos
										//capturarlas
			System.out.println(resultado);
		}catch(InputMismatchException ime){
			//por aqui entraremos cuando ocurra una excepcion de tipo
			//InputMismatchException
			System.out.println("No es un numero o es un numero que se va de rango");
		}catch(ArithmeticException ae){
			//por aqui entraremos cuando ocurra una excepcion de tipo
			//AritmeticException
			System.out.println("No se admiten divisiones entre 0");
		}

		System.out.println("fin del programa");
	}

}
