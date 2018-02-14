package tests;

class MyString {
    private String text;
    
    MyString(String text) {
	this.text = text;
    }

    int countChar(char searchFor) {
	if (text.isEmpty()) {
	    return 0;
	}
	return (startsWith(searchFor) ? 1 : 0) + substring(1).countChar(searchFor);
    }

    private boolean startsWith(char searchFor) {
	return text.charAt(0) == searchFor;
    }

    private MyString substring(int index) {
	return new MyString(text.substring(1));
    }
}
