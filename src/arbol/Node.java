
package arbol;

import java.util.ArrayList;

public class Node {
    Object info[];    
    Node left;
    Node right;
    static ArrayList<Object[]> datos = new ArrayList<>();
    static int max;
    
    public Node(Object[] info, Node left, Node right) {
        this.info = info;
        this.left = left;
        this.right = right;     
    }

    public  int getMax() {
        return max;
    }

    public  void setMax(int max) {
        Node.max = max;
    }

    public Object[] getInfo() {
        return info;
    }

    public void setInfo(Object[] info) {
        this.info = info;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public ArrayList<Object[]> getDatos() {
        return datos;
    }

    public void setDatos(ArrayList<Object[]> datos) {
        this.datos = datos;
    }

    
    
  
}
