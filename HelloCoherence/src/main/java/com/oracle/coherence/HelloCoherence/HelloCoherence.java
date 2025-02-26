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
            NamedMap<String, String> map = CacheFactory.getCache("welcomes");

            System.out.printf("Accessing map \"%s\" containing %d entries\n",
                    map.getName(),
                    map.size());

            map.put("english", "Hello");
            map.put("spanish", "Hola");
            map.put("french" , "Bonjour");

            // list
            map.entrySet().forEach(System.out::println);
            }
    }
}
