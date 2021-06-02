/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jobsheet13;

/**
 *
 * @author Iftitah Hidayati
 */
public class BinaryTree {

    Node root, leaf;
    Node head = null, tail = null;
    int min, max, size=0;

    public BinaryTree() {
        root = null;
    }

    boolean isEmpty() {
        return root == null;
    }

    void add(int data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            Node current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left != null) {
                        current = current.left;
//                        break;
                    } else {
                        current.left = new Node(data);
                        break;
                    }
                } else if (data > current.data) {
                    if (current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }

    boolean find(int data) {
        boolean hasil = false;
        Node current = root;
        while (current != null) {
            if (current.data == data) {
                hasil = true;
                break;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return hasil;
    }

    void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    Node getSuccessor(Node del) {
        Node successor = del.right;
        Node successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty!");
            return;
        }
        //find node (current) that will be deleted
        Node parent = root;
        Node current = root;
        boolean isLeftChiled = false;
        while (current != null) {
            if (current.data == data) {
                break;
            } else if (data < current.data) {
                parent = current;
                current = current.left;
                isLeftChiled = true;
            } else if (data > current.data) {
                parent = current;
                current = current.right;
                isLeftChiled = false;
            }
        }
        //deletion
        if (current == null) {
            System.out.println("Couldn't find data!");
            return;
        } else //if there is no child, simply delete it
         if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else if (isLeftChiled) {
                    parent.left = null;
                } else {
                    parent.right = null;
                }
            } else if (current.left == null) {//if there is 1 child (right)
                if (current == root) {
                    root = current.right;
                } else if (isLeftChiled) {
                    parent.left = current.right;
                } else {
                    parent.right = current.left;
                }
            } else if (current.right == null) {//if there is 1 child (left)
                if (current == root) {
                    root = current.left;
                } else if (isLeftChiled) {
                    parent.left = current.left;
                } else {
                    parent.right = current.left;
                }
            } else {//if there is 2 childs
                Node successor = getSuccessor(current);
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChiled) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                    successor.left = current.left;
                }
            }
    }

    void insert(int data) {
        root = addRecursive(root, data);
    }

    Node addRecursive(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data) {
            root.left = addRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = addRecursive(root.right, data);
        }
        return root;
    }

    void minMax() {
        Node current = root;
        Node current2 = root;
        min = max = current.data;
        while (current.left != null) {
            current = current.left;
            min = current.data;
        }
        while (current2.right != null) {
            current2 = current2.right;
            max = current2.data;
        }
        System.out.println("Nilai paling kecil adalah " + min);
        System.out.println("Nilai paling besar adalah " + max);
    }

    int getLeafCount() {
        return leafCount(root);
    }

    int leafCount(Node node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            System.out.println(node.data + " ");
            return 1;
        } else {
            return leafCount(node.left) + leafCount(node.right);
        }
    }
}
