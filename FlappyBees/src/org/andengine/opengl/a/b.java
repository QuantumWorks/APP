package org.andengine.opengl.a;

import org.andengine.d.d.a;

public class b
{

    private static final int a;
    private static String b = "";

    public static void a()
    {
        a("");
    }

    public static void a(String s)
    {
        if (s.endsWith("/") || s.length() == 0)
        {
            b = s;
            return;
        } else
        {
            throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
        }
    }

    static 
    {
        a = a.C;
    }
}
