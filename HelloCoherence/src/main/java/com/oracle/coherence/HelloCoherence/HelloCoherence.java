package com.oracle.coherence.HelloCoherence;

import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedMap;

/**
 * Hello world!
 */
public class HelloCoherence {
    public static void main(String[] args) {
        // System.out.println("Hello World!");
    	
    	{
            NamedMap<String, String> map_1 = CacheFactory.getCache("welcomes");
            
            NamedMap<String, String> map_2 = CacheFactory.getCache("goodbye");

            System.out.printf("Accessing map \"%s\" containing %d entries\n",
                    map_1.getName(),
                    map_1.size());
            
            System.out.printf("Accessing map \"%s\" containing %d entries\n",
                    map_2.getName(),
                    map_2.size());

            map_1.put("english", "Hello");
            map_1.put("spanish", "Hola");
            map_1.put("french" , "Bonjour");
            
            map_2.put("english", "ByeBye");
            map_2.put("spanish", "Adios");
            map_2.put("japan" , "Sayonara");

            // list
            System.out.println("MapName:"+map_1.getName());
            map_1.entrySet().forEach(System.out::println);
            
            // list
            System.out.println("MapName:"+map_2.getName());
            map_2.entrySet().forEach(System.out::println);
            
            }
    }
}
