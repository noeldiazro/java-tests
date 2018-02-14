package tests;

class MyString {
    private String text;
    
    MyString(String text) {
	this.text = text;
    }

    int countChar(char searchFor) {
	if (isEmpty()) {
	    return 0;
	}
	return (startsWith(searchFor) ? 1 : 0) + trimFirstCharacter().countChar(searchFor);
    }

    private boolean isEmpty() {
	return text.isEmpty();
    }
    
    private boolean startsWith(char searchFor) {
	return text.charAt(0) == searchFor;
    }

    private MyString trimFirstCharacter() {
	return substring(1);
    }
    
    private MyString substring(int beginIndex) {
	return new MyString(text.substring(beginIndex));
    }

    boolean isPalindrome() {
	if (isEmptyOrOneCharacter()) {
	    return true;
	}
	return firstCharacterEqualsLastOne() && trimExtremes().isPalindrome();
    }

    private boolean isEmptyOrOneCharacter() {
	return text.length() <= 1;
    }

    private boolean firstCharacterEqualsLastOne() {
	return text.charAt(0) == text.charAt(text.length() - 1);
    }

    private MyString trimExtremes() {
	return substring(1, text.length() - 1);
    }
    
    private MyString substring(int beginIndex, int endIndex) {
	return new MyString(text.substring(beginIndex, endIndex));
    }
}
