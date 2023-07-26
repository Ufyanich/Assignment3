import java.util.*;

public class BST<Vertex> {       //BinarySearchTree
    private Map <Vertex, List <Vertex> > map;
    private Node root;

    public BST(){
        map = new HashMap<Vertex, List <Vertex> >();
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

    public boolean hasEdge(Vertex key, Vertex val){
        List<Vertex> neighbors = map.get(key);
        return neighbors != null && neighbors.contains(val);
    }

    public void put(Vertex key, Vertex val, Vertex vertex) {
        map.put(vertex, new LinkedList<Vertex>());

        //Addition of Edges
        map.get(key).add(val);
        map.get(val).add(key);
    } ;
    public List <Vertex> getNeighbor(Vertex vertex, List <Vertex> val){
        return map.getOrDefault(vertex, val);
    };
    public void delete(Vertex key, Vertex val){
        if(!hasEdge(key, val)) {
            System.out.println("These two vertices do not have an edge");
            return;
        }
    };
    public Iterable<Vertex> iterator(){}

}
