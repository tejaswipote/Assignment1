import java.util;

public class RDuplicate {

	
	public static void main(String[] args) {
		//Input
		Scanner s=new Scanner(System.in);
		System.out.println("*****Enter Size*****");
		int k=s.nextInt();
		int[] a=new int[k];
		System.out.println("*****Enter array element *****");
		for(int i=0;i<k; i++)
			a[i]=s.nextInt();

	
		int temp = 0;
		int c[] = new int[k];//for result

		boolean b[] = new boolean[k + 1];//Storing Status

		int i = 0;
		int j = 0;
		/*for (i = 0; i < k; i++) {
			for (j = 0; j < k; j++) {

				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

			}

		}
*/ Merge.mergeSort(a,0,k-1);
		for (i = 0; i < k; i++) {
			// System.out.println(a[i]);
			if (i < k - 1) {
				if (a[i] == a[i + 1]) {
					b[i] = true;

				} else
					b[i] = false;
			} else
				b[i] = false;

		}
		int size = 0;
		for (i = 0; i < k; i++) {
			if (b[i] == false) {
				c[size] = a[i];
				size++;
			}
		}
		System.out.println("*****After removing duplications*****");
		for (i = 0; i < size; i++)
			System.out.println(c[i]);
	}

}
