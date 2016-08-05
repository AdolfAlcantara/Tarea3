
public class Ejercicios
{
	//devuelve la suma de x y y
	static int sumar(int x, int y)
	{
		int sumar = x+y;
		return sumar;
	}
	
	//devuelve la resta de x y y
	static int restar(int x, int y)
	{
		int restar = x-y;
		return restar;
	}
	//devuelve la multiplicacion de x y y
	static int multiplicar(int x, int y)
	{
		int producto = x*y;
		return producto;
	}
	
	//devuelve el residuo de x y y
	static int residuo(int x, int y)
	{
		int residuo = x%y;
		return residuo;
	}
	
	//devuelve true si x es par, de lo cotrario devuelve false
	static boolean esPar(int x)
	{

		boolean esPar;
		if (x%2 == 0){
			esPar = true;
		}else{
		
			esPar = false;
		}
		return esPar;
	}
	
	//devuelve true si x es multiplo de 3, de lo cotrario devuelve false
	static boolean esMultiploDe3(int x)
	{
		boolean trio;
		if(x%3 == 0){
			trio = true;
		}else{
			trio = false;
		}
		return trio;
	}
	
	//devuelve el numero mayor (x o y)
	static int getMayor(int x,int y)
	{
		int mayor;
		if (x>y){
			mayor = x;
		}else{
			mayor = y;
		}
		return mayor;
	}
	
	//devuelve true si la edad es mayor o igual a 18
	static boolean esMayorDeEdad(int edad)
	{
		boolean mayorDeEdad;
		if (edad>=18){
			mayorDeEdad = true;
		}else{
			mayorDeEdad = false;
		}
		return mayorDeEdad;
	}
	
	//devuelve true si x, y y z son pares
	static boolean sonPares(int x, int y, int z)
	{
		boolean sonPares;
		if (x%2 == 0 && y%2 == 0 && z%2 == 0){
			sonPares = true;
		}else{
			sonPares = false;
		}
		return sonPares;
	}
	
	//devuelve el numero mayor entre x, y y z
	static int getMayorDe3(int x, int y, int z)
	{
		int mayor;
		if(x>y && x>z){
			mayor = x;
		}else if(y>z){
			mayor = y;
		}else{
			mayor = z;
		}
		return mayor;
	}
	
	public static void main(String[] args)
	{
		
	}

}
