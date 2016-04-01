
public class LockDListNode extends DListNode{
	private Boolean locked;

	LockDListNode(Object i, DListNode p, DListNode n) {
		super(i,p,n);
		locked = false;
	}
	public void lockNode(){
		locked =true;
	}
	public Boolean isLocked(){
		return locked;
	}
}
