/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intento_1_grafo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Rubens1414
 */
public class Grafo {

    LinkedList<Nodo> nodos;

    public Grafo() {
        nodos = new LinkedList();
    }

    public void addArista(int a, int b) {
        nodos.get(a).addVecino(nodos.get(b));
        nodos.get(b).addVecino(nodos.get(a));
    }

    public Nodo getNodo(int i) {
        return nodos.get(i);
    }

    public void addNodo(Nodo n) {
        nodos.add(n);
    }

    public void DFS(Nodo n) {
        Stack<Integer> stack = new Stack<>();
        boolean[] visited = new boolean[nodos.size()];
        int a;
        stack.push(n.valor);
        Nodo q;
        System.out.println("DFS: ");
        while (!stack.empty()) {
            a = stack.peek();//obtener el ultimo valor
            q = nodos.get(a);
            stack.pop();// sacar el valor de la pila
            if (visited[a] == false) {
                
                System.out.println((a +1) + " ");
                visited[a] = true;
            }
               LinkedList<Nodo> test = q.vecinos;
               //Collections.sort(test);
            for (Nodo vecino : q.vecinos) {
               if (!visited[vecino.valor]) {
                    stack.push(vecino.valor);
               }
            }
        }
    }
}
