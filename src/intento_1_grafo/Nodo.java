/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intento_1_grafo;

import java.util.LinkedList;

/**
 *
 * @author Rubens1414
 */
public class Nodo {
    int valor;
    LinkedList<Nodo> vecinos;
    public Nodo(int valor){
        this.valor=valor;
        this.vecinos=new LinkedList();
    }
    public Nodo getNodo(int i){
        return vecinos.get(i);
    }
    public void addVecino(Nodo n){
        vecinos.add(n);
    }
}
