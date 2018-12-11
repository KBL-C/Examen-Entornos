import java.util.Scanner;

public class TestCalculoAreas {

	public static  void menu() {
		System.out.println("Pulsar 1 para calcular el area del Triangulo");
		System.out.println("pulsar 2 para calcular el área del trapecio");
		System.out.println("pulsar 3 paa calcular el área del rectángulo");
		System.out.println("pulsar 4 para salida");
	}
	
	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente
		//String figura1 = "";
		//String figura2 = "";
		//String figura3 = "";
		//System.out.println("introduce la figura sobre la que quieras saber el área, figura1 para Triangulo, figura2 para Trapecio y figura3 para Rectangulo");
		Scanner sc = new Scanner(System.in);
	//	String menu = sc.nextLine();
		//System.out.println(menu);
		menu();
		int opcion = sc.nextInt();
		while(opcion != 4) {
			//Scanner sc = new Scanner(System.in);
			menu();
			opcion = sc.nextInt();
			if ( opcion == 1) {
				int area1;
				int base = 4;
				int altura = 6;
				area1 = base*altura;
				System.out.println(" el area del tringulo es: " + area1);
			
			}else if (opcion == 2){
				int area2;
				int altura = 5;
				int base1 = 4;
				int base2 = 6;
				area2 = ((base1+base2)/2)*altura;
				System.out.println("el área del trapecio es: " + area2);
			}else if (opcion == 3){
				int area3;
				int base = 4;
				int altura = 7;
				area3 = base*altura;
				System.out.println("el área del rectángulo es: " + area3);
			}
		}System.out.println(" error, salida");
			
		
		
		
		
	}

}
