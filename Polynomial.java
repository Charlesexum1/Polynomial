import java.util.Scanner;
public class Polynomial {
	
	private double degree;
	private double[] coefficient;
	
	private Polynomial(double max) {
		degree = max;
		}
		
	private void setConstant(int i) {
		double value;
		Scanner keys = new Scanner(System.in);
		coefficient = new double[i];
		for (int q = 0; q < coefficient.length; q++) {
			System.out.println("Input next double.");
			value = keys.nextDouble();
			coefficient[q] = value;
			}
		}
		
	private double evaluate(int x) {
		double xValue = x;
		double total = 0;
		double expo = 1;
		for (int q = 0; q < coefficient.length; q++) {
			total += (coefficient[q] * (Math.pow(xValue, expo)));
			expo++;
			}
		total += degree;
		return total;	
		}
	
	public static void main(String[] args) {
		Polynomial demo = new Polynomial(3);
		demo.setConstant(3);
		System.out.println(demo.evaluate(7));
		}
	
	}
