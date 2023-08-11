/* Type casting

There are two types of casting in java:
	Type casting is when you assign a value of one primitive data type to another type.
1)Widening casting
2)Narrowing casting

Widening casting (automatically)--> Converting a smaller type to a larger type size
----------------
byte -> short -> char -> int -> long -> float -> double

Narrowing casting (manually)--> converting a larger type to a smaller size type
-----------------
 double -> float -> long -> int -> char -> short -> byte */

/* class Casting{
    public static void main(String args[]){
	int myint = 9;
	double mydouble = myint;
	
	System.out.println(myint);
	System.out.println(mydouble);
}
}
*/
class narrow{
    public static void main(String args[]){
	double mydouble = 9.78d;
	int myint = (int) mydouble;
	
	System.out.println(mydouble);
	System.out.println(myint);
}
}