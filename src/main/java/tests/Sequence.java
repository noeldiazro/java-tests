package tests;

class Sequence {
    private int from;
    private int to;
    
    Sequence(int from, int to) {
	this.from = from;
	this.to = to;
    }

    String print() {
	StringBuilder result = new StringBuilder();
	result.append(from);
	if (size() == 1) {
	    return result.toString();
	}
	result.append(",");
	result.append(new Sequence(from + 1, to).print());
	return result.toString();
    }

    private int size() {
	return to - from + 1;
    }
}
