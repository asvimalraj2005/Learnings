public class StringMethods {
    public static void main(String[] args) {
        "Hello".toLowerCase();  // Output: 'hello'
        "Hello".toUpperCase();  // Output: 'HELLO'
        "hello".charAt(1);  // Output: 'e'
        "  hello  ".trim();  // Output: 'hello'
        "hello world".replace("world", "Java");  // Output: 'hello Java'
        "hello".indexOf("e");  // Output: 1
        "a,b,c".split(",");  // Output: ['a', 'b', 'c']
        "hello".concat(" world");  // Output: 'hello world'

    }
}
