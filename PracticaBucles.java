import java.util.Random;
/**
 *    ChrissthoperPinday Delgado
 */
public class PracticaBucles {
    private final char ESPACIO = ' ';
    private final char CARACTER = '\u0040';
    private Random generador;

    /**
     * Constructor  
     */
    public PracticaBucles()    {
        generador = new Random();
    }

    /**
     *  El método  genera  números aleatorios  entre -1000 y 5000 (inclusive)
     *  y calcula y escribe:
     *      - la media de todos los números
     *      - la suma de los impares
     *      - el máximo de los pares
     *        
     *  El proceso termina cuando sale un 0 o bien se han escrito n nºs
     *  
     *  Los números se escriben  en filas de 5 columnas 
     *  Cada nº aleatorio se muestra en un espacio de 12 posiciones en la pantalla  
     *  y al lado de cada nº se muestra otro nº con las mismas cifras y 
     *  en el mismo orden pero sin ceros (en 5 posiciones)
     *  
     *   Utiliza solo bucles while
     */
    public void generarNumeros(int n)   {
       int maxPar = Integer.MAX_VALUE;
        int sumaImp = 0;
        int sumaTotal = 0;
        int aleatorio = generador.nextInt(6001) - 1000;
        int i = 1; //contador
        System.out.println("Nº maximo de aleatorios a generar " + n);
        System.out.println("o hasta que salga el 0");
        while (i <= n && aleatorio != 0){
            sumaTotal += aleatorio;
            if(esImpar(aleatorio)){
                sumaImp += aleatorio;
            }
            else{ //par
                if (aleatorio > maxPar){
                    maxPar = aleatorio;
                }
            }
            /////////////////////////////////////////////////
            System.out.println(aleatorio + "  " +  obtenerNumeroSinCeros(aleatorio));           
            //////////////////////////////////////////////            
            aleatorio = generador.nextInt(6001) - 1000;
            i++;
            
        }
        double media = (double)sumaTotal / n;
        System.out.println("          " + "Media:  " + media);
        System.out.println("   " + "Suma impares:  " + sumaImp);
        System.out.println("   " + "Maximo pares:  " + maxPar);

    }

    /**
     *  Devuelve true si numero es impar, false en otro caso
     *  Hazlo sin utilizar if
     */
    public boolean esImpar(int numero)   {
        return (numero % 2 != 0);
    }

    /**
     *  Dado un nº genera y devuelve otro nuevo 
     *  con las mismas cifras y en el mismo orden pero sin 
     *  los 0
     *  Ej - si numero = 2040 devuelve  24, si numero = 1009 devuelve  19
     *  si numero = 3000 devuelve 3
     *   
     *   
     */
    public int obtenerNumeroSinCeros(int numero)   {
        //TODO
        
        
        return 0;
    }

    /**
     *  Borrar la pantalla
     *
     */
    public void borrarPantalla()    {
        System.out.println('\u000C');
    }

    /**
     *  
     *  Dibuja la letra N (ver figura en el enunciado)
     *  Con bucles for
     *  
     *  Hay que usar el método escribirCaracter()
     *  
     *  
     *   
     */
    public void escribirLetraN(int altura)    {
       //TODO

    }

    /**
     *  escribe n veces el caracter  indicado en la misma línea
     *  con bucles for
     */
    private void escribirCaracter(char caracter, int n)    {
       //TODO
       
       
       
       
    }

}
