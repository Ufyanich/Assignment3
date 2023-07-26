import java.util.*;

public class BST<Vertex> {       //BinarySearchTree
    private Map <Vertex, List <Vertex> > map;
    private Node root;

    public BST(){
        map = new HashMap<Vertex, List <Vertex> >()
    }
    private class Node{

        private Vertex key;
        private List <Vertex> val;
        private Node left, right;

        public Node(Vertex key, List <Vertex> val){
            this.key = key;
            this.val = val;
        }
    }

    public void put(Vertex key, Vertex val, Vertex vertex) {
        map.put(vertex, new LinkedList<Vertex>());

        map.get(key).add(val);
        map.get(val).add(key);
    } ;
    public <Vertex> get(Vertex key){};
    public void delete(Vertex key){};
    public Iterable<Vertex> iterator(){}

}
