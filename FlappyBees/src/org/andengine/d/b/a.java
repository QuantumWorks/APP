package org.andengine.a.b;


public class a
{

    private static String a = "";

    public static void a()
    {
        a("");
    }

    public static void a(String s)
    {
        if (s.endsWith("/") || s.length() == 0)
        {
            a = s;
            return;
        } else
        {
            throw new IllegalStateException("pAssetBasePath must end with '/' or be lenght zero.");
        }
    }

}
