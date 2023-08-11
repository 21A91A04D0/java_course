/* 
--> strings are used for storing text.
A string variable contains a collection of characters surrounded by double quotes.


--> String Length
A string in Java is actually an object,which contains methods that can perform certain operations on strings.For example,the length of astring can be found with the length() method:

--> More String methods:
    -------------------
There are many string methods available, for example toUpperCase()  and toLowerCase():



--> Finding a character in a string:
The indexof() method returns the index (the position) of the first occurrence of a specified text in a string(including whitespace):

--> codePointAt() : Returns the unicode of the character at the specified index -->return Type: int

--> concat() : Appends a string to the end of another string.

-->isEmpty(): check whether a string is empty or not.

-->lastIndexOf(): Returns the position of the last found occurence of specified characters in a string.

-->replace(): Searches a string for a specified value, and returns a new string where the specified values are replaced.

-->trim(): Removes whitespace from both ends of a string


If you add a number and a string, the result will be a string concatenation


\n -> New Line
\r -> Carriage Return
\t -> Tab
\b -> Backspace
\f -> Form Feed
*/
class strings{
    public static void main(String args[]){
	String name = "siVA GanuGula";
	String name1 = "welcome!!";
	System.out.println(name);
	System.out.println("my name is:"+ name.length());
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	System.out.println(name.indexOf("G"));
	System.out.println(name.codePointAt(2));
	System.out.println(name.concat(name1));
	System.out.println(name.isEmpty());
	System.out.println(name.lastIndexOf("a"));
	System.out.println(name.replace('a','b'));	
}
}