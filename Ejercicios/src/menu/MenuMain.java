package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuMain {
	public static void main(String[] args) {
		boolean correcto = false;
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		
		do{//mediante un do while podemos repetir N veces un bloque de codigo
			//en este caso para mejorar el control de las excepciones
			//vamos a repetir este bloque mientras no me introduzca un valor 
			//numerico
			System.out.println("1- Sumar");
			System.out.println("2- Restar");
			System.out.println("3- Multiplicar");
			System.out.println("4- Dividir");
			System.out.println("Seleccione una opcion:");
					
			try{
				opcion = sc.nextInt();
				if(opcion >= 1 && opcion <= 4){
					correcto = true;
				}else{
					System.out.println("El valor debe de estar comprendido entre 1 y 4");
				}
			}catch(InputMismatchException ime){
				System.out.println("El valor tiene que ser numerico");
				sc.nextLine();//Si ocurre una expceion al poner por ejemplo "pepe"
				//lamentablemente java va tener en el buffer de entrada de datos
				//siempre pepe, por lo que entrariamos en un bucle infinito
				//para evitar esta problematica, con nextLine podemos volver a leer el dato
				//y limpiar el buffer
			}
		}while(!correcto);
		
		correcto = false;
		do {
			try {
				System.out.println("Ponga el numero1 y el numero2: ");
				int numero1 = sc.nextInt();
				int numero2 = sc.nextInt();

				if (opcion == 1) {
					int resultado = numero1 + numero2;
					System.out.println("El resultado de la suma es: " + resultado);
				} else if (opcion == 2) {
					int resultado = numero1 - numero2;
					System.out.println("El resultado de la resta es: " + resultado);
				} else if (opcion == 3) {
					int resultado = numero1 * numero2;
					System.out.println("El resultado de la multiplicacion es: " + resultado);
				} else if (opcion == 4) {
					int resultado = numero1 / numero2;
					System.out.println("El resultado de la division es: " + resultado);
				}
				correcto = true;
			//podemos hacer tantos bloques catch como queramos, para as� hacer
			//una mejor distinci�n de los errores. En este caso tenemos
			//un bloque catch para los errores de nextInt() y por otro lado
			//tenemos un bloque catch por si dividimos un valor por '0'
			} catch (InputMismatchException e) {
				System.out.println("El numero introducido debe de ser numerico");
				sc.nextLine();
			} catch (ArithmeticException ae) {
				System.out.println("El numero 2 no puede ser 0");
			} 
		} while (!correcto);
		System.out.println("Fin del programa");
	}
}
