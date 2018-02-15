package tests;

class MyString implements Comparable<MyString> {
    private String text;
    
    MyString(String text) {
	this.text = text;
    }

    int countChar(char searchFor) {
	if (isEmpty()) {
	    return 0;
	}
	return (startsWith(searchFor) ? 1 : 0) + removeFirstCharacter().countChar(searchFor);
    }

    private boolean isEmpty() {
	return text.isEmpty();
    }
    
    private boolean startsWith(char searchFor) {
	return text.charAt(0) == searchFor;
    }

    private MyString removeFirstCharacter() {
	return substring(1);
    }
    
    private MyString substring(int beginIndex) {
	return new MyString(text.substring(beginIndex));
    }

    boolean isPalindrome() {
	if (isEmptyOrOneCharacter()) {
	    return true;
	}
	return firstCharacterEqualsLastOne() && removeExtremes().isPalindrome();
    }

    private boolean isEmptyOrOneCharacter() {
	return text.length() <= 1;
    }

    private boolean firstCharacterEqualsLastOne() {
	return text.charAt(0) == text.charAt(text.length() - 1);
    }

    private MyString removeExtremes() {
	return substring(1, text.length() - 1);
    }
    
    MyString endTrim() {
	if (isEmpty()) {
	    return this;
	}
	if (!lastCharacterIsWhitespace()) {
	    return this;
	}
	return removeLastCharacter().endTrim();
    }

    public int compareTo(MyString that) {
	return this.text.compareTo(that.text);
    }

    private boolean lastCharacterIsWhitespace() {
	return Character.isWhitespace(text.charAt(text.length()-1));
    }
    
    private MyString removeLastCharacter() {
	return substring(0, text.length() - 1);
    }

    private MyString substring(int beginIndex, int endIndex) {
	return new MyString(text.substring(beginIndex, endIndex));
    }    
}
