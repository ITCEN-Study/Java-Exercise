package day3;

public class ArrayLab3 {

	public static void main(String[] args) {
		char[] elems = new char[] {'J', 'a', 'v', 'a'};
		
		for (int i = 0; i < elems.length; i++) {
			if (elems[i]  >= 'A' && elems[i] <= 'Z') {
				elems[i] = Character.toLowerCase(elems[i]);
			}
			else if (elems[i]  >= 'a' && elems[i] <= 'z') {
				elems[i] = Character.toUpperCase(elems[i]);
			}
		}
		for (int i = 0; i < elems.length; i++) {
            System.out.println(elems[i]);
        }
	}

}
