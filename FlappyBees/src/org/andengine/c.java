package org.andengine.b;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class c extends ReentrantLock
{

    final Condition a = newCondition();
    final AtomicBoolean b = new AtomicBoolean(false);

    public c(boolean flag)
    {
        super(flag);
    }

    void a()
    {
        b.set(true);
        a.signalAll();
    }

    void b()
    {
        b.set(false);
        a.signalAll();
    }

    void c()
    {
        do
        {
            if (b.get())
            {
                return;
            }
            a.await();
        } while (true);
    }

    void d()
    {
        do
        {
            if (!b.get())
            {
                return;
            }
            a.await();
        } while (true);
    }
}
