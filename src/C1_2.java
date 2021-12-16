public class C1_2{
	public static void main(String[] args){
		Wallet wallet = new Wallet();
		wallet.add(new Bill1000());
		wallet.add(new Coin100());
		wallet.add(new Coin100());
		wallet.add(new Coin50());
		System.out.println("çáåv" + wallet.getSum() + "Ç≈Ç∑ÅB");
	}
}