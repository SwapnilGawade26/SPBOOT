package lamda;

interface AddInterface {
	public int add(int a, int b);
}

public class AddLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddInterface ai=(a,b)-> a+b;
		
		System.out.println(ai.add(1, 2));
	}

}
