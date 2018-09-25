class Node {
	private int name;
	private Node node;

		Node(int name) {
			this.name = name;
			this.node = null;
		}

		public int getName() {
			return name;
		}
		public Node getNextNode() {
			return node;
		}
		public void setName(int name) {
			this.name = name;
		}
		public void setNextNode(Node nextnode) {
			this.node = node;

		}
}
