public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("TV ligada? " + smartTv.ligada);
        System.out.println("Canal Atual " + smartTv.canal);  
        System.out.println("Volume Atual " + smartTv.volume); 


        smartTv.ligar();
        System.out.println("Novo Status -> Tv ligada ?  " + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo Status -> Tv ligada ?  " + smartTv.ligada);      
        
        smartTv.diminuirVolume();
        System.out.println("Diminuindo o volume " + smartTv.volume); 
        smartTv.diminuirVolume();
        System.out.println("Diminuindo o volume " + smartTv.volume); 
        smartTv.diminuirVolume();
        System.out.println("Diminuindo o volume " + smartTv.volume);
        smartTv.aumnetarVolume();
        System.out.println("Aumentando o volume " + smartTv.volume);
        System.out.println("Volume Atual " + smartTv.volume); 

        smartTv.mudarCanal(13);
        System.out.println("Canal Atual " + smartTv.canal);  
     }

     
}
