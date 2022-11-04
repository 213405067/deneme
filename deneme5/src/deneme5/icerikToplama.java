package deneme5;

public class icerikToplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array= {1,2,3,4,5};

System.out.printf(
		"Effects of passing reference to entire array:½n" + 
"The values of the originals array are:&n");
for(int value: array) {
	System.out.printf("%d",  value);
}
modifyArray(array);
System.out.printf("½n½nThe values of the modified array are");
}

	}

}
