package array;

public class Array2dLowerDaignolMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int [5][5];
		for(int i=0;i<a.length;i++){
		for(int j=0;j<a[i].length;j++){
			if(i==4||j==0||i==j||i==3&&j!=4||i==2&&j==1){
				a[i][j]=1;
			}
		System.out.print(a[i][j]+"  ");
		}
		System.out.println();
		}
	}

}
