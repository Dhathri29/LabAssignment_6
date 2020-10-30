package labAssignmentQ3_BOOK;
import java.io.*;
import java.util.*;
public class Q4 {
	public static void main(String[] args) {
		double maxValue = 0;
		int value = 0;
		List<String> list = new ArrayList<>();
		try {
			Scanner sc = new Scanner(new FileReader("data.txt"));
			String line = null;
			while (sc.hasNext()) {
				line = sc.nextLine();
				list.add(line);
			}
			for (int i = 0; i < list.size(); i++) {
				value = Double.compare(Double.parseDouble(list.get(i)), maxValue);
				if (value > 0) {
					maxValue = Double.parseDouble(list.get(i));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(maxValue);

	}
}
