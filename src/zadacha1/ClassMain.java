package zadacha1;

import java.util.*;

public class ClassMain {
	public static void main(String[] args) {
		Map<String, String> rechnik = new HashMap<String, String>();
		rechnik.put("Cup", "Findzal");
		rechnik.put("Cap", "Kapa");
		rechnik.put("Chair", "Stolica");
		rechnik.put("Bed", "Krevet");
		rechnik.put("hi", "Zdravo");
		System.out.println("Kluchevi: " + rechnik.keySet());
		System.out.println("Vrednosti: " + rechnik.values());
		for(Map.Entry<String, String> entry: rechnik.entrySet()) {
			System.out.println(entry.getKey() + " | " + entry.getValue());
		}
		if(rechnik.containsKey("hi")) {
			System.out.println("Prevodot za hi e: " + rechnik.get("hi"));
		}
		else {
			System.out.println("Takov zbor ne postoi");
		}
	}
}
