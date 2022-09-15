import java.util.ArrayList;

public class Lab1 {


	private static void printArrayTable(double val[][], int length) {
		ArrayList<Double> BigNumber = new ArrayList<Double>();
		String format = "%" + Integer.toString(length+4) + ".5f ";
		int iter = 0;
		for(int i = 0; i < 18; i++) {
			for(int j = 0; j < 12 ;j++) {
				String str_number = String.format("%.5f",val[j][i]);
				if(str_number.length() > length + 5) {
					BigNumber.add(val[j][i]);
				}
				else {
					System.out.printf(format, val[j][i]);
				}
				iter++;
				if(iter > 8) {
					System.out.println();
					iter = 0;
				}
			}
		}
		//Вывод больших чисел
		if(BigNumber.size() != 0) {
			System.out.println("BigNumber:");
			for(int i = 0; i < BigNumber.size(); i++) {
				System.out.printf("%.5f\n", BigNumber.get(i));
			}
		}
	}
	
	public static void main(String[] args) {
		short n[] = new short[(25 - 3)/2 + 1];
		double x[] = new double[18];
		double s[][] = new double[12][18];

		//Заполнение массива n
		for(int i = 0; i < 12; i++)  {
			n[i] = (short)(i*2+3);
		}

		//Заполнение массива x случайными числами от -12.0 до 10.0 включительно
		for(int i = 0; i < 18; i++) {
			x[i] = Math.random() * 22.0 - 12;
		}
		
		//Вычисление элементов массива s согласно условию
		for(int i = 0; i < 12; i++) {
			for(int j = 0; j < 18; j++) {
				if(n[i] == 5) {
					s[i][j] = Math.pow(Math.sin(Math.sin(x[j])), (Math.pow(Math.E, x[j]) / (1 - Math.pow((0.5 * x[j]),2))) / (Math.sin(Math.pow(Math.E,x[j])) - 2/3));
				}
				else if(n[i] >=7 && n[i] <=17) {
					s[i][j] = Math.log(Math.pow( Math.tan(Math.sin(Math.cbrt(x[j]))),2.));
				}
				else {
					s[i][j] = Math.asin(0.75 * Math.cos(Math.sin(Math.pow(x[j], x[j] / 2.))));
				}	
			}
		}
		//вывод Элементов массива s
		printArrayTable(s, 8);
	} 
}