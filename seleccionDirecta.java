package unidadv;

public class seleccionDirecta {
    
    public static void sDirecta(Comparable [] a){
        Comparable menor=0,tmp=0;
        int k=0;
        for(int i=0; i<a.length-1; i++){
            menor=a[i];
            k=i;
            for(int j=i+1;j<a.length; j++){
                if(a[j].compareTo(menor)<0){
                    menor=a[j];
                    k=j;
                }
            }
            if(k!=i){
                tmp=a[i];
                a[i]=a[k];
                a[k]=tmp;
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
       Float [] a={3.5f,4.23f,7.25f,2.03f,8.17f,1.01f};
       String [] b={"Perla","Hanna","Maria","Leonardo","Zayra","Rocio","Anna"};
       System.out.println("Desordenado: ");
       imprime(a);
       sDirecta(a);
       System.out.println("Ordenado: ");
       imprime(a);
       System.out.println("Desordenado: ");
       imprime(b);
       sDirecta(b);
       System.out.println("Ordenado: ");
       imprime(b);
    }
}
