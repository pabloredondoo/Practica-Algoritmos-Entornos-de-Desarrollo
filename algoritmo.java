public abstract class algoritmos {

	// Método Fibonacci
	public static int fibonacci(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El número debe ser mayor o igual que 0");
        }
        if (numero == 0) return 0;
        if (numero == 1) return 1;


        int anterior = 0;
        int actual = 1;
        int siguiente = 1;


        for (int i = 2; i <= numero; i++) {
            siguiente = anterior + actual;
            anterior = actual;
            actual = siguiente;
        }


       
        return siguiente;
      //Método Factorial
        public static long factorial(int numero) {
            if (numero < 0) {
                throw new IllegalArgumentException("El número debe ser mayor o igual que 0");
            }


            long resultado = 1;


            for (int i = 2; i <= numero; i++) {
                resultado *= i;
            }


            return resultado;
        }



    }

}
