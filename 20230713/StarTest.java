
public class StarTest {
	public static void main(String[] args) {
		
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
//		System.out.println("*****");
		
//		for (int i=0; i<5; i++) {
//			System.out.println("*****");
//		}
//		for (int i=0; i<5; i++) {
//			System.out.print("*");
//		}
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++) {
				System.out.print("*");
			}
			for (int j=0; j<3; j++) {
				System.out.print("_");
			}
			for (int j=0; j<5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==============================");
		
//		*
//		**
//		***
//		****
//		*****
		for (int i=0; i<5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==============================");
		
//		*****
//		****
//		***
//		**
//		*
		for (int i=0; i<5; i++) { 
			for (int j=0; j<=4-i; j++) {  // for (int j=(5-i); j>0; j--) { 
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==============================");
		
//		    *
//		   **
//		  ***
//		 ****
//		*****
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= 3 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		*****
//		 ****
//		  ***
//		   **
//		    *
		System.out.println("==============================");
		for (int i=0; i<5; i++) {
			for (int j=0; j<=i-1; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<=4-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==============================");
		
//		    *
//		   ***
//		  *****
//		 *******
//		*********
		for (int i=0; i<5; i++) {
			for (int j=0; j<=3-i; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("==============================");
		
//		*        *
//		**      **
//		***    ***
//		****  ****
//		**********
		for (int i=0; i<5; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print("*");
			}
			for(int j=0; j<7-i*2; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++) {
				if (j == 4) {
					break;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
