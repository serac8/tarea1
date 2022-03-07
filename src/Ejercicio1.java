public class Ejercicio1 {
 
    public static void main(String[] args) {
 
        int num[]=new int[10];
        rellenarArray(num);
        mostrarArray(num);
    }
 
    public static void rellenarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            String texto="Introduce un número";
            lista[i]=Integer.parseInt(texto);
        }
    }
 
    public static void mostrarArray(int lista[]){
        for(int i=0;i<lista.length;i++){
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }
}

