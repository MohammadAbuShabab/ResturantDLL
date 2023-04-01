
public class DoublyLinkedList<T> {
	Node headNode, tailNode = null;
	
	public void add(T data) {
	Node<T> newDLLNode = new Node<T>(data);
		if(headNode == null) {
			headNode = tailNode = newDLLNode;
			headNode.prevNode = null;
			tailNode.nextNode = null;
		}
		else {
			tailNode.nextNode = newDLLNode;
			newDLLNode.prevNode = tailNode;
			tailNode = newDLLNode;
			tailNode.nextNode = null;
		}
	}
	public T poll() {
			if(headNode == null) {
				return null;
			}
			else {
				Node<T> newheadNode = headNode.nextNode;
				Node<T> headNodeToReturn = headNode;
				headNode = newheadNode;
				return headNodeToReturn.getData();
			}
		}
	public void displayNode() {
		Node currentNode = headNode;
		if(headNode == null) {
			System.out.println("Queue is empty");
			return;
		}
		System.out.println("Queue: ");
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.nextNode;
		}
	}
	
	public boolean isEmpty() {
		return headNode == null;
	}

}
