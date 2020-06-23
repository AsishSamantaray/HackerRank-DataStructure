public static void levelOrder(Node root) {
      
    Queue<Node> queue = new LinkedList<Node>();
    queue.add(root);
    
    while(!queue.isEmpty()) {
        Node n = queue.poll();
        System.out.print(n.data + " ");
        if(n.left != null) queue.add(n.left);
        if(n.right != null) queue.add(n.right);
    }
}
