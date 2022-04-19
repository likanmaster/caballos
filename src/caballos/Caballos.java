package caballos;
/**
 *
 * @author likanmaster
 */
public class Caballos {
     
    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
       //recibe las entradas como string
       
      String caba =args[0];           
      String hipo   =args[1];
       //cambiar de string a enteros y decimales
      int ic = Integer.parseInt(caba);
      int im = Integer.parseInt(hipo);

      int c=ic; //cantidad de caballos
      int m=im; //largo del hipodromo
/*
   int c=4;
   int m=40;
  */
        int hipodromo[][] = new int[c][m];
        int posicion[]=new int[c];//para ir guardando las posiciones de los caballos
        boolean flag=false;//para saber si un caballo pasó o llego a la meta
       
        int  meta=fun.crearmeta(m); //creamos la meta
        System.out.println("meta "+meta);//mostramos donde estará la meta
        //iniciar la posicion caballos en posicion 0
        for (int i = 0; i < posicion.length; i++) {
            posicion[i]=0;
        }
        //mostrar matriz y caballos
        System.out.println("☻=Caballo  0=pocicion vacia  1=Meta ");
       //inicia partida   carrera
        while(flag==false){//vamos comprobando si hay ganadores
            System.out.println("Corriendo... ");
            Thread.sleep(1000);
            fun.dibujarmatriz(posicion,hipodromo,meta);
            for (int i = 0; i < c; i++) {
                if (flag==false) {
                    if (posicion[i]>meta) {
                      System.out.println(" primer caballo en llegar a la meta "+(i+1));
                      flag=true;
                    }else  posicion=fun.modpos(posicion, meta);
                }//fin if de flag
            }//fin if de turnos      
        }//fin while
        //dibujamos matriz final
        System.out.println("resultado final  ");
        fun.dibujarmatriz(posicion,hipodromo,meta);
    }
}