package coreJava.advanced.collections.comparator;

public class Languages {
    public int id;
    public  String name;

    public Languages(int id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Languages{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
