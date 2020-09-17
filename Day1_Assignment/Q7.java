class Q7 
{
	public static void main(String args...[])
	{
	int num1 = (int)args[0];
	int num2 = (int)args[1];
	int num3 = (int)args[2];
	int num4 = (int)args[3];
	int num5 = (int)args[4];

	int sum = (num1+num2+num3+num4+num5);
	System.out.println("Sum of 5 number: "+ sum);
	
	double avg = (sum/5);
	System.out.println("Avrage of 5 number : " + avg);
	}
}