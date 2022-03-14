package gmg;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class TwodimentionalArray {

	public static void main(String[] args) {
		int a[][]=new int[3][2];
		a[0][0]=100;
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		System.out.println("Number of rows:"+a.length);
		System.out.println("Number of colums:"+a[0].length);
		System.out.println(a[2][1]);
		
		/*for (int r=0;r<a.length;r++)
		{
			for (int c=0;c<a[r].length;c++)
			{
				System.out.print(a[r][c]+"   ");
			}
			System.out.println();
		}*/
		for(int x[]:a)
		{
			for(int v:x)
			{
				System.out.print(v+"   ");
			}
		}

	}

}
