## Input
There are many different ways to get user input. We will use  the `Scanner` class

1. `import java.util.Scanner;`
2. Create a "scanner" object
3. Output prompt to guide user

`Scanner user = new Scanner(system.In);`

### Input types
1. `nextInt()` reads integer value from user
2. `nextFloat()` or  `nextDouble()` reads a decimal value from user
3. `nextBoolean()` reads a boolean value from user
4. `nextLine()` reads a string value

## String
A collection of characters that is immutable (can't be changed)

Ex: `"My name is corey"`

### Constructing string types

We can create string objects similar to premitive data types.

` string painandsuffering = "Potato;"`

### Concentration of Strings

Strings can be added together using "concentration (+)

`string firstname = "joe";`

`string lastname = "jones";`

`string fullname = firstname + lastname'`

### Compasring Strings

In Java, you can compare strings by:

`equals` method

`compareTo()` method

**equals method**

`string1.equals.(string2)` returns a boolean value of true or false

**compareto method**

`string1.compare2(string2);`

Possible answers:
- `0` if they are equal
- A value greater than `0` if the first string precedes the second in the dictionary
- Vice versa

`String first = "water";`

`String second = "melon";`

When compared it will return a value less than 0 b/c melon is alphabetically before water

### Indexing string
Even though strings can't change, you can take parts of a string for a new string

**substring() method**

2 different forms
-string1.substring(5)
  -First for takes a single integer imput and returns the characters of the string from the index of the input to the end.

`String axolotlCondition = "dead";`

`String half = axolotlCondition.substring(2);`

Will output "ad" because "a" is in position 2 and it outputs everything from 2 onwards. If you put in, say, `1`, it would output "ead"

If you put 2 integers seperated by a comma, it outputs everything between those positions including the first, but not the second.

### Length

To find the length of a string, use:

`String stringName = "amogus;"`

`int length = stringName.length();` returns the string length