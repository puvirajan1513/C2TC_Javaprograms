package day15.generics;
import java.util.*;

public class UnBoundedWildCard {
	public static void display(List<?> ll) {
		for (Object o : ll) {
			System.out.println(o);
		}
	}

}
