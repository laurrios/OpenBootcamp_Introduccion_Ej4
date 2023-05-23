/*En este ejercicio se practican las estructuras de  control creando:

    · Usando un if, crear una condición que compare si la variable
    numeroIf es positivo, negativo o 0. (Pista: Los números inferiores
    a 0 son negativos y los superiores positivos).*/

public class Main {

	public static void main(String[] args){
		String numeroIf = 5;
		
		if (numeroIf < 0){
			System.out.println("El número es negativo");
		} else if (numeroIf == 0) {
			System.out.println("El número es neutro, o 0");
		}else {
			System.out.println("El número es positivo");
		}
	}
}   
/*   · Crea un bucle While, este bucle tendrá que tener como condición que la 
    variable numeroWhile sea inferior a 3, el bloque de código que tendrá
    el bucle deberá:
        - Incrementar el valor de la variable en uno cada vez que se ejecute.
        - Mostrarlo por pantalla cada vez que se ejecute.*/
public class Main {

    public static void main(String[] args){
        int numeroWhile = 0;
        
        while (numeroWhile < 3){
            System.out.println("Contador vale: "+ numeroWhile);
            numeroWhile++ ;
            //ó numeroWhile = numeroWhile + 1
        }
    }
}

    
/*   · Para el bucle Do While, deberás crear la misma estructura que en el While, 
    pero solo se debe ejecutar una vez.*/

public class Main {

    public static void main(String[] args){
        int numeroWhile = 3;
            
        do{
           System.out.println("El contadro vale: " + numeroWhile);
           numeroWhile = numeroWhile - 1; //(o numeroWhile--)
        } while (numeroWhile = 3);
    }
}

/*  · Para el bucle For, crea una variable numeroFor, esta variable tendrá como 
    valor 0 y su condicion será que la variable sea igual o menor que 3, se irá
    incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por 
    pantalla.*/

public class Main {

    public static void main(String[] args){
        int numeroFor = 0;

		for(int numeroFor=0; numeroFor <= 3; numeroFor = numeroFor + 1 /*o numeroFor++*/){
		   System.out.println(numeroFor);
		}
	}
}

/*   · Por último para el Switch, deberás crear la varable estación, y distintos 
    case para las cuatro esaciones del año. Dependiendo del valor de la varable 
    estación, se deberá mandar un mensaje por consola informando de la estación 
    en la que está. También habrá que poner un default para cuando el valor de
    la variable no sea una estación.
 */
public class Main {

	public static void main(String[] args){
		var estacion = "VERANO"

		switch (estacion) {
		   case "VERANO":
			System.out.println("Es verano");
			break;
		   case "INVIERNO":
			System.out.println("Es invierno");
			break;
           case "PRIMAVERA":
			System.out.println("Es primavera");
			break;
           case "OTOÑO":
			System.out.println("Es otoño");
			break;
		   default:
			System.out.println("La estación indicada no existe")
		}
	}
}