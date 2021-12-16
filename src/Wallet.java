import java.util.ArrayList;

public class Wallet{
	private ArrayList<Value> list = new ArrayList<Value>();
	public Wallet(){
	}
	public void add(Value value){
		this.list.add(value);
	}
	public Value remove(int number){
		return this.list.remove(number);
	}
	public int size(){
		return this.list.size();
	}
	public int getSum(){
		int size = this.list.size();
		int sum = 0;
		for(int i = 0; i < size; i++){
			Value value = this.list.get(i);
			sum = sum + value.getValue();
		}
		return sum;
	}
	public void print(){
		int size = this.list.size();
		for(int i = 0; i < size; i++){
			Value value = this.list.get(i);
			System.out.println(value.getValue());
		}
	}
}