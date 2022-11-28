package unidadv;

public class shell {
    
    public static void shellSort(Comparable [] a){
        int salto;
        Comparable aux;
        boolean cambios;
        for(salto=a.length/2; salto!=0; salto/=2){
            cambios=true;
            while(cambios){
                cambios=false;
                for(int i=salto; i<a.length; i++){
                    if(a[i-salto].compareTo(a[i])>0){
                        aux=a[i];
                        a[i]=a[i-salto];
                        a[i-salto]=aux;
                        cambios=true;
                    }
                }
            }
        }
    }
    
    static void imprime(Object x[]){
        for(int i=0; i<x.length; i++)
            System.out.print(x[i]+",");
        System.out.println("");
        }
    
    public static void main(String []args){
        //Ejemplo
       Boolean [] a={true,true,false,true,false,false,false,true};
       Long [] b={123456L,789456L,456123L,321654L,987321L};
       System.out.println("Desordenado: ");
       imprime(a);
       shellSort(a);
       System.out.println("Ordenado: ");
       imprime(a);
       System.out.println("Desordenado: ");
       imprime(b);
       shellSort(b);
       System.out.println("Ordenado: ");
       imprime(b);
    }
    
}
