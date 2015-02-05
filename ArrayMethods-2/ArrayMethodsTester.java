public class ArrayMethodsTester
{
    public static void testIntArrayMethods()
    {
        int[] a = {40,21,85,63,18,21};
        System.out.println("Original: " + ArrayMethods.toString(a));
        System.out.println("Reversed: " + ArrayMethods.toString(ArrayMethods.reverse(a)));
        System.out.println("Index of 40 = " + ArrayMethods.indexOf(a,40));
        System.out.println("Index of 21 = " + ArrayMethods.indexOf(a,21));
        System.out.println("Index of 18 = " + ArrayMethods.indexOf(a,18));
        System.out.println("Index of 99 = " + ArrayMethods.indexOf(a,99));
        System.out.println("Index of largest element = " + ArrayMethods.findLargestIndex(a));
        System.out.println("Index of smallest element = " + ArrayMethods.findSmallestIndex(a));
        int[] b = {10, 20, 11, 30, 90};
        System.out.println("Original: " + ArrayMethods.toString(b));
        System.out.println("Index of largest element = " + ArrayMethods.findLargestIndex(b));
        System.out.println("Index of smallest element = " + ArrayMethods.findSmallestIndex(b));
        int[] c = {90, 20, 11, 30, 10};
        System.out.println("Original: " + ArrayMethods.toString(c));
        System.out.println("Index of largest element = " + ArrayMethods.findLargestIndex(c));
        System.out.println("Index of smallest element = " + ArrayMethods.findSmallestIndex(c));
        
    }

    public static void testStringArrayMethods()
    {
        String[] a = {"William","Patrick","Peter","Jon","Tom","Peter","Colin"};
        System.out.println("Original: " + ArrayMethods.toString(a));
        System.out.println("Reversed: " + ArrayMethods.toString(ArrayMethods.reverse(a)));
        System.out.println("Index of \"William\" = " + ArrayMethods.indexOf(a,"William"));
        System.out.println("Index of \"Peter\" = " + ArrayMethods.indexOf(a,"Peter"));
        System.out.println("Index of \"Colin\" = " + ArrayMethods.indexOf(a,"Colin"));
        System.out.println("Index of \"Sylvester\" = " + ArrayMethods.indexOf(a,"Sylvester"));
        System.out.println("Index of largest element = " + ArrayMethods.findLargestIndex(a));
        System.out.println("Index of smallest element = " + ArrayMethods.findSmallestIndex(a));
        String[] b = {"Christopher","David","Matt","Peter"};
        System.out.println("Original: " + ArrayMethods.toString(b));
        System.out.println("Index of largest element = " + ArrayMethods.findLargestIndex(b));
        System.out.println("Index of smallest element = " + ArrayMethods.findSmallestIndex(b));
        String[] c = {"Peter","Matt","David","Christopher"};
        System.out.println("Original: " + ArrayMethods.toString(c));
        System.out.println("Index of largest element = " + ArrayMethods.findLargestIndex(c));
        System.out.println("Index of smallest element = " + ArrayMethods.findSmallestIndex(c));
        
    }

}
