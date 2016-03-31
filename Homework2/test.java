import java.util.Arrays;
class test{
	public static void main(String[] args) {
		try{
		/*int[] a ={1,2,3,4,5};
		int[] b = a;
		b[2]=3;
		System.out.println(Arrays.toString(a));*/
		Date date1=new Date("1/1/2003");
		Date date2=new Date("1/1/2002");
		if (date1 != null) System.out.println(date1.toString());
		if (date2 != null) {System.out.println(date2.toString());
			System.out.println("Is Before :"+date2.isBefore(new Date(12,1,2001)));
			System.out.println("Is After: "+date2.isAfter(new Date(12,1,2001)));
			System.out.println("Day of Year:"+ date2.dayInYear());
			System.out.println("difference:"+ date1.difference(date2));

	}}
		catch(Exception e){

		}
	}
}