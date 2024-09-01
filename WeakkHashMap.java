package HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Iterator;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.HashMap;

public class WeakkHashMap {
	
	public static void main(String[] args) {
		//Map m= new HashMap();
		//Map m= new IdentityHashMap<>();
		Map m= new WeakHashMap<>();
//Map m=new HashMap();
		Temp t=new Temp();
		
		m.put(t,"hello");//op:{Temp=hello}
		System.out.println(m);
t=null;//op:{}
System.gc();//this is garbage collector method
System.out.println(m);//it will not get calle isnted of this we will get finalize method from temp class as output
			}

		}




	


