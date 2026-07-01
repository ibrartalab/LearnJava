void main() {
    // String are sequence of characters. like your name or Hello world!.
    String myName = "Ibrar Khan";

    // We can define string in java in two ways, one using string literal and string object.
    // In the above example of myName is a type of string literal.
    String today = "Thursday"; // string literal
    String lastWeekSameday = new String("Thursday"); // string object

    /*
    * Note:
    * String literal: store the data or the value in the string pool, a special area for strings literals in the heap.
      which means if you crate two literals with same data, it will only create and allocate memory at once. And both will be pointing to the same address.
    */
    String name1 = "MyName";
    String name2 = "MyName";
    System.out.println(name1 == name2); // true -> because both are pointing to the same memory address in the string pool.
    System.out.println(name1.equals(name2)); // Always use String.equals method to compare the data of two strings.

    /*
    * Note:
    * String object: store the data in heap.
    * And each time when you create a new object of the string class it allocate new memory with new reference.
     */
    String nameObj1 = new String("MyName");
    String nameObj2 = new String("MyName");

    System.out.println(nameObj1 == nameObj2); // false -> both are referencing to the new memory address.
    System.out.println(nameObj1.equals(nameObj2)); // true
    /*
     * Because Java use string pool for memory optimization. String pool is a specialized storage area inside the Heap to store only one copy/instance
     * of the identical same strings and share its reference across all variables.
     */

    // Strings are immutable what mean by that.
    String greet = "Hello";
    greet = "Hi";
    System.out.println(greet); // Hi
    /*
     * Now you might be thinking that the string which we had created greet with initial value
     * of "Hello" then we assign a new value which is "Hi". After printing, it is confirmed
     * that the string has been changed. While somehow you are true, but not in this case
     * because string create a new memory in the heap and then pointing greet to the newly created
     * string , and after some time the old values has deleted by the GC(Garbage Collector).
     */

    // In Java, we have a lot of string methods , some of the important once we gonna use it.
    String fullName  = "Ibrar Khan";
    // if we want to just extract the first name, we can easily do it with the help of substring method.
    // We used 5 for the ending index here, but the first name ends with index 4.
    //Just because the ending index is exclusive.
    String firstName = fullName.substring(0,5);
    System.out.println(firstName);

    // Now these methods are used to convert the string into either lower or upper case.
    String nameInUpperCase = fullName.toUpperCase();
    String nameInLowerCase = fullName.toLowerCase();
    System.out.println(nameInUpperCase);
    System.out.println(nameInLowerCase);

    // to check a specific character on a specified index
    System.out.println(fullName.charAt(4)); // r

    // others
    int fullNameLength = fullName.length(); // the length of the string(characters count)
    String replacedFullName = fullName.replace("Khan","talab");
    System.out.println(replacedFullName); // replace khan with talab
    System.out.println(fullName.trim()); // remove extra spaces around the string
    // Both are used to compare two string based on their length/size of the string.
    // if string one has length of 3 and string two 4 it will return 1 otherwise 0.
    System.out.println(fullName.compareTo("Ibrar Khan"));
    System.out.println(fullName.compareToIgnoreCase("IBRAR Khan"));

}