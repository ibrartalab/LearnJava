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
    * String object: store the references in heap.
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

    // In Java, we have a lot of string methods , some of the important once we gonna use it.
    String fullName  = "Ibrar Khan";
    // if we want to just extract the first name, we can easily do it with the help of substring method.
    String firstName = fullName.substring(0,5); // We used 5 for the ending index here, but the first name ends with index 4.
                                                //Just because the ending index is exclusive.
    System.out.println(firstName);
    System.out.println(fullName.subSequence(0,5));

    String nameInCapitalCase = fullName.toUpperCase();
    String nameInLowerCase = fullName.toLowerCase();
    System.out.println(nameInCapitalCase);
    System.out.println(nameInLowerCase);

    // to check a specific character on a specified index
    System.out.println(fullName.charAt(4)); // r
}