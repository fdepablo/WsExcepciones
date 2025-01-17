package objetos;

public class MainPersona {

	public static void main(String[] args) {
		Persona p1 = new Persona();
		p1.nombre = "Bud Spencer";
		p1.edad = 89;
		p1.peso = 130;
		
		Persona p2 = p1;
		
		Persona p3 = new Persona();
		p3.nombre = "Terence hill";
		p3.edad = 75;
		p3.peso = 70;
		
		Persona p4 = p3;
		p4.edad = 55;
		System.out.println(p3.edad);
		
		p3.presentarse();
		p4.presentarse();
		p4 = p1;
		p4.presentarse();
		p3 = p4;
		p3.correr();
		p3.cumplirAños();
		p3.presentarse();
		
		Policia poli1 = new Policia();
		poli1.nombre = "Harry Calahan (El sucio)";
		poli1.edad = 45;
		poli1.peso = 71;
		poli1.numeroPlaca = 123456;
		
		//podemos utilizar los metodos del padre (Persona)
		poli1.presentarse();
		poli1.cumplirAños();
		poli1.presentarse();
		//tambien podemos utilizar los metodos concretos
		poli1.multar(p1, 200);
		
		Policia[] arrayPolicias = new Policia[5];
		arrayPolicias[0] = poli1;
		//arrayPolicias[1] = p1;//esto no puedo
		
		Persona[] arrayPersonas = new Persona[2];
		arrayPersonas[0] = p1;
		arrayPersonas[1] = poli1;
		
		System.out.println("--------------------");
		for(Persona p : arrayPersonas){
			//aqui estamos haciendo uso del polimorfismo
			//es decir, mandar un mensaje igual y dependiendo del
			//objeto al que estemos apuntando, se ejecutará
			//el mensaje de dicho objeto
			p.presentarse();
		}
	}

}
