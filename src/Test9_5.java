//ʹ��GregorianCalendar��
import java.util.GregorianCalendar;
public class Test9_5 {

	public static void main(String[] args) {
		 GregorianCalendar gc = new GregorianCalendar();
	        System.out.print(gc.get(GregorianCalendar.YEAR) + "��");
	        System.out.print(gc.get(GregorianCalendar.MONTH) + "��");
	        System.out.println(gc.get(GregorianCalendar.DAY_OF_MONTH) + "��");

	        gc.setTimeInMillis(1234567898765L);
	        System.out.print(gc.get(GregorianCalendar.YEAR) + "��");
	        System.out.print(gc.get(GregorianCalendar.MONTH) + "��");
	        System.out.print(gc.get(GregorianCalendar.DAY_OF_MONTH) + "��");

	}

}
