package model;

public class Board {

	private Node first;
	private Node last;

	public void createBoard(int dimension) {

		for (int i = 0; i < dimension; i++) {
			Node tempNode = new Node(i + 1);
			insertNodes(tempNode);

		}

	}

	public void insertNodes(Node entryNode) {

		if (first == null) {

			first = entryNode;
			last = entryNode;
		} else {

			Node penultimo = new Node();
			penultimo = last;
			last = entryNode;
			penultimo.setNext(last);
			last.setPrev(penultimo);

		}

	}

	public void printBoard(int rows, int columns) {
		Node breakNode = new Node();

		breakNode = last;
		String row = "";

		for (int i = 0; i < rows; i++) {
			for (int a = 0; a < columns; a++) {
				if (i % 2 == 0) {
					if (breakNode.getPrev() != null) {
						if (a == 0) {
							row = row + breakNode.getPos();
							breakNode = breakNode.getPrev();
						} else {
							row = row + " " + breakNode.getPos();
							breakNode = breakNode.getPrev();

							if (breakNode.getPrev() == null) {
								row = row + " " + breakNode.getPos();
							}
						}
					}
				} else {
					if (breakNode.getPrev() != null) {
						row = breakNode.getPos() + " " + row;
						breakNode = breakNode.getPrev();
						if (breakNode.getPrev() == null) {
							row = breakNode.getPos() + " " + row;
						}
					}
				}

			}
			System.out.print(row);
			System.out.println("");
			row = "";
		}

	}

}
