int pathLength(Node root, int n1) {
        if (root == null)
            return 0;
        else {
            int x = 0;
            if ((root.data == n1) || (x = pathLength(root.left, n1)) > 0 ||
                (x = pathLength(root.right, n1)) > 0)
                return x + 1;
        }

        return 0;
    }