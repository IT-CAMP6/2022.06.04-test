package pl.camp.it.test;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();

        tree.add(4);
        tree.add(8);
        tree.add(2);
        tree.add(6);
        tree.add(1);
        tree.add(2);

        System.out.println(tree.min());
        System.out.println(tree.max());
        System.out.println(tree.contains(1));
    }
}
