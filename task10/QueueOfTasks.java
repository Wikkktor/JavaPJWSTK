
class QueueOfTasks extends TaskQueue {
    public int length;
    public Node head, tail;

    public QueueOfTasks() {
        length = 0;
        head = tail = null;
    }

    public void enqueue(Task data) {
        Node node = new Node(data);
        if (empty())
            head = node;
        else
            tail.next = node;
        tail = node;
        length++;
    }

    public Task dequeue() throws Exception {
        if (empty())
            throw new Exception();
        Task result = head.task;
        head = head.next;
        length--;
        if (empty())
            tail = null;
        return result;
    }

    public Task first() throws Exception {
        if (empty())
            throw new Exception();
        return head.task;
    }

    public boolean empty() {
        return (length == 0);
    }

    public int size() {
        return length;
    }
}