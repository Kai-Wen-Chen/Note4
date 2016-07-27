package note4;

public class Main {
	public static void main(String args[]){
		System.out.println("Note 4: &,| vs &&,||");
		System.out.println("&,|兩邊條件都會做判斷和運算");
		System.out.println("&&,||則是會先判斷和運算左邊，"
				+ "如果判斷完仍需要右邊才會判斷和運算右邊");
		
		int a = 5;
		System.out.println("a = 5, if (true||++a>0) ");
		if (true || ++a > 0) System.out.println("a = " + a);
		System.out.println("因左邊已是true，對OR來說已經是true，故不做++a>0");
		
		System.out.println("a = 5, if (true|++a>0) ");
		if (true | ++a > 0) System.out.println("a = " + a);
		System.out.println("兩邊都會判斷和運算");
	}
}
