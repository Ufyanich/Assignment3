public class Main {
    public static void main(String[] args) {
        BST bst = new BST();

        bst.put(1);
        bst.put(2);

        if(bst.containVertex(4) == true){
            System.out.println("Yes");
        } else {System.out.println("No");};
    }
}
