import java.util.ArrayList;
/**
 * Binary Search Tree
 *
 * functions:
 *  - getSize
 *  - clear
 *  - insert
 *  - remove
 *  - inOrder
 *  - find
 * */
public class BinarySearchTree<E extends Comparable> {
    private static final int ROOT = 0;
    private int size = 0;
    private ArrayList<E> elements;


    // Constructor
    BinarySearchTree() {
        elements = new ArrayList<>();
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return printTree(ROOT);
    }

    // Clear Tree
    public void clear() {
        elements.clear();
        size = 0;
    }

    // Insert element
    public boolean insert(E value) {
        if (size != 0) {
            int index = getIndex(value, ROOT);
            if (elements.get(index) == null) {
                elements.set(index, value);
                size++;
                return true;
            }
        } else {
            return root(value);
        }
        return false;
    }

    // Remove element
    public boolean remove(E value) {
        if (size != 0) {
            int index = getIndex(value, ROOT);
            if (elements.get(index) != null) {
                remove(index);
                size--;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


    // Search
    public int find(E value) {
        int index = getIndex(value, ROOT);
        if (elements.get(index) == null) {
            return -1;
        } else {
            return index;
        }
    }

    // Browsing Tree
    public ArrayList<E> inOrder(boolean reverse) {
        return inOrder(0, reverse);
    }

    // Browsing Tree
    public ArrayList<E> inOrder() {
        return inOrder(0, false);
    }



    /*
     * Method private
     * */

    // Increase Size
    private void insertNull(int number) {
        while (elements.size() - 1 < right(number)) {
            elements.add(null);
        }
    }

    // Creating root node
    private boolean root(E value) {
        if (elements.add(value)) {
            size = 1;
            return true;
        }
        return false;
    }
    //

    private void remove(int root) {
        int index = left(root);
        if (elements.get(index) != null) {
            elements.set(root, elements.get(index));
            remove(index);
        } else {
            index = right(root);
            if (elements.get(index) != null) {
                elements.set(root, elements.get(index));
                remove(index);
            } else {
                elements.set(root, null);
            }
        }
    }

    //
    private int getIndex(E value, int root) {
        insertNull(root);
        if (elements.get(root) == null) {
            return root;
        } else {
            if (value.compareTo(elements.get(root)) > 0) {
                return getIndex(value, right(root));
            } else if (value.compareTo(elements.get(root)) < 0) {
                return getIndex(value, left(root));
            } else {
                return root;
            }
        }
    }

    //
    private ArrayList<E> inOrder(int root, boolean reverse) {
        ArrayList<E> list = new ArrayList<>();
        if (elements.get(root) == null) {
            return list;
        } else {
            if (reverse) {
                list = inOrder(right(root), true);
                list.add(elements.get(root));
                list.addAll(inOrder(left(root), true));
            } else {
                list = inOrder(left(root), false);
                list.add(elements.get(root));
                list.addAll(inOrder(right(root), false));
            }
            return list;
        }
    }

    // Print Tree
    private String printTree(int root) {
        if (elements.get(root) == null) {
            return "";
        } else {
            return printTree(left(root))
                    + printTab(log2(root + 1))
                    + elements.get(root)
                    + printTab(log2(root + 1)) + "\n"
                    + printTree(right(root));
        }
    }

    // Log 2
    private int log2(int number) {
        return (int) (Math.log(number) / Math.log(2));
    }

    //
    private String printTab(int length) {
        StringBuilder str = new StringBuilder();
        str.append("\t".repeat(Math.max(0, length)));
        return str.toString();
    }

    // get index child note left
    private int left(int root) {
        return root * 2 + 1;
    }

    // get index child note right
    private int right(int root) {
        return root * 2 + 2;
    }



}

class TestBinarySearchTree{
    public static void main(String[] args) {

        BinarySearchTree<String> btsDemo = new BinarySearchTree<>();
        btsDemo.insert("I");
        btsDemo.insert("E");
        btsDemo.insert("C");
        btsDemo.insert("Z");
        btsDemo.insert("G");
        btsDemo.insert("B");
        btsDemo.insert("F");
        btsDemo.insert("A");
        btsDemo.insert("T");
        btsDemo.insert("W");
        btsDemo.insert("D");
        btsDemo.insert("Q");
        btsDemo.insert("R");
        btsDemo.insert("R");
        btsDemo.insert("H");
        btsDemo.insert("J");
        btsDemo.insert("K");
        btsDemo.insert("X");
        btsDemo.insert("S");
        System.out.println(btsDemo);
        btsDemo.remove("C");
        System.out.println(btsDemo.inOrder(true));
        String val = "F";
        System.out.println("Index of " + val + ": " + btsDemo.find(val));

        /*
         * String
         * */
        BinarySearchTree<Integer> BTInt = new BinarySearchTree<>();
        BTInt.insert(15);
        BTInt.insert(1);
        BTInt.insert(71);
        BTInt.insert(9);
        BTInt.insert(0);
        BTInt.insert(33);
        BTInt.insert(14);
        BTInt.insert(23);
        System.out.println(BTInt);
        if (BTInt.remove(5)) {
            System.out.println("Delete success!");
        } else {
            System.out.println("Delete fail!");
        }
        System.out.println(BTInt.inOrder());
        Integer val2 = 71;
        System.out.println("Index of " + val + ": " + BTInt.find(val2));
    }
}