package lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class CLHLock implements Lock {  
    private final AtomicReference tail;  
    private final ThreadLocal myPred;  
    private final ThreadLocal myNode;  
  
    public CLHLock() {  
        tail = new AtomicReference(new QNode());  
        myNode = new ThreadLocal() {  
            protected QNode initialValue() {  
                return new QNode();  
            }  
        };  
  
        myPred = new ThreadLocal();  
    }  
  
    @Override  
    public void lock() {  
        QNode node = (QNode) myNode.get();  
        node.locked = true;  
        QNode pred = (QNode) tail.getAndSet(node);  
        myPred.set(pred);  
        while (pred.locked) {  
        }  
    }  
  
    @Override  
    public void unlock() {  
        QNode node = (QNode) myNode.get();  
        node.locked = false;  
        myNode.set(myPred.get());  
    }  
  
    private static class QNode {  
        volatile boolean locked;  
    }

	@Override
	public void lockInterruptibly() throws InterruptedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Condition newCondition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean tryLock() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean tryLock(long arg0, TimeUnit arg1) throws InterruptedException {
		// TODO Auto-generated method stub
		return false;
	}  
}  