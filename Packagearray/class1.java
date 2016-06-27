package Packagearray;

public class class1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declare the array
		int[]a=new int[5];
		//inputs
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//model2
		int[]b={10,20,30,40,50};
		//display model1 using forloop
		System.out.println("using forloop a values");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]);
		}
		//display model2 using forloop
		System.out.println("using forloop b values");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		//display the model1 for each loop
		System.out.println("using for each loop a values");
		for(int elements:a)
		{
			System.out.println(elements);
		}
		//display the model2 for each loop
		System.out.println("using for each loop b values");
		for(int elements:b)
		{
			System.out.println(elements);
		}
		

	}

}


	}

}
