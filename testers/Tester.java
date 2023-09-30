package testers;

import java.util.*;
import java.util.stream.*;

public class Tester {
	public static void main(String[] args) {
		try {
			List<String> list1 = Arrays.asList("a", "b", "c");
			Stream<String> seqStream = list1.stream();
			Stream<String> parallerStream = list1.parallelStream();

			seqStream.forEach(e-> System.out.println(e));
			parallerStream.forEach(e-> System.out.println(e));
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}