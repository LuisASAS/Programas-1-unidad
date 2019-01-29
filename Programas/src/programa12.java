import java.util.Scanner;

public class programa12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer=new Scanner (System.in);
		
		double cal, prom;
		int nCal, i;
		
		System.out.println("Ingrese el numero de calificaciones");
		nCal=leer.nextInt();
		i=0;

		while(i<nCal) {
			System.out.println("Ingresa la calificacion" +(i+1));
			cal=leer.nextDouble();
			prom+=cal;
			i++;
		}
		prom/=i;
		if(prom>=0&& prom<=49) {
			System.out.println("Suspendido (0-49)");
		}
		if (prom>=50 && prom<=69) {
			System.out.println("aprobado (50-69)");
		}
		if (prom>=70 && prom<=89) {
			System.out.println("Notable (70-89)");
		}
		if (prom>=90 && prom<=99) {
			System.out.println("Sobresaliente (90-99)");
		}
		if (prom=100)
			}
		}
		}

}
