package HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHAshMApp {
public static void main(String[] args) {
	//Map m= new HashMap();
	Map m= new IdentityHashMap<>();

	Integer I1 =new Integer(10);
	Integer I2 =new Integer(10);
	m.put(I1, "Vaibhav");
	m.put(I2, "Pravin");
	System.out.println(m);

		}

	}



