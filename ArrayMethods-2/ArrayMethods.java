/**
 * Various helpful methods for working with arrays
 * 
 * @author (Your Name)
 * @version (12/02/2014)
 */
public class ArrayMethods
{
    /**
     * Returns a copy of this array with all elements in reverse order. This method must NOT modify
     * the original array.
     * @param arr the array to process
     * @return a copy of this array with all elements in reverse order.
     */
    public static int[] reverse(int[] arr)
    {
        int[] arr1=new int[arr.length];
        int k=1;
        for (int i=0; i<arr.length; i++)
        {
            arr1[i] = arr[arr.length-k];
            k++;

        }
        return arr1;

    }

    /**
     * Returns the index of the first occurrence of the specified element.
     * @param arr the array to search (must contain at least one element)
     * @param key the element being searched for
     * @return the index of the first occurrence of the specified element 
     * (or -1 if not found)
     */
    public static int indexOf(int[] arr, int key)
    {
        for (int i=0; i<=arr.length; i++)
        {
            if(arr.length>=1)
            {
                arr[i]=key;
                return i;
            }
            if (arr[i]!=key)
            {
                return -1;  
            }
        }
        return -1;
    }

        /**
         * Returns the index of the first occurrence of the element with the largest value.
         * @param arr the array to search (must contain at least one element)
         * @return the index of the first occurrence of the element with the largest value 
         * (or -1 if array is empty)
         */
        public static int findLargestIndex(int[] arr)
        {
            return -1;
        }

        /**
         * Returns the index of the first occurrence of the element with the smallest value.
         * @param arr the array to search (must contain at least one element)
         * @return the index of the first occurrence of the element with the smallest value 
         * (or -1 if array is empty)
         */
        public static int findSmallestIndex(int[] arr)
        {
            return -1;    // replace with correct implementation
        }

        /**
         * Returns a bracketed, comma-delimited list of all the elements of the array as a String.
         * @param arr the array to process
         * @return a bracketed, comma-delimited list of all the elements of the array as a String.
         */
        public static String toString(int[] arr)
        {
            return null;    // replace with correct implementation
        }

        /**
         * Returns a copy of this array with all elements in reverse order. This method must NOT modify
         * the original array.
         * @param arr the array to process
         * @return a copy of this array with all elements in reverse order.
         */
        public static String[] reverse(String[] arr)
        {
            return null;    // replace with correct implementation
        }

        /**
         * Returns the index of the first occurrence of the specified element.
         * @param arr the array to search (must contain at least one element)
         * @param key the element being searched for
         * @return the index of the first occurrence of the specified element 
         * (or -1 if not found)
         */
        public static int indexOf(String[] arr, String key)
        {
            return -1;    // replace with correct implementation
        }

        /**
         * Returns the index of the first occurrence of the element with the largest value.
         * @param arr the array to search (must contain at least one element)
         * @return the index of the first occurrence of the element with the largest value 
         * (or -1 if array is empty)
         */
        public static int findLargestIndex(String[] arr)
        {
            return -1;    // replace with correct implementation
        }

        /**
         * Returns the index of the first occurrence of the element with the smallest value.
         * @param arr the array to search (must contain at least one element)
         * @return the index of the first occurrence of the element with the smallest value 
         * (or -1 if array is empty)
         */
        public static int findSmallestIndex(String[] arr)
        {
            return -1;    // replace with correct implementation
        }

        /**
         * Returns a bracketed, comma-delimited list of all the elements of the array as a String.
         * @param arr the array to process
         * @return a bracketed, comma-delimited list of all the elements of the array as a String.
         */
        public static String toString(String[] arr)
        {
            return null;    // replace with correct implementation
        }

    }
