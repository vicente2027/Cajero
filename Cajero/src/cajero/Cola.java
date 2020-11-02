/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero;

/**
 *
 * @author ADarqs-012
 */
public class Cola {
    class Nodo{
    int num;
    Nodo sig;
    }
    Nodo colita;
    Nodo fondo;
   
    Cola(){
    colita=null;
    fondo=null;
    }
    boolean vacia(){
        if(colita==null){
        return true;
        }
        else{
        return false;
        }
    }
    void insertar(int num){
    Nodo nuevo;
    nuevo=new Nodo();
    nuevo.num = num;
    nuevo.sig = null;
    
    if(vacia()){
    colita=nuevo;
    fondo=nuevo;
    }else{
    fondo.sig=nuevo;
    fondo=nuevo;
    }
    }
    
    int extraer(){
    if(!vacia()){
        int informacion = colita.num;
        if(colita==fondo){
        colita=null;
        fondo=null;
        }else{
        colita=colita.sig;
        }
        return informacion;
     }else{
    return  Integer.MAX_VALUE;
    }
    }
    
     public void imprimir() {
        Nodo reco=colita;
        System.out.println("Elementos de la cola");
        while (reco!=null) {
            System.out.print(reco.num+"-");
            reco=reco.sig;
        }
        System.out.println();
    }
      public int cantidad() {
        int cant=0;
        Nodo reco=colita;
        while (reco!=null) {
            cant++;
            reco=reco.sig;
        }
        return cant;
    }   
}
