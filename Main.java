package note4;

public class Main {
	public static void main(String args[]){
		System.out.println("Note 4: &,| vs &&,||");
		System.out.println("&,|������󳣷|���P�_�M�B��");
		System.out.println("&&,||�h�O�|���P�_�M�B�⥪��A"
				+ "�p�G�P�_�����ݭn�k��~�|�P�_�M�B��k��");
		
		int a = 5;
		System.out.println("a = 5, if (true||++a>0) ");
		if (true || ++a > 0) System.out.println("a = " + a);
		System.out.println("�]����w�Otrue�A��OR�ӻ��w�g�Otrue�A�G����++a>0");
		
		System.out.println("a = 5, if (true|++a>0) ");
		if (true | ++a > 0) System.out.println("a = " + a);
		System.out.println("���䳣�|�P�_�M�B��");
	}
}
