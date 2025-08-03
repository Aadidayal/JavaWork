// package Trees;

public class Traversals {
    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Node root;

    public Traversals() {
    }

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int value) {
        root = insert(value, root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value < node.value) {
            node.left = insert(value, node.left);
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }
        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public void populate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void populateSorted(int nums[]) {
        populateSorted(nums, 0, nums.length);
    }

    private void populateSorted(int nums[], int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = (start + end) / 2;
        this.insert(nums[mid]);
        populateSorted(nums, start, mid); // left
        populateSorted(nums, mid + 1, end); // right
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1
                && balanced(node.left)
                && balanced(node.right);
    }

    public void display() {
        preOrder(root);

    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.value + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void display2() {
        IntOrder(root);

    }

    private void IntOrder(Node node) {
        if (node == null) {
            return;
        }
        IntOrder(node.left);
        System.out.println(node.value + " ");
        IntOrder(node.right);
    }

    public void display3() {
        postOrder(root);

    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.value + " ");
    }

    public static void main(String[] args) {
        Traversals trees = new Traversals();
        int nums[] = { 1, 2, 7, 10, 3, 5, 4, 6, 9 };
        trees.populate(nums);
        trees.display2();

    }

}
