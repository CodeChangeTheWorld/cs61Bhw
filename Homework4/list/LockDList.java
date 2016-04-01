
public class LockDList extends DList{
	public void lockNode(DListNode node) {
		LockDListNode lockNode = (LockDListNode) node;
		lockNode.lockNode();
	}
	protected LockDListNode newNode(Object item, DListNode prev, DListNode next) {
	    return new LockDListNode(item, prev, next);
	  }
	 public void remove(DListNode node){
		 LockDListNode lockNode = (LockDListNode) node;
		 if(!lockNode.isLocked()){
			 super.remove(node);
		 }
	 }
	 public static void main(String[] args) {
		    LockDList newList = new LockDList();
		    newList.insertFront(new Integer(3));
		    newList.insertFront(new Integer(7));
		    newList.insertFront(new Integer(6));
		    newList.insertFront(new Integer(5));
		    newList.insertBack(new Integer(9));
		    newList.insertBack(new Integer(2)); 
		    newList.insertBack(new Integer(4));
		    System.out.print(newList.toString());
		    DListNode node5 = newList.findNode(new Integer(5));
		    DListNode node3 = newList.findNode(new Integer(3));
		    newList.lockNode(node5);
		    newList.remove(node3);
		    newList.remove(node5);
		    System.out.print(newList.toString());
		  }
}
