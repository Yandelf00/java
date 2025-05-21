import java.util.Arrays;

public class Trier{
	public static void main(String[] args){
		int[] inputs = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			inputs[i] = Integer.parseInt(args[i]);
		}
		Arrays.sort(inputs);
		System.out.println("Afficher le contenu trié");
		for (int i = 0; i < inputs.length; i++) {
			System.out.println(inputs[i]);
		}
	}
}
