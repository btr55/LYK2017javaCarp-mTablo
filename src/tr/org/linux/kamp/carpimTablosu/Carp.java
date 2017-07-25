package tr.org.linux.kamp.carpimTablosu;

public class Carp {

	public static void main(String[] args) {
		arraytoPrint(initialize(5));
	}
public static int[][]initialize(int n){		//int tipinde bir iki boyutlu array return etmeli
	
	int [][]matrices=new int[n][n];		//arrrayin içini doldurmak için metod. çift boyutlu array yap.
	
	for (int j=0;j<matrices.length;j++) {		//içiçe iki for ile array içi çarpımla dolduruldu.
		for(int k=0;k<matrices.length;k++) {
			matrices[j][k]=(j+1)*(k+1);
		}
	}
	
	return matrices;
		}
public static void arraytoPrint(int[][] matrices) {		//ekrana yazdırma için metod.
	for (int j=0;j<matrices.length;j++) {
		for(int k=0;k<matrices.length;k++) {
			System.out.println(matrices[j][k]+"\t");
		}
		System.out.println();
	}
}
}