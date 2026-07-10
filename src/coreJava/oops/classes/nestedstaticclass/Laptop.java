package coreJava.oops.classes.nestedstaticclass;

public class Laptop {
    private static final String laptopReg = "12K5345HDGS";
    private final String laptopName;

    public Laptop(String laptopName){
        this.laptopName = laptopName;
    }


    /**
     * Both inner classes and nested static classes are the same, but pronounce differently.
     * Because both are quite useful to achieve encapsulation.
     * While for nested static classes as we know we don't need to create an instance of the
     * outer class, because static things we can directly access by using the class name.
     */
    static class VSCode{
        public void createProject(){
            System.out.println("Creating project...");
        }
        public void accessingNonStaticFields(){
            /** The laptopName field is not accessible here, because it is not static. */
            // System.out.println(laptopName);

            /**
             * This is accessible, because laptopReg is a static member of laptop class.
             * that is why we can easily access here. We have only access to all the
             * static members of the Laptop class inside the nested staic VSCode class.
             */
            System.out.println(laptopReg);
        }
    }
}
