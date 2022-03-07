public class Ejercicio4 {
 
    public static void main(String[] args) {
                 
        int[] numeros=new int[100];
                 
        int suma=0;
        float media;
        
        for(int i=0;i<numeros.length;i++){
            numeros[i]=i+1;
            suma+=numeros[i];
        }
         
        System.out.println("Suma= "+suma);
         
        media=(float)suma/numeros.length;
         
        System.out.println("Media= "+media);
         
    }
     
}