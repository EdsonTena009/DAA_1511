package tarea2;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Tarea2 {
 
    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        int numMayor = 0;
           int matriz[][],pisos,puerta,sumaHabitantes;
           
           pisos = Integer.parseInt(JOptionPane.showInputDialog("Numeros de pisos"));
            puerta = Integer.parseInt(JOptionPane.showInputDialog("Numeros de puertas"));
            
            matriz = new int[pisos][puerta];
            
            for (int i = 0; i < pisos; i++) {
                for (int j = 0; j < puerta; j++) {
                    int[] is = matriz[j];
                    System.out.println("Matriz["+i+"]["+j+"]: ");
                    matriz [i][j] = entrada.nextInt();
                    
                    
                }
                
                    
                }
                for (int i = 0; i < puerta; i++) {
            sumaHabitantes=0;
                    for (int j = 0; j < pisos; j++) {
                        sumaHabitantes += matriz[i][j];
                        
                    }
                    System.out.println("La suma en ["+i+"] es: "+sumaHabitantes);
            
        }
                
            
     
            }
            
    }

     
 
