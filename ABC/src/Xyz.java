import java.math.BigDecimal;

public class Xyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("5456466==+" + (10 / 5));

		BigDecimal b1 = new BigDecimal(10);
		BigDecimal b2 = new BigDecimal(20);
		System.out.println("big====>" + b1.compareTo(BigDecimal.ZERO));
		System.out.println("small----->"+b1.compareTo(b2));
		System.out.println(b1.compareTo(b1));

	}

}
