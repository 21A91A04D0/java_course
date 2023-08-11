/* Java Variables 

 Variables are the containers for storing data values.

In Java There are different types of variables, for example :
	 
	->string - stores text.string  Values are surrounded by double quotes
	->int - stores integers(whole numbers), without decimals.
	-> float - stores floating point numbers,with decimals.
	-> char - stores single character . char values are surrounded by single quotes
	-> boolean - stores values with two states: true or false
*/


/* Declaring Creating Variables 

-> To create a variable, you must specify the type and assign it a value:
  
  syntax:- type variablename = value:
*/

/*
public class Variables{
    public static void main(String args[]){
	String name = "Siva";
	int x = 10;
	int num;
	num = 30;
	num = 50;
	System.out.println(name);
	System.out.println(x);
	System.out.println(num);
    }
}
*/

// you can also declare a variable without assigning  value, and assign the value later:

// Note that if you assign a new value to the existing variable, it will overwrite the previous value:



/* Final Variable:
 
if you don't want to overwrite the existing values, use the final keyword(this will declare the variable as "final" or "constant", which means unchangeable read only):
  

public class Variables{
    public static void main(String args[]){
	final int num = 30;
	num = 50; // it will show the error cannot assign value to the final variable
    }
}	
*/




/*
How to declare other variables 

public class Variables{
     public static void main(String args[]){
	int num = 30;
	String name = "siva";
	char firstletter = 's';
	boolean mybool = true;
	float myFloat = 5.99f;
	System.out.println(num);
	System.out.println(name);
	System.out.println(firstletter);
	System.out.println(mybool);
	System.out.println(myFloat);
}
} 
*/





/*
To combine both text and variables use the '+' character
you can use the '+'character to add a varible to the another variable:
For numeric values the + character works as the mathematical operator (notice that we use int variables here):


public class Variables {
    public static void main(String args[]){
	String name = "Siva";
	String name1 = "Ganugula";
	System.out.println("Hello" + name);
	System.out.println(name+name1);
}
}
*/







/* Declaring Multiple Variables 
  	 
	To declare more than one variable of the same type, you can use a comma-seperated List:
*/

public class Variables {
    public static void main(String args[]){
	// int x = 5, y = 6, z = 7;
	// int y = 6;
	// int z = 7;
	// same evalue to the multiple variables
	int x,y,z;
	x = y = z = 6;
	System.out.println(x+y+z);
}
}



