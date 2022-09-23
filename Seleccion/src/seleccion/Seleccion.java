package seleccion;

public class Seleccion {

     public static void main (String args[]) {
        int [] arr={13,12,8,7,1,4,3,2,11};
        int pivote = 0;
        int temp = 0;
        int aux = 0;
        int min = 0;
        
        for (pivote = 0;  pivote< arr.length; pivote++) {
            min = pivote;
            for (aux=pivote+1; aux < arr.length; aux++) {
                if (arr[aux]<arr[min]){
                    min=aux;
                }
                
            }
        temp=arr[pivote];
        arr[pivote]=arr[min];
        arr[min]=temp;
        
            System.out.println(arr[pivote]);
        }
                
    }
    
}
