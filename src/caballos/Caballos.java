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
     
     //int c=4;
     //int m=40;
      
      int c=ic;
      int m=im;
        int hipodromo[][] = new int[c][m];
        int posicion[]=new int[c];
        boolean flag=false;//para saber si un caballo pasó o llego a la meta
       
        int  meta=crearmeta(m); //creamos la meta
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
        dibujarmatriz(posicion,hipodromo,meta);
        for (int i = 0; i < c; i++) {
            if (posicion[i]>meta) {
                 System.out.println(" primer caballo en llegar a la meta "+(i+1));
                 flag=true;
            }
            else  posicion=modpos(posicion, meta);
        }
    
        
    }
     
    //dibujamos matriz final
     System.out.println("resultado final  ");
     dibujarmatriz(posicion,hipodromo,meta);

}
//funciones

  private static int crearmeta(int m) {
    int meta=m-5;
    return meta;
    };

    private static int[] modpos(int[] posicion, int meta) {
     for (int i = 0; i < posicion.length; i++) {
            double aleatorio = Math.random()*3+1;
            int r=(int) aleatorio;
                if (posicion[i]+r<meta) {
                    int pos=posicion[i]+r;
                    posicion[i]=pos;
                }else posicion[i]=meta+1;
            
     }
    return posicion;
    
    }

    private static void dibujarmatriz(int[] posicion, int[][] hipodromo,int meta) {
       
        for (int i = 0; i < posicion.length; i++) {
           
            for (int j = 0; j < hipodromo[0].length; j++) {
                hipodromo[i][0]=0;//con esto limpiamos la matriz original
                
               if (meta==j) {
                   hipodromo[i][j]=1;
                }
                if (posicion[i]==j) {
                     System.out.print("☻ ");
                } else  System.out.print(hipodromo[i][j]+" ");
                 
                
            }
             System.out.println(" ");
        }       
    }   

}