/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasknapsakgreedy;

/**
 *
 * @author asus
 */
public class ExchangeSort {
    
    public static void ExchangeSortWeight(String data_No[], int data_Weight[], 
            int data_Profit[]){ 
        String temp1;
        int temp2; 
        int temp3;
        for(int i=0; i<data_Weight.length-1; i++){ 
            for(int j=0; j<data_Weight.length-1; j++){
                if(data_Weight[j]>data_Weight[j+1]){ 
                    temp1=data_No[j]; 
                    data_No[j]=data_No[j+1]; 
                    data_No[j+1]=temp1; 
                    temp2=data_Weight[j]; 
                    data_Weight[j]=data_Weight[j+1]; 
                    data_Weight[j+1]=temp2; 
                    temp3=data_Profit[j]; 
                    data_Profit[j]=data_Profit[j+1]; 
                    data_Profit[j+1]=temp3;
                }
            }
        }
    }
    
    public static void ExchangeSortProfit(String data_No[], int data_Weight[], 
            int data_Profit[]){ 
        String temp1;
        int temp2; 
        int temp3;
        for(int i=0; i<data_Profit.length-1; i++){ 
            for(int j=0; j<data_Profit.length-1; j++){
                if(data_Profit[j]<data_Profit[j+1]){ 
                    temp1=data_No[j]; 
                    data_No[j]=data_No[j+1]; 
                    data_No[j+1]=temp1; 
                    temp2=data_Weight[j]; 
                    data_Weight[j]=data_Weight[j+1]; 
                    data_Weight[j+1]=temp2; 
                    temp3=data_Profit[j]; 
                    data_Profit[j]=data_Profit[j+1]; 
                    data_Profit[j+1]=temp3;
                }
            }
        }
    }
    public static void ExchangeSortDensity(String data_No[], int data_Weight[], 
            int data_Profit[], double data_Density[]){
        String temp1; 
        int temp2; 
        int temp3;
        double temp4;
        for(int i=0; i<data_Weight.length-1; i++){ 
            for(int j=0; j<data_Weight.length-1; j++){
                if(data_Density[j]<data_Density[j+1]){ 
                    temp1=data_No[j]; 
                    data_No[j]=data_No[j+1]; 
                    data_No[j+1]=temp1; 
                    temp2=data_Weight[j]; 
                    data_Weight[j]=data_Weight[j+1]; 
                    data_Weight[j+1]=temp2; 
                    temp3=data_Profit[j]; 
                    data_Profit[j]=data_Profit[j+1]; 
                    data_Profit[j+1]=temp3;
                    temp4 = data_Density[j]; 
                    data_Density[j] = data_Density[j+1]; 
                    data_Density[j+1] = temp4;
                }
            }
        }
    }
}


    
