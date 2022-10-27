

package Clases;

public class Grafo {
   private int mCoeficiente[][] = new int [51][51];
   private int mAdyacencia [][] = new int [51][51];
   private int cordeX [] = new int [51];
   private int cordeY [] = new int [51];
   private int nombre [] = new int [51];
   private String nombre2[] = new String[51];
   private int[] grafo;
   
   
   
   public Grafo(){
        
    }

    public String getNombre2(int i) {
        return nombre2[i];
    }

    public void setNombre2(int i, String nombre2) {
        this.nombre2[i] = nombre2;
    }

    public int getmCoeficiente(int i, int j ) {
        return mCoeficiente[i][j];
    }

    public int getmAdyacencia(int i,int j) {
        return mAdyacencia[i][j];
    }

    public int getCordeX(int i) {
        return cordeX[i];
    }

    public int getCordeY(int i) {
        return cordeY[i];
    }

    public int getNombre(int i) {
        return nombre[i];
    }

    public int getGrafo(int i) {
        return grafo[i];
    }

    public void setmCoeficiente(int i,int j ,int mCoeficiente) {
        this.mCoeficiente[i][j] = mCoeficiente;
    }

    public void setmAdyacencia(int i,int j ,int mAdyacencia) {
        this.mAdyacencia[i][j] = mAdyacencia;
    }

    public void setCordeX(int i,int cordeX) {
        this.cordeX[i] = cordeX;
    }

    public void setCordeY(int i, int cordeY) {
        this.cordeY[i] = cordeY;
    }

    public void setNombre(int i,int nombre) {
        this.nombre[i] = nombre;
    }

    public void setGrafo(int i,int enArbol) {
        this.grafo[i] = enArbol;
    }
    public void crearGrafo(int i){
       grafo = new int [i]; 
    }  
    
}
