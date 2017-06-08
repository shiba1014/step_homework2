
public class Matrix {
	public static void main(String args[]){
		if (args.length != 1) {
			System.out.println("usage: java Matrix N");
			return;
		}
		
		int n = Integer.parseInt(args[0]);
		double[][] a = new double[n][n];
		double[][] b = new double[n][n];
		double[][] c = new double[n][n];
		
		int i,j;
		for(i = 0; i < n; i++){
			for(j = 0; j < n; j++){
				a[i][j] = i * n + j;
				b[i][j] = j * n + i;
				c[i][j] = 0;
			}
		}
		
		long begin = System.currentTimeMillis();
		for(i = 0; i < n; i++){
			for(j = 0; j < n; j++){
				for (int k = 0; k < n; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		long end = System.currentTimeMillis();
		System.out.printf("time: %.6f sec\n", (end - begin) / 1000.0);
		
		double sum = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				sum += c[i][j];
			}
		}
		
		System.out.printf("sum: %.6f\n", sum);
	}
}
