package cn.nuaa.edu.juc;

import sun.tools.tree.SynchronizedStatement;

import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author planb
 * @date 2020/8/14 11:59
 * 备注：实现自己的AQS
 */
public class Sync extends AbstractQueuedSynchronizer {

    @Override
    protected boolean tryAcquire(int arg) {

        if(compareAndSetState(0, 1)){
            //互斥锁
            setExclusiveOwnerThread(Thread.currentThread());
            return true;
        }
        return false;
    }

    @Override
    protected boolean tryRelease(int arg) {
       assert arg == 1;
       if (!isHeldExclusively()) {
           throw new IllegalMonitorStateException();
       }
       setExclusiveOwnerThread(null);
       setState(0);
       return true;
    }

    @Override
    protected boolean isHeldExclusively() {
        return getExclusiveOwnerThread() == Thread.currentThread();
    }
}
