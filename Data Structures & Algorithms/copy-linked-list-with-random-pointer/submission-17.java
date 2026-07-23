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
    public Node copyRandomList(Node head) {
        Node cur = head;
        //New hashmap:
        Map<Node, Node> copyOfOld = new HashMap<>();

        while (cur != null){
            copyOfOld.put(cur, new Node(cur.val));
            cur = cur.next;
        }

        cur = head;
        while(cur != null){
            Node copy = copyOfOld.get(cur);
            copy.next = copyOfOld.get(cur.next);
            copy.random = copyOfOld.get(cur.random);
            cur = cur.next;
        }

        // System.out.println(copyOfOld);

        // for (Map.Entry<Node, Node> entry : copyOfOld.entrySet()) {
        //     System.out.println("Key: " + entry.getKey().val + ", Value: " + entry.getValue().val + ", Random: " + entry.getKey().random.val);
        // }

        return copyOfOld.get(head);
    }
}
