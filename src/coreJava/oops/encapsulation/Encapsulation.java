package coreJava.oops.encapsulation;

public class Encapsulation {
    // Encapsulation is one of the oops principle which give us a way to achieve
    // building same type or logic together in a single file to district access to it.
    // Which is a way of hiding the data and sensitive information.

    // We basically encapsule all the logic that is worked together into one single place.

    // we can not access these properties outside this class even
    // by creating an object of this class.
    private static final String city = "Karachi";
    private String capital;
    private boolean isSomthingWrong;
    private String uniqueCode;

    /*
     To access all the private members of the class we need to create
     getter and setter for them.
     getter and setter are public methods which is provide a way to expose
     all the hidden members of the class.
     But then what is the use case of encapsulation and private members if we are
     exposing it directly, while we never expose them directly instead we add
     some checks rules who's gonna access them and who's gonna set/modify them.

        public static String getCity() {
            return city;
        }

        public void setUniqueCode(String uniqueCode) {
            this.uniqueCode = uniqueCode;
        }

        public String getUniqueCode() {
            return uniqueCode;
        }
    */
    public Encapsulation(boolean isSomethingWrong, String capital){
        this.isSomthingWrong = isSomethingWrong;
        this.capital = capital;
    }
    // if there is something unexpected happened in the capital city of ICT then,
    // the current city Karachi will be the capital.
    public void setCapital(){
        if(isSomthingWrong){
            this.capital = city;
        }
    }
    public void getCapital(){
        System.out.println("Capital is: " + this.capital);
    }

}
