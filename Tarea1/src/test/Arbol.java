package test;
public class Arbol {  
    Nodo raiz;
    public Arbol(){
        raiz=null;
    }
    public void insertar(int i, Object perro){
        Nodo n=new Nodo(i);
        n.contenido=perro; 
        if (raiz==null){
            raiz=n;
        }else{
            Nodo aux=raiz;
            while(aux!=null){
                n.headCAB=aux;
                if(n.llave>=aux.llave){
                    aux=aux.derechaDER;
                }else{
                    aux=aux.izquierdaIQ;
                }
            }
            if(n.llave<n.headCAB.llave){
                n.headCAB.derechaDER=n;
            }else{
                n.headCAB.izquierdaIQ=n;
            }
        }
    }
    public void recorrer(Nodo n){
        if(n !=null){
            recorrer(n.izquierdaIQ);
            System.out.println("indice "+n.llave+" numero "+n.contenido);
            System.out.println("No se como hacerle para el 67");
            recorrer(n.derechaDER);
        }
    }
    public class Nodo{
        public Nodo headCAB;
        public Nodo derechaDER;
        public Nodo izquierdaIQ;
        public int llave;
        public Object contenido;
        public Nodo(int indice){
            llave=indice;
            derechaDER=null;
            izquierdaIQ=null;
            headCAB=null;
            contenido=null;
            
        }   
}
}