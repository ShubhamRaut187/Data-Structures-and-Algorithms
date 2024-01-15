# Strings 🔠
In computer science, a string is a data structure that represents a sequence of characters. It is one of the most common and fundamental data types in programming. Strings are used to store and manipulate text or sequences of characters, and they are employed in virtually every programming language.<br>

## String Characteristics
### 1. Immutable vs. Mutable: 🆚
**Immutable Strings:** In languages like Java and Python, strings are typically immutable, meaning once a string is created, its content cannot be modified. Any operation that seems to modify a string actually creates a new string.
**Mutable Strings:** In contrast, some languages and libraries provide mutable string implementations, such as StringBuilder in Java or StringBuffer in some languages. These mutable classes allow efficient concatenation and modification of strings without creating new objects.

## Representation: 🧑🏻‍💼
**Character Array:** One common way to represent strings is as an array of characters. Each character in the array corresponds to a position in the string.
Linked List: Another representation involves using a linked list where each node contains a character and a reference to the next node.

### Operations: 🏋🏻
**Concatenation:** Combining two strings to form a new string.
**Substring:** Extracting a portion of a string.
**Length:** Determining the number of characters in a string.
**Search and Replace:** Locating occurrences of a substring and replacing it with another substring.
**Comparison:** Comparing two strings for equality or determining their lexicographical order.

### String Literals: 
Strings can be represented as literals enclosed in quotation marks. For example, "Hello, World!" is a string literal.

### Encoding:
Strings are composed of characters, and characters themselves are represented using character encodings (e.g., ASCII, Unicode). The encoding scheme defines how characters are mapped to binary representations.

### Regular Expressions:
Strings are often manipulated using regular expressions, providing powerful pattern matching and manipulation capabilities.

### Use Cases:
Strings are fundamental for text processing, input/output operations, and manipulation of textual data.
They are extensively used in areas like parsing, file handling, networking, and user interface development.