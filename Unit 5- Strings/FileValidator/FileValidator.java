
/**
 * Determines if a file is valid
 * 
 * @author (Kush Kalra) 
 * @version (November 11, 2014)
 */
public class FileValidator
{
    public static String validFileName (String str)
    {
        int x= str.indexOf('.');
        int y=str.indexOf(':');
        int z=str.indexOf('?');
        int g=str.indexOf('*');
        int a=str.indexOf('\\');
        String ext = str.substring(str.indexOf('.')+1);
        int k=ext.indexOf('.');

        if (y>0 || z>0 || g>0 || a>0)
        {
            return null;
        }
        if (str.length()>8 && x<0)
        {
            return null;
        }
        if (x<0)
        {
            return str.toUpperCase() + ".TXT";
        }
        if (str.indexOf(".")==str.length()-1)
        {
            return str.substring(0,str.length()-1);
        }
        if (k>0)
        {
            return null;
        }
        if (ext.length()>3)
        {
            return null;
        }
        return str.toUpperCase();
    }
}
