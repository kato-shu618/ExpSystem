import java.util.ArrayList;

public class C1_1{
	public static void main(String[] args){
		ArrayList<Value> arrayList = new ArrayList<Value>();
		arrayList.add(new Bill1000());
		arrayList.add(new Coin100());
		arrayList.add(new Coin100());
		arrayList.add(new Coin50());
		int sum = 0;
		for(int i = 0; i < arrayList.size(); i++){
			Value value = arrayList.get(i);
			sum = sum + value.getValue();
		}
		System.out.println("à•z‚Ì’†g‚Í" + sum + "‚Å‚·B");
	}
}