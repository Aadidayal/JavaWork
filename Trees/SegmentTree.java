public class SegmentTree {

    private static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    private Node root;

    // Constructor to build the tree
    public SegmentTree(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data;
        return node;
    }

    // Display the segment tree structure
    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        if (node == null) return;

        String str = "";

        if (node.left != null) {
            str += "Left: [" + node.left.startInterval + "-" + node.left.endInterval + "] = " + node.left.data + " ";
        } else {
            str += "Left: null ";
        }

        str += "=> [" + node.startInterval + "-" + node.endInterval + "] = " + node.data + " ";

        if (node.right != null) {
            str += "Right: [" + node.right.startInterval + "-" + node.right.endInterval + "] = " + node.right.data;
        } else {
            str += "Right: null";
        }

        System.out.println(str);

        display(node.left);
        display(node.right);
    }

    // Query the sum in the range [qsi, qei]
    public int query(int qsi, int qei) {
        return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        // Complete overlap
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        }

        // No overlap
        if (node.endInterval < qsi || node.startInterval > qei) {
            return 0;
        }

        // Partial overlap
        int leftSum = query(node.left, qsi, qei);
        int rightSum = query(node.right, qsi, qei);
        return leftSum + rightSum;
    }

    // Update a single element at index
    public void update(int index, int value) {
        this.root.data = update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {
        if (node.startInterval == node.endInterval) {
            node.data = value;
            return node.data;
        }

        int mid = (node.startInterval + node.endInterval) / 2;

        if (index <= mid) {
            int leftUpdated = update(node.left, index, value);
            node.data = leftUpdated + node.right.data;
        } else {
            int rightUpdated = update(node.right, index, value);
            node.data = node.left.data + rightUpdated;
        }

        return node.data;
    }
    class Main {
        public static void main(String[] args) {
            int[] arr = {2, 5, 1, 4, 9, 3};
            SegmentTree st = new SegmentTree(arr);
    
            st.display();
    
            System.out.println("Sum from index 1 to 3: " + st.query(1, 3)); // Expected: 5 + 1 + 4 = 10
    
            st.update(2, 10); // arr[2] = 1 -> 10
    
            System.out.println("Sum from index 1 to 3 after update: " + st.query(1, 3)); // Expected: 5 + 10 + 4 = 19
    
            st.display();
        }
    }
}
