package coreJava.advanced.collections.mapbranch;

import java.util.*;

public class LearnMap {
    static void main(String[] args) {
        /*
          The Map(Interface) is the second branch of the Java Collection Framework.
          It does not extend the Collection Interface, because it does not store single items.
          Map store data in Key-Value pairs(like a real world dictionary where the key is the word
          and definition is the value).
          Map key should be unique and value may be duplicate.

          One-way of lookup: you can look up a value by their corresponding key, but can not
          look up a key by its value.

          There are two interfaces in this branch the Map which is the parent interface and
          SortedMap which extends Map.

          Further these interfaces are implemented by HashMap, TreeMap, LinkedHashMap.
          We will try it one by oe.
         */

        /*
         HashMap is the most efficient with a lighting-fast speed for looking up, insertion,
         deletion of pairs in a constant time O(1).
         It stores pairs in a random order.
         Its allow one null key, and multiple null values.
         Uses a hash table mechanism under the hood.
        */
        Map<Integer,String> cityMap = new HashMap<>();
        cityMap.put(1,"Islamabad");
        cityMap.put(null,"Karachi");
        System.out.println(cityMap);
        System.out.println(cityMap.get(null));
        cityMap.replace(null,"Lahore");
        System.out.println(cityMap);
        cityMap.replace(1,"Islamabad","Multan");
        System.out.println(cityMap);

        /*
         LinkedHashMap use strictly maintain insertion order.
         Slower than HashMap, because it is a doubly-linked list which keep track of two pointers
         for forward and backward tracking.
         It also uses a hash table mechanism under the hood, but reinforcing doubly linked list.
         This also allows null key and null values.
         */
        Map<Integer,String> countryMap = new LinkedHashMap<>();
        countryMap.put(1,"Pakistan");
        countryMap.put(null,"China");
        countryMap.put(2,"USA");
        System.out.println(countryMap);

        /*
         TreeMap is using the self-sorting order. Automatically sorts all pairs by their Keys in
         natural ascending order (A-Z, 1-10).
         Slower O(logN) time, because it sorts on every modification.
         Does not allow null keys (will throw a NullPointerException), but allows null values.
         */
        Map<Integer,String> sortedCountryMap = new TreeMap<>();
        sortedCountryMap.put(4,"Germany");
        sortedCountryMap.put(1,"Pakistan");
        sortedCountryMap.put(3,"Dubai");
        sortedCountryMap.put(2,"USA");
        System.out.println(sortedCountryMap);
        // {1=Pakistan, 2=USA, 3=Dubai, 4=Germany}
        Map<Character,String> sortedMap1 = new TreeMap<>();
        sortedMap1.put('B',"Two");
        sortedMap1.put('A',"One");
        sortedMap1.put('C',"Three");
        System.out.println(sortedMap1); // {A=One, B=Two, C=Three}

        // Extract the keys in a Set representation
        Set<Integer> keys = sortedCountryMap.keySet();
        System.out.println(keys);
        // Extract the values from the map
        Collection<String> countries = sortedCountryMap.values();
        System.out.println(countries);
        /*
         If your map missing a key or the key you have passed to the get() method has no mapping
         in map. But you don't want to return null, instead to return a default value if this is
         possible, so for this kind of situation we could use getOrDefault() method.
        */
        Map<Integer,String> languages = new HashMap<>();
        languages.put(1,"Java");
        languages.put(2,"C++");
        languages.put(3,"JavaScript");
        System.out.println(languages.get(4));
        System.out.println(languages.getOrDefault(4,"C"));
        /*
         Actually you can check either a key is existing in the map or not.
         by using this method containsKey(Object key).
        */
        System.out.println(languages.containsKey(4));

    }
}
