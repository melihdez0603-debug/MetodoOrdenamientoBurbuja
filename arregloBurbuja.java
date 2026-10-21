/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.uthh.edd.unidad1.arreglos;
import java.util.Arrays;

/**
 *
 * @author melih
 */
public class arregloBurbuja {
    
    public static void ordenamientoBurbuja(int[]arreglo){
        int n=arreglo.length;
        for(int i=0;i<arreglo.length-1;i++){
            for(int j=0;j<arreglo.length-1-i;j++){
                if(arreglo[j]>arreglo[j+1]){
                    int temp=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=temp;
                }
            }
        }
    }
    
    public static void ordenamientoBurbujaMejorado(int[]arreglo){
        int n=arreglo.length;
        for(int i=0;i<arreglo.length-1;i++){
            boolean intercambio=false;
            for(int j=0;j<arreglo.length-1-i;j++){
                if(arreglo[j]>arreglo[j+1]){
                    int temp=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=temp;
                    
                    intercambio=true;
                }
            }
            if(intercambio==false){
                break;
            }
        }
    }
    public static void main(String[] arg){
        
        int[] datosOriginales={5,3,8,2};
        int[] arregloNormal=datosOriginales.clone();
        int[] arregloMejorado=datosOriginales.clone();
        
        
        long inicioNormal=System.nanoTime();
        ordenamientoBurbuja(arregloNormal);
        long finNormal=System.nanoTime();
        long tiempoNormal=finNormal-inicioNormal;
        
        long inicioMejorado=System.nanoTime();
        ordenamientoBurbujaMejorado(arregloMejorado);
        long finMejorado=System.nanoTime();
        long tiempoMejorado=finMejorado-inicioMejorado;
        
        System.out.println("Burbuja Normal");
        System.out.println("Arreglo Ordenado:" + Arrays.toString(arregloNormal));
        System.out.println("Tiempo de Ejecucion:"+tiempoNormal+"ns");
        
        System.out.println("Burbuja Mejorado");
        System.out.println("Arreglo Ordenado:" + Arrays.toString(arregloMejorado));
        System.out.println("Tiempo de Ejecucion:"+tiempoMejorado+"ns");
        
    }
    
}
