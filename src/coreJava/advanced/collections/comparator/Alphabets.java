package coreJava.advanced.collections.comparator;

public class Alphabets {
    public int id;
    public Character alphabet;

    public Alphabets(int id,Character alphabet){
        this.id = id;
        this.alphabet = alphabet;
    }

    @Override
    public String toString() {
        return "Alphabets{" +
                "id=" + id +
                ", alphabet=" + alphabet +
                '}';
    }
}
