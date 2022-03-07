public class Ejercicio2 {
 
    public static void main(String[] args) {
        
        String texto="Introduce un tamaño";
        int num[]=new int[Integer.parseInt(texto)];
 

        rellenarArray(num, 0, 9);
 
        mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[], int a, int b){
        for(int i=0;i<lista.length;i++){
            
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("El valor designado al índice "+i+" es "+lista[i]);
        }
    }
}