package vb;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public class Test {

	public static void main(String[] args) {
		System.out.println(System.getenv("SHELL"));
		 Map m = System.getenv();
         for ( Iterator it = m.keySet().iterator(); it.hasNext(); )
         {
                String key = (String ) it.next();
                String value = (String )  m.get(key);
                System.out.println(key +":" +value);
         }
         System.out.println( "--------------------------------------1" );
         Properties p = System.getProperties();
        
         for ( Iterator it = p.keySet().iterator(); it.hasNext(); )
         {
                String key = (String ) it.next();
                String value = (String )  p.get(key);
                System.out.println(key +":" +value);
         }

	}
	public void method1(){
		
		//...
	}

}
