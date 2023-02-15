package postorder;
class node{
	int key;
	node left;
	node right;
	node(int key){
		this.key=key;
		left= null;
		right= null;
		
	}
}
public class susobhan {
	public static void main(String args[]) {
		node root = new node(10);
		root.left= new node(20);
		root.right= new node(30);
		root.right.left=new node(40);
		root.right.right = new node(50);
		postorder(root);    //FIRST->LEFT SECOND->RIGHT THIRD->ROOT
	}
	
	static void postorder(node root) {
		//codition
		if(root!=null) {
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.key+" ");
		}
	}

}
