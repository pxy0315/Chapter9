//������2*2���Է���
import java.util.Scanner;
public class Test9_11 {

	public static void main(String[] args) {
		// ��ȡ�û�����
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c, d, e, f: ");
        double a = input.nextInt(), b = input.nextInt(), c = input.nextInt();
        double d = input.nextInt(), e = input.nextInt(), f = input.nextInt();

        // ���빹�췽��
        Test9_11_LinearEquation le = new Test9_11_LinearEquation(a, b, c, d, e, f);

        // �ж��Ƿ��н��
        boolean bool = le.isSolvable();

        if (bool){
            System.out.println("x is " + le.getX() + " and y is " + le.getY());
        } else
            System.out.println("The equation has no solution");

	}

}
