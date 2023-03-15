import java.util.Arrays;
public class App {
    /**
     * @param args
     */
    public static void main(String[] args){

        EjerUnoA cantidadLetras = new EjerUnoA();

        System.out.println(cantidadLetras.contarLetra("Estoy en casoooooaaaa",'o'));

        EjerUnoB ordenarlos =   new EjerUnoB();

        System.out.println(Arrays.toString(ordenarlos.ordenar(5,7,2, true)));

        EjerUnoC suma = new EjerUnoC();

        System.out.println(suma.datos(5, 6, 7, 6)); 

        EjerDos codific = new EjerDos();

        System.out.println(codific.codificacion("hola mundo", 2));
    }
}
