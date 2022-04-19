/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caballos;

/**
 *
 * @author jr
 */
public class fun {//metodo que devuelve un entero el cual es la posicion de la meta
    static int crearmeta(int m) {
      int meta=m-5;
      return meta;
    };

    static int[] modpos(int[] posicion, int meta) {//metodo que hace que un caballo se mueva r posiciones adelante
     for (int i = 0; i < posicion.length; i++) {
            double aleatorio = Math.random()*3+1;
            int r=(int) aleatorio;
                if (posicion[i]+r<meta) {
                    int pos=posicion[i]+r;
                    posicion[i]=pos;
                }else posicion[i]=meta+1;
            
     }//fin for
    return posicion;
  }//fin modpos
    
    static void dibujarmatriz(int[] posicion, int[][] hipodromo,int meta) {
        for (int i = 0; i < posicion.length; i++) {
            for (int j = 0; j < hipodromo[0].length; j++) {
                hipodromo[i][0]=0;//con esto limpiamos la matriz original
               if (meta==j) {
                   hipodromo[i][j]=1;//agregamos la meta
                }
                if (posicion[i]==j) {
                     System.out.print("☻ ");//situamos el caballo
                } else  System.out.print(hipodromo[i][j]+" ");//mostramos lo que hay en la posicion     
            }
             System.out.println(" ");
        }       
    }   
}
