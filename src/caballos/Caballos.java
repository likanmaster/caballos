package caballos;

/**
 *
 * @author pc0116
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
     
      int c=ic;
      int m=im;
      
      //int c=4;
      //int m=50;
        int hipodromo[][] = new int[c][m];
        int posicion[]=new int[c];
        boolean flag=false;//para saber si un caballo pasó o llego a la meta
       
        int  meta=crearmeta(m); //creamos la meta
        System.out.println("meta "+meta);//mostramos donde estará la meta
        //iniciar la posicion caballos en posicion 0
        for (int i = 0; i < posicion.length; i++) {
            posicion[i]=0;
        }
     
       //asignamos la matriz y caballos y la posicion de la meta
        for (int i = 0; i < c; i++) {
             for (int j = 0; j < m; j++) {
                if (j!=meta) {//verificamos que no sea la posicion de meta
                    hipodromo[i][j]=0;    
                }else hipodromo[i][j]=1;//asignamos la meta como un 1
            }
            hipodromo[i][0]=1;//iniciMOs los caballos en la partida
        }
        //mostrar matriz y caballos
        //System.out.println("hipodromo con pocisiones iniciales");
        System.out.println("☻=Caballo  0=pocicion vacia  1=Meta ");
        mostrarmatriz(hipodromo);//mostramos el hipodromo inicial
       
       
       //inicia partida   carrera

    while(flag==false){//vamos comprobando si hay ganadores
        System.out.println("Corriendo... ");
        Thread.sleep(2000);
        dibujarmatriz(posicion,hipodromo);
        for (int i = 0; i < c; i++) {
            if (posicion[i]>meta) {
                 System.out.println(" primer caballo en llegar a la meta "+(i+1));
                 flag=true;
            }
            else  posicion=modpos(posicion, meta);
        }
    
        
    }
     
    
    
    //ver posicion
     //   for (int i = 0; i <posicion.length; i++) {
       //    System.out.println(" "+posicion[i]);
      //  }
    //dibujamos matriz final
     System.out.println("resultado final  ");
    dibujarmatriz(posicion,hipodromo);

       }
//funciones

    private static int crearmeta(int m) {
    int meta=m-5;
    return meta;
    };



    private static void mostrarmatriz(int[][] hipodromo) {
        for (int i = 0; i < hipodromo.length; i++) {
            for (int j = 0; j < hipodromo[0].length; j++) {
                 System.out.print(hipodromo[i][j]+" ");
            }
             System.out.println(" ");
        }


    }

    private static int[] modpos(int[] posicion, int meta) {
     for (int i = 0; i < posicion.length; i++) {
            double aleatorio = Math.random()*5+1;
            int r=(int) aleatorio;
                if (posicion[i]+r<meta) {
                    int pos=posicion[i]+r;
                    posicion[i]=pos;
                }else posicion[i]=meta+1;
            
        }
    return posicion;
    
    }

    private static void dibujarmatriz(int[] posicion, int[][] hipodromo) {
       
        for (int i = 0; i < posicion.length; i++) {
            for (int j = 0; j < hipodromo[0].length; j++) {
                hipodromo[i][0]=0;//con esto limpiamos la matriz original  
                if (posicion[i]==j) {
                     System.out.print("☻ ");
                }else  System.out.print(hipodromo[i][j]+" ");  
            }
             System.out.println(" ");
        }       
    }
    
}
