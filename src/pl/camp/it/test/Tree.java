package pl.camp.it.test;

public class Tree {

    private Node root = null;

    public void add(int value) {
        if(this.root == null) {
            this.root = new Node();
            this.root.setValue(value);
        } else {
            addRecursive(value, this.root);
        }
    }

    public boolean contains(int value) {
        return containsRecursive(value, this.root);
    }

    public int max() {
        return maxRecursive(this.root);
    }

    public int min() {
        return minRecursive(this.root);
    }

    private void addRecursive(int value, Node node) {
        if(node.getValue() == value) {
            return;
        }
        if(node.getValue() < value) {
            if(node.getRightNode() == null) {
                node.setRightNode(new Node());
                node.getRightNode().setValue(value);
            } else {
                addRecursive(value, node.getRightNode());
            }
        } else {
            if(node.getLeftNode() == null) {
                node.setLeftNode(new Node());
                node.getLeftNode().setValue(value);
            } else {
                addRecursive(value, node.getLeftNode());
            }
        }
    }

    private int minRecursive(Node node) {

        return node.getLeftNode() == null ? node.getValue() : minRecursive(node.getLeftNode());
        /*if(node.getLeftNode() == null) {
            return node.getValue();
        } else {
            return minRecursive(node.getLeftNode());
        }*/
    }

    private int maxRecursive(Node node) {
        return node.getRightNode() == null ? node.getValue() : maxRecursive(node.getRightNode());
    }

    private boolean containsRecursive(int value, Node node) {
        if(node == null) {
            return false;
        }
        if(value == node.getValue()) {
            return true;
        } else if(value > node.getValue()) {
            return containsRecursive(value, node.getRightNode());
        } else {
            return containsRecursive(value, node.getLeftNode());
        }
    }
}
