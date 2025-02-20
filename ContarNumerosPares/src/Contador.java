public class Contador {
    public static void main(String[] args) throws Exception {
        for (int numero = 0; numero <=200; numero ++){
            if(numero %2 == 0 )
            continue;

            System.out.println(numero);
        }

   }     
}
