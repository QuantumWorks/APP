package org.andengine.b;

import org.andengine.b.c.b;

// Referenced classes of package org.andengine.b:
//            a

public class e extends a
{

    private final long e;

    public e(b b, int i)
    {
        super(b);
        e = 0x3b9aca00L / (long)i;
    }

    public void a(long l)
    {
        long l1 = e - l;
        if (l1 <= 0L)
        {
            super.a(l);
            return;
        } else
        {
            Thread.sleep((int)(l1 / 0xf4240L));
            super.a(l1 + l);
            return;
        }
    }
}
