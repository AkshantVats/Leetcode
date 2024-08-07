/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    HashMap<Node, Node> visited = new HashMap<>();
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }

        Node oldNode = head;
        Node newNode = new Node(oldNode.val);
        this.visited.put(oldNode , newNode);

        while(oldNode != null){
            newNode.random = this.getClonedNode(oldNode.random);
            newNode.next = this.getClonedNode(oldNode.next);
            oldNode = oldNode.next;
            newNode = newNode.next;
        }
        return visited.get(head);
    }

    public Node getClonedNode(Node node){
        if(node != null){
            if(this.visited.containsKey(node)){
                return this.visited.get(node);
            } else{
                this.visited.put(node, new Node(node.val ,null,null));
                return this.visited.get(node);
            }
        }
        return null;
    }
}