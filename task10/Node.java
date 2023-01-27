class Node {
    public Node next;
    public Task task;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}