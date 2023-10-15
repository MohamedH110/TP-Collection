package esssai;

public class myhello {
	
	String machaine="sangoku";
	
	void hello() {
		System.out.println(this.machaine);
	};
	
	public static void main(String[] args) {
    myhello s=new myhello();
    s.hello();
    s.machaine="salut!";
    s.hello();
	}
	


}
