# Expressions and Control Flow
## Java
Java is a programming language and computing platform first released by Sun Microsystems in 1995. There are lots of applications and websites that will not work unless you have Java installed, and more are created every day. Java is fast, secure, and reliable. From laptops to datacenters, game consoles to scientific supercomputers, cell phones to the Internet, Java is everywhere!

## IntelliJ IDEA
IntelliJ IDEA is a Java integrated development environment (IDE) for developing computer software. It is developed by JetBrains (formerly known as IntelliJ), and is available as an Apache 2 Licensed community edition,[3] and in a proprietary commercia edition. Both can be used for commercial development.

## statement
Java statement is just an instruction that explains what should happen.

## variables
A variable provides us with named storage that our programs can manipulate. Each variable in Java has a specific type, which determines the size and layout of the variable's memory; the range of values that can be stored within that memory; and the set of operations that can be applied to the variable.

You must declare all variables before they can be used.

* **declaration**
To be able to use a variable it needs to be declared. Declaring variables is normally the first thing that happens in any program.

* **giving value**
```java
int number = 10;
```

* **byte**
(number, 1 byte)

* **int**
(number, 4 bytes)

* **float**
(float number, 4 bytes)

Float is a term is used in various programming languages to define a variable with a fractional value. Numbers created using a float variable declaration will have digits on both sides of a decimal point. This is in contrast to the integer data type, which houses an integer or whole number.

* **boolean**
(true or false, 1 byte)

* **char**
(a character, 2 bytes)

* **String**
revious • Trail • Next »
Strings, which are widely used in Java programming, are a sequence of characters. In the Java programming language, strings are objects.

The Java platform provides the String class to create and manipulate strings.

```java
String greeting = "Hello world!";
```

## operators
* **+** : Addition
* **-** : Substraction
* ** \* ** : Multiplication
* / : Division
* % : Modulus 	Divides left-hand operand by right-hand operand and returns remainder.
* = : Simple assignment operator. Assigns values from right side operands to left side operand.
* += : Add AND assignment operator. It adds right operand to the left operand and assign the result to left operand.
* -= : Subtract AND assignment operator. It subtracts right operand from the left operand and assign the result to left operand.
* /= : Divide AND assignment operator. It divides left operand with the right operand and assign the result to left operand.
* == :Checks if the values of two operands are equal or not, if yes then condition becomes true.
* \>= : Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true.
* <= : Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true.
* \> : Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true.
* \< : Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true.
* || : Called Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true.
* && : 	Called Logical AND operator. If both the operands are non-zero, then the condition becomes true.
* \! : Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false. 

## difference between variable declaration and statements

## System.out.println()
```java
System.out.println("Hello, World!")
```
> Hello, World!

## Hello World
Hello World is a simple program that, when run, displays the message: Hello World . Fittingly, the Hello World program has long been the new programmer's induction into a myriad of programming languages.

## escape character
* \\t Insert a tab in the text at this point.
* \\b Insert a backspace in the text at this point.
* \\n Insert a newline in the text at this point.
* \\r Insert a carriage return in the text at this point.
* \\f Insert a formfeed in the text at this point.
* \\' Insert a single quote character in the text at this point.
* \\" Insert a double quote character in the text at this point.
* \\ Insert a backslash character in the text at this point.

## "Java's stuff" and 'stuff of Java'

## concatenation
In java, string concatenation forms a new string that is the combination of multiple strings. There are two ways to concat string in java:

1. By + (string concatenation) operator
```java
int age = 12;
System.out.println("My age is " + age);
```

> My age is 25.

2. By concat() method

## condition, if, else
The **if** statement gets a condition, evaluates it and, if the result is true, executes the code.

The if statement may contain an optional **else** block. It executes when the condition is wrong.

```java
if(Boolean_expression) {
   // Executes when the Boolean expression is true
}else {
   // Executes when the Boolean expression is false
}
```

## loops: for, while
```java
int a = 0;
    while (a < 10) {
      System.out.println(a); // Prints the numbers from 0 to 9
      a += 1;
    }

    for (int i = 0; i < 100; i++) {
      System.out.println(i); // Prints the numbers from 0 to 99
    }
  }
}
```


## block
A block in Java is a group of one or more statements enclosed in braces. A block begins with an opening brace ({) and ends with a closing brace (}). Between the opening and closing braces, you can code one or more statements. For example:
```java
{
    int i, j;
    i = 100;
    j = 200;
}
```


##  scanner
Java has various ways to read input from the keyboard, and the Scanner is one of them.
* **System.in**
Creates a scanner

```java
Scanner scanner = new Scanner(System.in);
```

* **nextLine()**
The program stops and waits for user input and to press enter

```java
String userInput1 = scanner.nextLine();
```

* **nextInt()**
The program stops and waits for user input that is an integer and to press enter
```java
int userInput2 = scanner.nextInt();
