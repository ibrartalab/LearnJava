package coreJava.advanced.collections.collectionbranch;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class CustomObjectList {
    static void main() {
        // We can pass our own custom objects same like the wrapper classes Integer, String,
        // Float, and Character etc.
        Languages java  = new Languages(1,"Java");
        Languages cpp  = new Languages(2,"C++");
        Languages javaScript  = new Languages(3,"JavaScript");
        Languages python  = new Languages(4,"Python");
        Languages ruby  = new Languages(5,"Ruby");
        List<Languages> languagesList = new ArrayList<>();
        languagesList.add(java);
        languagesList.add(cpp);
        languagesList.add(javaScript);
        languagesList.add(python);
        languagesList.add(ruby);
        languagesList.add(ruby); // we know that list support duplicates
        System.out.println(languagesList);

        /*
         What if we create a set of languages and try to add
         same data twice, although set does not allow duplicates entry
         But in this case it is allowing duplicates, why, because we are
         creating two different objects of the Languages and adding them,
         in this case java never run the equals() method different hash codes.
         To solve this we need to explicitly override the equals() and hascode().
        */
        HashSet<Languages> languagesSet = new HashSet<>();
        languagesSet.add(new Languages(1,"Java"));
        languagesSet.add(new Languages(1,"Java"));
        System.out.println(languagesSet);
        System.out.println(languagesSet.size());

    }
}

class Languages{
    public int id;
    public String name;

    public Languages(int id,String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Languages{" +
                "id=" + this.id +
                ",name=" + this.name + "}";
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return  true;
        if(o == null || getClass() != o.getClass()) return false;
        Languages languages = (Languages) o;
        return Objects.equals(id,languages.id);
    }
    @Override
    public int hashCode(){
      return Objects.hash(this.id);
    }
}
