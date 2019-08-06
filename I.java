import java.util.ArrayList;

public class I {
	private int count;
	private ArrayList<String> con;
	private ArrayList<String> vow;

	public I() {
		con = new ArrayList<String>();
		vow = new ArrayList<String>();
		count = 0;
	}

	public void WeAreGroot() {
		con.add(" ");
		con.add("B");
		vow.add("A");
		con.add("C");
		vow.add("E");
		con.add("D");
		vow.add("I");
		con.add("F");
		vow.add("O");
		con.add("G");
		vow.add("U");
		con.add("H");
		vow.add("Y");
		con.add("J");
		con.add("K");
		con.add("L");
		con.add("M");
		con.add("N");
		con.add("P");
		con.add("Q");
		con.add("R");
		con.add("S");
		con.add("T");
		con.add("V");
		con.add("W");
		con.add("X");
		con.add("Z");
	}

	public void IamGroot()
	// count를 하나씩 늘려서 원하는 글자를 픽한다
	{
		count++;
	}

	/*
	 * @자음 대문자
	 */
	public void IAMGROOT() {
		System.out.print(con.get(count));
		count = 0;
	}

	public void iamgroot()
	// 자음 소문자
	{
		System.out.print(con.get(count).toLowerCase());
		count = 0;
	}

	public void IAmGroot()
	// 모음 소문자
	{
		System.out.print(vow.get(count).toLowerCase());
		count = 0;
	}

	public static void main(String[] args) {
		I IAG = new I();
		IAG.WeAreGroot();
		IAG.IamGroot(); // B or E
		IAG.IamGroot(); // C or I
		IAG.IAmGroot(); // I , count = 0
		IAG.IAMGROOT(); // space
		IAG.IamGroot(); // B or E
		IAG.IamGroot(); // C or I
		IAG.IamGroot(); // D or O
		IAG.IamGroot(); // F or U
		IAG.IamGroot(); // G or Y
		IAG.IamGroot(); // H
		IAG.IamGroot(); // J
		IAG.IamGroot(); // K
		IAG.IamGroot(); // L
		IAG.iamgroot(); // L, count = 0;
		IAG.IamGroot(); // B or E
		IAG.IamGroot(); // C or I
		IAG.IamGroot(); // D or O
		IAG.IAmGroot(); // O, count = 0;
		IAG.IamGroot(); // B or E
		IAG.IamGroot(); // C or I
		IAG.IamGroot(); // D or O
		IAG.IamGroot(); // F or U
		IAG.IamGroot(); // G or Y
		IAG.IamGroot(); // H
		IAG.IamGroot(); // J
		IAG.IamGroot(); // K
		IAG.IamGroot(); // L
		IAG.IamGroot(); // M
		IAG.IamGroot(); // N
		IAG.IamGroot(); // P
		IAG.IamGroot(); // Q
		IAG.IamGroot(); // R
		IAG.IamGroot(); // S
		IAG.IamGroot(); // T
		IAG.IamGroot(); // V
		IAG.iamgroot(); // v, count = 0;
		IAG.IamGroot(); // B or E
		IAG.IAmGroot(); // E, count = 0;
		IAG.IAMGROOT(); // space
		IAG.IamGroot(); // B or E
		IAG.IamGroot(); // C or I
		IAG.IamGroot(); // D or O
		IAG.IamGroot(); // F or U
		IAG.IamGroot(); // G or Y
		IAG.IamGroot(); // H
		IAG.IamGroot(); // J
		IAG.IamGroot(); // K
		IAG.IamGroot(); // L
		IAG.IamGroot(); // M
		IAG.IamGroot(); // N
		IAG.IamGroot(); // P
		IAG.IamGroot(); // Q
		IAG.IamGroot(); // R
		IAG.IamGroot(); // S
		IAG.IAMGROOT(); // S, count = 0;
		IAG.IamGroot(); // B or E
		IAG.IamGroot(); // C or I
		IAG.iamgroot(); // c, count = 0;
		IAG.IamGroot(); // B or E
		IAG.IamGroot(); // C or I
		IAG.IAmGroot(); // i, count = 0;
		IAG.IamGroot(); // B or E
		IAG.IAmGroot(); // e, count = 0;
		IAG.IamGroot(); // B or E
		IAG.IamGroot(); // C or I
		IAG.IamGroot(); // D or O
		IAG.IamGroot(); // F or U
		IAG.IamGroot(); // G or Y
		IAG.IamGroot(); // H
		IAG.IamGroot(); // J
		IAG.IamGroot(); // K
		IAG.IamGroot(); // L
		IAG.IamGroot(); // M
		IAG.IamGroot(); // N
		IAG.iamgroot(); // n, count = 0;
		IAG.IamGroot(); // B or E
		IAG.IamGroot(); // C or I
		IAG.iamgroot(); // c, count = 0;
		IAG.IamGroot(); // B or E
		IAG.IAmGroot(); // e, count = 0;
		IAG.IAMGROOT(); // space
		IAG.IamGroot(); // B or E
		IAG.IamGroot(); // C or I
		IAG.IAMGROOT(); // C, count = 0;
		IAG.IamGroot(); // B or E
		IAG.IamGroot(); // C or I
		IAG.IamGroot(); // D or O
		IAG.IAmGroot(); // o, count = 0;
		IAG.IamGroot(); // B or E
		IAG.IamGroot(); // C or I
		IAG.IamGroot(); // D or O
		IAG.IAmGroot(); // o, count = 0;
		IAG.IamGroot(); // B or E
		IAG.IamGroot(); // C or I
		IAG.IamGroot(); // D or O
		IAG.IamGroot(); // F or U
		IAG.IamGroot(); // G or Y
		IAG.IamGroot(); // H
		IAG.IamGroot(); // J
		IAG.IamGroot(); // K
		IAG.iamgroot(); // k, count = 0;
		IAG.IamGroot(); // B or E
		IAG.IamGroot(); // C or I
		IAG.IAmGroot(); // i, count = 0;
		IAG.IamGroot(); // B or E
		IAG.IAmGroot(); // e, count = 0;

	}
}
