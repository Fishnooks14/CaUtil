package CaUtil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;
import java.util.Random;

public final class CaArrays {

    /**
     * replaces all elements in array with null
     * @param array array to be cleared
     */
    public static void clear(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    /**
     * replaces all elements in array with 0
     * @param array array to be cleared
     */
    public static void clear(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    /**
     * replaces all elements in array with 0
     * @param array array to be cleared
     */
    public static void clear(byte[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    /**
     * replaces all elements in array with 0
     * @param array array to be cleared
     */
    public static void clear(short[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    /**
     * replaces all elements in array with 0
     * @param array array to be cleared
     */
    public static void clear(long[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    /**
     * replaces all elements in array with 0
     * @param array array to be cleared
     */
    public static void clear(float[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    /**
     * replaces all elements in array with 0
     * @param array array to be cleared
     */
    public static void clear(double[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    /**
     * replaces all elements in array with false
     * @param array array to be cleared
     */
    public static void clear(boolean[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = false;
        }
    }

    /**
     * replaces all elements in array with 0 (NULL)
     * @param array array to be cleared
     */
    public static void clear(char[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }
    
    /**
     * Check if array contains given value
     * @param array array to check for value in
     * @param value value to find in array
     * @return if array contains given value
     */
    public static boolean contains(Object[] array, Object value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return true;
        }
        return false;
    }

    /**
     * Check if array contains given value
     * @param array array to check for value in
     * @param value value to find in array
     * @return if array contains given value
     */
    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return true;
        }
        return false;
    }

    /**
     * Check if array contains given value
     * @param array array to check for value in
     * @param value value to find in array
     * @return if array contains given value
     */
    public static boolean contains(byte[] array, byte value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return true;
        }
        return false;
    }

    /**
     * Check if array contains given value
     * @param array array to check for value in
     * @param value value to find in array
     * @return if array contains given value
     */

    public static boolean contains(short[] array, short value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return true;
        }
        return false;
    }

    /**
     * Check if array contains given value
     * @param array array to check for value in
     * @param value value to find in array
     * @return if array contains given value
     */
    public static boolean contains(long[] array, long value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return true;
        }
        return false;
    }

    /**
     * Check if array contains given value
     * @param array array to check for value in
     * @param value value to find in array
     * @return if array contains given value
     */
    public static boolean contains(float[] array, float value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return true;
        }
        return false;
    }

    /**
     * Check if array contains given value
     * @param array array to check for value in
     * @param value value to find in array
     * @return if array contains given value
     */
    public static boolean contains(double[] array, double value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return true;
        }
        return false;
    }

    /**
     * Check if array contains given value
     * @param array array to check for value in
     * @param value value to find in array
     * @return if array contains given value
     */
    public static boolean contains(boolean[] array, boolean value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return true;
        }
        return false;
    }

    /**
     * Check if array contains given value
     * @param array array to check for value in
     * @param value value to find in array
     * @return if array contains given value
     */
    public static boolean contains(char[] array, char value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return true;
        }
        return false;
    }

    /**
     * Returns a map in which each key is a unique value from the given array and
     * each value is the number of times that element appears in the array.
     * @param array array whose elements will be counted
     * @return a map pairing each unique element with the number of times it appears in the array.
     */
    public static Map<Object, Integer> count(Object[] array) {
        Map<Object, Integer> out = new HashMap<>();
        for(Object o: array) {
            out.put(o, out.getOrDefault(o, 0));
        }
        return out;
    }

    /**
     * Returns a map in which each key is a unique value from the given array and
     * each value is the number of times that element appears in the array.
     * @param array array whose elements will be counted
     * @return a map pairing each unique element with the number of times it appears in the array.
     */
    public static Map<Integer, Integer> count(int[] array) {
        Map<Integer, Integer> out = new HashMap<>();
        for(int i: array) {
            out.put(i, out.getOrDefault(i, 0) + 1);
        }
        return out;
    }

    /**
     * Returns a map in which each key is a unique value from the given array and
     * each value is the number of times that element appears in the array.
     * @param array array whose elements will be counted
     * @return a map pairing each unique element with the number of times it appears in the array.
     */
    public static Map<Byte, Integer> count(byte[] array) {
        Map<Byte, Integer> out = new HashMap<>();
        for(byte b: array) {
            out.put(b, out.getOrDefault(b, 0) + 1);
        }
        return out;
    }

    /**
     * Returns a map in which each key is a unique value from the given array and
     * each value is the number of times that element appears in the array.
     * @param array array whose elements will be counted
     * @return a map pairing each unique element with the number of times it appears in the array.
     */
    public static Map<Short, Integer> count(short[] array) {
        Map<Short, Integer> out = new HashMap<>();
        for(short s: array) {
            out.put(s, out.getOrDefault(s, 0) + 1);
        }
        return out;
    }

    /**
     * Returns a map in which each key is a unique value from the given array and
     * each value is the number of times that element appears in the array.
     * @param array array whose elements will be counted
     * @return a map pairing each unique element with the number of times it appears in the array.
     */
    public static Map<Long, Integer> count(long[] array) {
        Map<Long, Integer> out = new HashMap<>();
        for(long l: array) {
            out.put(l, out.getOrDefault(l, 0) + 1);
        }
        return out;
    }

    /**
     * Returns a map in which each key is a unique value from the given array and
     * each value is the number of times that element appears in the array.
     * @param array array whose elements will be counted
     * @return a map pairing each unique element with the number of times it appears in the array.
     */
    public static Map<Float, Integer> count(float[] array) {
        Map<Float, Integer> out = new HashMap<>();
        for(float f: array) {
            out.put(f, out.getOrDefault(f, 0) + 1);
        }
        return out;
    }

    /**
     * Returns a map in which each key is a unique value from the given array and
     * each value is the number of times that element appears in the array.
     * @param array array whose elements will be counted
     * @return a map pairing each unique element with the number of times it appears in the array.
     */
    public static Map<Double, Integer> count(double[] array) {
        Map<Double, Integer> out = new HashMap<>();
        for(double d: array) {
            out.put(d, out.getOrDefault(d, 0) + 1);
        }
        return out;
    }

    /**
     * Returns a map in which each key is a unique value from the given array and
     * each value is the number of times that element appears in the array.
     * @param array array whose elements will be counted
     * @return a map pairing each unique element with the number of times it appears in the array.
     */
    public static Map<Boolean, Integer> count(boolean[] array) {
        Map<Boolean, Integer> out = new HashMap<Boolean, Integer>();
        for(boolean b: array) {
            out.put(b, out.getOrDefault(b, 0) + 1);
        }
        return out;
    }

    /**
     * Returns a map in which each key is a unique value from the given array and
     * each value is the number of times that element appears in the array.
     * @param array array whose elements will be counted
     * @return a map pairing each unique element with the number of times it appears in the array.
     */
    public static Map<Character, Integer> count(char[] array) {
        Map<Character, Integer> out = new HashMap<Character, Integer>();
        for(char c: array) {
            out.put(c, out.getOrDefault(c, 0) + 1);
        }
        return out;
    }

    /**
     * Fills all elements in array with given value
     * @param array array to fill with value
     * @param value value to fill array with
     */
    public static void deepFill(Object[] array, Object value) {
        if(array == null)
            return;

        HashSet seen = new HashSet();
        deepFill(seen, array, value);
    }
    
    private static void deepFill(HashSet seen, Object[] array, Object value) {
        if (array == null)
            return;

        for (int i = 0; i < array.length; ++i) {
            Object elt = array[i];

            if (elt instanceof boolean[])
                Arrays.fill((boolean[]) elt, (boolean) value);
            else if (elt instanceof byte[])
                Arrays.fill((byte[]) elt, (byte) value);
            else if (elt instanceof char[])
                Arrays.fill((char[]) elt, (char) value);
            else if (elt instanceof short[])
                Arrays.fill((short[]) elt, (short) value);
            else if (elt instanceof int[])
                Arrays.fill((int[]) elt, (int) value);
            else if (elt instanceof long[])
                Arrays.fill((long[]) elt, (long) value);
            else if (elt instanceof float[])
                Arrays.fill((float[]) elt, (float) value);
            else if (elt instanceof double[])
                Arrays.fill((double[]) elt, (double) value);
            else if (elt instanceof Object[] os && seen.add(elt))
                deepFill(seen, os, value);
            else
                array[i] = value;
        }
    }

    /**
     * Returns the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element
     */
    public static int indexOf(Object[] array, Object element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element
     */
    public static int indexOf(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element
     */
    public static int indexOf(byte[] array, byte element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element
     */
    public static int indexOf(short[] array, short element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element
     */
    public static int indexOf(long[] array, long element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element
     */
    public static int indexOf(float[] array, float element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element
     */
    public static int indexOf(double[] array, double element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element
     */
    public static int indexOf(boolean[] array, boolean element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the first occurrence of the specified element in this array, or -1 if this list does not contain the element
     */
    public static int indexOf(char[] array, char element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     */
    public static int lastIndexOf(Object[] array, Object element) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     */
    public static int lastIndexOf(int[] array, int element) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     */
    public static int lastIndexOf(byte[] array, byte element) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     */
    public static int lastIndexOf(short[] array, short element) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     */
    public static int lastIndexOf(long[] array, long element) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     */
    public static int lastIndexOf(float[] array, float element) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     */
    public static int lastIndexOf(double[] array, double element) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     */
    public static int lastIndexOf(boolean[] array, boolean element) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     * @param array array in which to search
     * @param element element to search for
     * @return the index of the last occurrence of the specified element in this array, or -1 if this list does not contain the element.
     */
    public static int lastIndexOf(char[] array, char element) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == element)
                return i;
        }
        return -1;
    }

    /**
     * Returns a new array consisting of all elements in given arrays, in the order provided.
     * @param arrays arrays to merge
     * @return a new array consisting of all elements in given arrays, in the order provided.
     */
    public static int[] merge(int[]... arrays) {
        int totalLength = 0;
        for(int[] arr: arrays)
            totalLength += arr.length;
        int[] out = new int[totalLength];
        int index = 0;
        for(int[] arr: arrays) {
            for(int val: arr) {
                out[index] = val;
                index++;
            }
        }
        return out;
    }

    /**
     * Returns a new array consisting of all elements in given arrays, in the order provided.
     * @param arrays arrays to merge
     * @return a new array consisting of all elements in given arrays, in the order provided.
     */
    public static byte[] merge(byte[]... arrays) {
        int totalLength = 0;
        for(byte[] arr: arrays)
            totalLength += arr.length;
        byte[] out = new byte[totalLength];
        int index = 0;
        for(byte[] arr: arrays) {
            for(byte val: arr) {
                out[index] = val;
                index++;
            }
        }
        return out;
    }

    /**
     * Returns a new array consisting of all elements in given arrays, in the order provided.
     * @param arrays arrays to merge
     * @return a new array consisting of all elements in given arrays, in the order provided.
     */
    public static short[] merge(short[]... arrays) {
        int totalLength = 0;
        for(short[] arr: arrays)
            totalLength += arr.length;
        short[] out = new short[totalLength];
        int index = 0;
        for(short[] arr: arrays) {
            for(short val: arr) {
                out[index] = val;
                index++;
            }
        }
        return out;
    }

    /**
     * Returns a new array consisting of all elements in given arrays, in the order provided.
     * @param arrays arrays to merge
     * @return a new array consisting of all elements in given arrays, in the order provided.
     */
    public static long[] merge(long[]... arrays) {
        int totalLength = 0;
        for(long[] arr: arrays)
            totalLength += arr.length;
        long[] out = new long[totalLength];
        int index = 0;
        for(long[] arr: arrays) {
            for(long val: arr) {
                out[index] = val;
                index++;
            }
        }
        return out;
    }

    /**
     * Returns a new array consisting of all elements in given arrays, in the order provided.
     * @param arrays arrays to merge
     * @return a new array consisting of all elements in given arrays, in the order provided.
     */
    public static float[] merge(float[]... arrays) {
        int totalLength = 0;
        for(float[] arr: arrays)
            totalLength += arr.length;
        float[] out = new float[totalLength];
        int index = 0;
        for(float[] arr: arrays) {
            for(float val: arr) {
                out[index] = val;
                index++;
            }
        }
        return out;
    }

    /**
     * Returns a new array consisting of all elements in given arrays, in the order provided.
     * @param arrays arrays to merge
     * @return a new array consisting of all elements in given arrays, in the order provided.
     */
    public static double[] merge(double[]... arrays) {
        int totalLength = 0;
        for(double[] arr: arrays)
            totalLength += arr.length;
        double[] out = new double[totalLength];
        int index = 0;
        for(double[] arr: arrays) {
            for(double val: arr) {
                out[index] = val;
                index++;
            }
        }
        return out;
    }

    /**
     * Returns a new array consisting of all elements in given arrays, in the order provided.
     * @param arrays arrays to merge
     * @return a new array consisting of all elements in given arrays, in the order provided.
     */
    public static boolean[] merge(boolean[]... arrays) {
        int totalLength = 0;
        for(boolean[] arr: arrays)
            totalLength += arr.length;
        boolean[] out = new boolean[totalLength];
        int index = 0;
        for(boolean[] arr: arrays) {
            for(boolean val: arr) {
                out[index] = val;
                index++;
            }
        }
        return out;
    }

    /**
     * Returns a new array consisting of all elements in given arrays, in the order provided.
     * @param arrays arrays to merge
     * @return a new array consisting of all elements in given arrays, in the order provided.
     */
    public static char[] merge(char[]... arrays) {
        int totalLength = 0;
        for(char[] arr: arrays)
            totalLength += arr.length;
        char[] out = new char[totalLength];
        int index = 0;
        for(char[] arr: arrays) {
            for(char val: arr) {
                out[index] = val;
                index++;
            }
        }
        return out;
    }

    /**
     * Returns the number of elements in the specified array equal to the specified object
     * @param array the array in which to determine the frequency of o
     * @param o the object whose frequency is to be determined
     * @return the number of elements in the specified array equal to the specified object
     */
    public static int frequency(Object[] array, Object o) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == o)
                out++;
        }
        return out;
    }

    /**
     * Returns the number of elements in the specified array equal to the specified object
     * @param array the array in which to determine the frequency of o
     * @param value the value whose frequency is to be determined
     * @return the number of elements in the specified array equal to the specified object
     */
    public static int frequency(int[] array, int value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

    /**
     * Returns the number of elements in the specified array equal to the specified object
     * @param array the array in which to determine the frequency of o
     * @param value the value whose frequency is to be determined
     * @return the number of elements in the specified array equal to the specified object
     */
    public static int frequency(byte[] array, byte value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

    /**
     * Returns the number of elements in the specified array equal to the specified object
     * @param array the array in which to determine the frequency of o
     * @param value the value whose frequency is to be determined
     * @return the number of elements in the specified array equal to the specified object
     */
    public static int frequency(short[] array, short value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

    /**
     * Returns the number of elements in the specified array equal to the specified object
     * @param array the array in which to determine the frequency of o
     * @param value the value whose frequency is to be determined
     * @return the number of elements in the specified array equal to the specified object
     */
    public static int frequency(long[] array, long value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

    /**
     * Returns the number of elements in the specified array equal to the specified object
     * @param array the array in which to determine the frequency of o
     * @param value the value whose frequency is to be determined
     * @return the number of elements in the specified array equal to the specified object
     */
    public static int frequency(float[] array, float value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

    /**
     * Returns the number of elements in the specified array equal to the specified object
     * @param array the array in which to determine the frequency of o
     * @param value the value whose frequency is to be determined
     * @return the number of elements in the specified array equal to the specified object
     */
    public static int frequency(double[] array, double value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

    /**
     * Returns the number of elements in the specified array equal to the specified object
     * @param array the array in which to determine the frequency of o
     * @param value the value whose frequency is to be determined
     * @return the number of elements in the specified array equal to the specified object
     */
    public static int frequency(boolean[] array, boolean value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

    /**
     * Returns the number of elements in the specified array equal to the specified object
     * @param array the array in which to determine the frequency of o
     * @param value the value whose frequency is to be determined
     * @return the number of elements in the specified array equal to the specified object
     */
    public static int frequency(char[] array, char value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

        /**
     * Returns the maximum value in the specified array, according to the Object's compareTo method
     * Assumes the compareTo method is transitive
     * @param array the array in which to find the maximum
     * @return the maximum value in the specified array
     */
    public static <T extends Comparable> T max(T[] array) {
        if(array == null || array.length == 0)
            return null;
        
        T out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(out.compareTo(array[i]) < 0)
                out = array[i];
        }
        return out;
    }

    /**
     * Returns the maximum value in the specified array, according to the provided Comparator
     * Assumes the comparator is transitive
     * @param array the array in which to find the maximum
     * @return the maximum value in the specified array
     */
    public static <T> T max(T[] array, Comparator<T> comparator) {
        if(array == null || array.length == 0)
            return null;

        T out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(comparator.compare(out, array[i]) < 0)
                out = array[i];
        }
        return out;
    }

    /**
     * Returns the maximum value in the specified array
     * @param array the array in which to find the maximum
     * @return the maximum value in the specified array
     */
    public static int max(int[] array) {
        if(array == null || array.length == 0)
            return -1;

        int out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > out)
                out = array[i];
        }

        return out;
    }

    /**
     * Returns the maximum value in the specified array
     * @param array the array in which to find the maximum
     * @return the maximum value in the specified array
     */
    public static byte max(byte[] array) {
        if(array == null || array.length == 0)
            return -1;

        byte out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > out)
                out = array[i];
        }

        return out;
    }

    /**
     * Returns the maximum value in the specified array
     * @param array the array in which to find the maximum
     * @return the maximum value in the specified array
     */
    public static short max(short[] array) {
        if(array == null || array.length == 0)
            return -1;

        short out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > out)
                out = array[i];
        }

        return out;
    }

    /**
     * Returns the maximum value in the specified array
     * @param array the array in which to find the maximum
     * @return the maximum value in the specified array
     */
    public static long max(long[] array) {
        if(array == null || array.length == 0)
            return -1;

        long out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > out)
                out = array[i];
        }

        return out;
    }

    /**
     * Returns the maximum value in the specified array
     * @param array the array in which to find the maximum
     * @return the maximum value in the specified array
     */
    public static float max(float[] array) {
        if(array == null || array.length == 0)
            return -1;

        float out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > out)
                out = array[i];
        }

        return out;
    }

    /**
     * Returns the maximum value in the specified array
     * @param array the array in which to find the maximum
     * @return the maximum value in the specified array
     */
    public static double max(double[] array) {
        if(array == null || array.length == 0)
            return -1;

        double out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > out)
                out = array[i];
        }

        return out;
    }

    /**
     * Returns the maximum value in the specified array
     * @param array the array in which to find the maximum
     * @return the maximum value in the specified array
     */
    public static char max(char[] array) {
        if(array == null || array.length == 0)
            return Character.MIN_VALUE;

        char out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] > out)
                out = array[i];
        }

        return out;
    }

    /**
     * Returns the minimum value in the specified array, according to the Object's compareTo method
     * Assumes the compareTo method is transitive
     * @param array the array in which to find the minimum
     * @return the minimum value in the specified array
     */
    public static <T extends Comparable> T min(T[] array) {
        if(array == null || array.length == 0)
            return null;

        T out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(out.compareTo(array[i]) > 0)
                out = array[i];
        }
        return out;
    }

    /**
     * Returns the minimum value in the specified array, according to the provided Comparator
     * Assumes the comparator is transitive
     * @param array the array in which to find the minimum
     * @return the minimum value in the specified array
     */
    public static <T> T min(T[] array, Comparator<T> comparator) {
        if(array == null || array.length == 0)
            return null;

        T out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(comparator.compare(out, array[i]) > 0)
                out = array[i];
        }
        return out;
    }

    /**
     * Returns the minimum value in the specified array
     * @param array the array in which to find the minimum
     * @return the minimum value in the specified array
     */
    public static int min(int[] array) {
        if(array == null || array.length == 0)
            return -1;

        int out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < out)
                out = array[i];
        }
        
        return out;
    }

    /**
     * Returns the minimum value in the specified array
     * @param array the array in which to find the minimum
     * @return the minimum value in the specified array
     */
    public static byte min(byte[] array) {
        if(array == null || array.length == 0)
            return -1;

        byte out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < out)
                out = array[i];
        }

        return out;
    }

    /**
     * Returns the minimum value in the specified array
     * @param array the array in which to find the minimum
     * @return the minimum value in the specified array
     */
    public static short min(short[] array) {
        if(array == null || array.length == 0)
            return -1;

        short out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < out)
                out = array[i];
        }

        return out;
    }

    /**
     * Returns the minimum value in the specified array
     * @param array the array in which to find the minimum
     * @return the minimum value in the specified array
     */
    public static long min(long[] array) {
        if(array == null || array.length == 0)
            return -1;

        long out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < out)
                out = array[i];
        }

        return out;
    }

    /**
     * Returns the minimum value in the specified array
     * @param array the array in which to find the minimum
     * @return the minimum value in the specified array
     */
    public static float min(float[] array) {
        if(array == null || array.length == 0)
            return -1;

        float out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < out)
                out = array[i];
        }

        return out;
    }

    /**
     * Returns the minimum value in the specified array
     * @param array the array in which to find the minimum
     * @return the minimum value in the specified array
     */
    public static double min(double[] array) {
        if(array == null || array.length == 0)
            return -1;

        double out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < out)
                out = array[i];
        }

        return out;
    }

    /**
     * Returns the minimum value in the specified array
     * @param array the array in which to find the minimum
     * @return the minimum value in the specified array
     */
    public static char min(char[] array) {
        if(array == null || array.length == 0)
            return Character.MIN_VALUE;

        char out = array[0];
        for(int i = 1; i < array.length; i++) {
            if(array[i] < out)
                out = array[i];
        }

        return out;
    }

    /**
     * Reverses the order of the elements in the specified array.
     * @param array the array whose elements are to be reversed.
     */
    public static void reverse(Object[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    /**
     * Reverses the order of the elements in the specified array.
     * @param array the array whose elements are to be reversed.
     */
    public static void reverse(int[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    /**
     * Reverses the order of the elements in the specified array.
     * @param array the array whose elements are to be reversed.
     */
    public static void reverse(byte[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    /**
     * Reverses the order of the elements in the specified array.
     * @param array the array whose elements are to be reversed.
     */
    public static void reverse(short[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    /**
     * Reverses the order of the elements in the specified array.
     * @param array the array whose elements are to be reversed.
     */
    public static void reverse(long[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    /**
     * Reverses the order of the elements in the specified array.
     * @param array the array whose elements are to be reversed.
     */
    public static void reverse(float[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    /**
     * Reverses the order of the elements in the specified array.
     * @param array the array whose elements are to be reversed.
     */
    public static void reverse(double[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    /**
     * Reverses the order of the elements in the specified array.
     * @param array the array whose elements are to be reversed.
     */
    public static void reverse(boolean[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    /**
     * Reverses the order of the elements in the specified array.
     * @param array the array whose elements are to be reversed.
     */
    public static void reverse(char[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    /**
     * Randomly permutes the specified array using a default source of randomness. All permutations occur with approximately equal likelihood.
     * @param array the array to be shuffled
     */
    public static void shuffle(Object[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = r.nextInt(array.length);
            swap(array, i, index);
        }
    }

    /**
     * Randomly permutes the specified array using a default source of randomness. All permutations occur with approximately equal likelihood.
     * @param array the array to be shuffled
     */
    public static void shuffle(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = r.nextInt(array.length);
            swap(array, i, index);
        }
    }

    /**
     * Randomly permutes the specified array using a default source of randomness. All permutations occur with approximately equal likelihood.
     * @param array the array to be shuffled
     */
    public static void shuffle(byte[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = r.nextInt(array.length);
            swap(array, i, index);
        }
    }

    /**
     * Randomly permutes the specified array using a default source of randomness. All permutations occur with approximately equal likelihood.
     * @param array the array to be shuffled
     */
    public static void shuffle(short[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = r.nextInt(array.length);
            swap(array, i, index);
        }
    }

    /**
     * Randomly permutes the specified array using a default source of randomness. All permutations occur with approximately equal likelihood.
     * @param array the array to be shuffled
     */
    public static void shuffle(long[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = r.nextInt(array.length);
            swap(array, i, index);
        }
    }

    /**
     * Randomly permutes the specified array using a default source of randomness. All permutations occur with approximately equal likelihood.
     * @param array the array to be shuffled
     */
    public static void shuffle(float[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = r.nextInt(array.length);
            swap(array, i, index);
        }
    }

    /**
     * Randomly permutes the specified array using a default source of randomness. All permutations occur with approximately equal likelihood.
     * @param array the array to be shuffled
     */
    public static void shuffle(double[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = r.nextInt(array.length);
            swap(array, i, index);
        }
    }

    /**
     * Randomly permutes the specified array using a default source of randomness. All permutations occur with approximately equal likelihood.
     * @param array the array to be shuffled
     */
    public static void shuffle(boolean[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = r.nextInt(array.length);
            swap(array, i, index);
        }
    }

    /**
     * Randomly permutes the specified array using a default source of randomness. All permutations occur with approximately equal likelihood.
     * @param array the array to be shuffled
     */
    public static void shuffle(char[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            int index = r.nextInt(array.length);
            swap(array, i, index);
        }
    }

    /**
     * Sorts the specified array of objects according to the order induced by the specified comparator.
     * @param array the array to be sorted
     * @param c the comparator to determine the order of the array. A null value indicates that the elements' natural ordering should be used.
     */
    public static void sort(int[] array, Comparator<? super Integer> c) {
        if(c == null) 
            Arrays.sort(array);
        else
            sort(array, c, 0, array.length - 1);
    }

    private static void sort(int[] array, Comparator<? super Integer> c, int low, int high) {
        if (low < high) {
            int pivot = array[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(array[j], pivot) <= 0) {
                    i++;

                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            int temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            int partIndex = i + 1;

            sort(array, c, low, partIndex - 1);
            sort(array, c, partIndex + 1, high);
        }
    }

    /**
     * Sorts the specified array of objects according to the order induced by the specified comparator.
     * @param array the array to be sorted
     * @param c the comparator to determine the order of the array. A null value indicates that the elements' natural ordering should be used.
     */
    public static void sort(byte[] array, Comparator<? super Byte> c) {
        if(c == null) 
            Arrays.sort(array);
        else
            sort(array, c, 0, array.length - 1);
    }

    private static void sort(byte[] array, Comparator<? super Byte> c, int low, int high) {
        if (low < high) {
            byte pivot = array[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(array[j], pivot) <= 0) {
                    i++;

                    byte temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            byte temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            int partIndex = i + 1;

            sort(array, c, low, partIndex - 1);
            sort(array, c, partIndex + 1, high);
        }
    }

    /**
     * Sorts the specified array of objects according to the order induced by the specified comparator.
     * @param array the array to be sorted
     * @param c the comparator to determine the order of the array. A null value indicates that the elements' natural ordering should be used.
     */
    public static void sort(short[] array, Comparator<? super Short> c) {
        if(c == null) 
            Arrays.sort(array);
        else
            sort(array, c, 0, array.length - 1);
    }

    private static void sort(short[] array, Comparator<? super Short> c, int low, int high) {
        if (low < high) {
            short pivot = array[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(array[j], pivot) <= 0) {
                    i++;

                    short temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            short temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            int partIndex = i + 1;

            sort(array, c, low, partIndex - 1);
            sort(array, c, partIndex + 1, high);
        }
    }

    /**
     * Sorts the specified array of objects according to the order induced by the specified comparator.
     * @param array the array to be sorted
     * @param c the comparator to determine the order of the array. A null value indicates that the elements' natural ordering should be used.
     */
    public static void sort(long[] array, Comparator<? super Long> c) {
        if(c == null) 
            Arrays.sort(array);
        else
            sort(array, c, 0, array.length - 1);
    }

    private static void sort(long[] array, Comparator<? super Long> c, int low, int high) {
        if (low < high) {
            long pivot = array[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(array[j], pivot) <= 0) {
                    i++;

                    long temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            long temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            int partIndex = i + 1;

            sort(array, c, low, partIndex - 1);
            sort(array, c, partIndex + 1, high);
        }
    }

    /**
     * Sorts the specified array of objects according to the order induced by the specified comparator.
     * @param array the array to be sorted
     * @param c the comparator to determine the order of the array. A null value indicates that the elements' natural ordering should be used.
     */
    public static void sort(float[] array, Comparator<? super Float> c) {
        if(c == null) 
            Arrays.sort(array);
        else
            sort(array, c, 0, array.length - 1);
    }

    private static void sort(float[] array, Comparator<? super Float> c, int low, int high) {
        if (low < high) {
            float pivot = array[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(array[j], pivot) <= 0) {
                    i++;

                    float temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            float temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            int partIndex = i + 1;

            sort(array, c, low, partIndex - 1);
            sort(array, c, partIndex + 1, high);
        }
    }

    /**
     * Sorts the specified array of objects according to the order induced by the specified comparator.
     * @param array the array to be sorted
     * @param c the comparator to determine the order of the array. A null value indicates that the elements' natural ordering should be used.
     */
    public static void sort(double[] array, Comparator<? super Double> c) {
        if(c == null) 
            Arrays.sort(array);
        else
            sort(array, c, 0, array.length - 1);
    }

    private static void sort(double[] array, Comparator<? super Double> c, int low, int high) {
        if (low < high) {
            double pivot = array[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(array[j], pivot) <= 0) {
                    i++;

                    double temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            double temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            int partIndex = i + 1;

            sort(array, c, low, partIndex - 1);
            sort(array, c, partIndex + 1, high);
        }
    }

    /**
     * Sorts the specified array of objects according to the order induced by the specified comparator.
     * @param array the array to be sorted
     * @param c the comparator to determine the order of the array. A null value indicates that the elements' natural ordering should be used.
     */
    public static void sort(char[] array, Comparator<? super Character> c) {
        if(c == null) 
            Arrays.sort(array);
        else
            sort(array, c, 0, array.length - 1);
    }

    private static void sort(char[] array, Comparator<? super Character> c, int low, int high) {
        if (low < high) {
            char pivot = array[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(array[j], pivot) <= 0) {
                    i++;

                    char temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            char temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            int partIndex = i + 1;

            sort(array, c, low, partIndex - 1);
            sort(array, c, partIndex + 1, high);
        }
    }

    /**
     * Swaps the two specified elements of the given array
     * @param array arrays to swap in
     * @param index1 index of the first element to swap
     * @param index2 index of the second element to swap
     */
    public static void swap(Object[] array, int index1, int index2) {
        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Swaps the two specified elements of the given array
     * @param array arrays to swap in
     * @param index1 index of the first element to swap
     * @param index2 index of the second element to swap
     */
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Swaps the two specified elements of the given array
     * @param array arrays to swap in
     * @param index1 index of the first element to swap
     * @param index2 index of the second element to swap
     */
    public static void swap(byte[] array, int index1, int index2) {
        byte temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Swaps the two specified elements of the given array
     * @param array arrays to swap in
     * @param index1 index of the first element to swap
     * @param index2 index of the second element to swap
     */
    public static void swap(short[] array, int index1, int index2) {
        short temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Swaps the two specified elements of the given array
     * @param array arrays to swap in
     * @param index1 index of the first element to swap
     * @param index2 index of the second element to swap
     */
    public static void swap(long[] array, int index1, int index2) {
        long temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Swaps the two specified elements of the given array
     * @param array arrays to swap in
     * @param index1 index of the first element to swap
     * @param index2 index of the second element to swap
     */
    public static void swap(float[] array, int index1, int index2) {
        float temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Swaps the two specified elements of the given array
     * @param array arrays to swap in
     * @param index1 index of the first element to swap
     * @param index2 index of the second element to swap
     */
    public static void swap(double[] array, int index1, int index2) {
        double temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Swaps the two specified elements of the given array
     * @param array arrays to swap in
     * @param index1 index of the first element to swap
     * @param index2 index of the second element to swap
     */
    public static void swap(boolean[] array, int index1, int index2) {
        boolean temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Swaps the two specified elements of the given array
     * @param array arrays to swap in
     * @param index1 index of the first element to swap
     * @param index2 index of the second element to swap
     */
    public static void swap(char[] array, int index1, int index2) {
        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    /**
     * Converts an array of primitive ints to Integer objects.
     * @param array array to convert
     * @return an Integer array containing the same values as the original
     */
    public static Integer[] toObject(final int[] array) {
        Integer[] out = new Integer[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }
    
    /**
     * Converts an array of primitive bytes to Byte objects.
     * @param array array to convert
     * @return a Byte array containing the same values as the original
     */
    public static Byte[] toObjectArray(final byte[] array) {
        Byte[] out = new Byte[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    /**
     * Converts an array of primitive shorts to Shorts objects.
     * @param array array to convert
     * @return a Short array containing the same values as the original
     */
    public static Short[] toObjectArray(final short[] array) {
        Short[] out = new Short[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    /**
     * Converts an array of primitive longs to Long objects.
     * @param array array to convert
     * @return a Long array containing the same values as the original
     */
    public static Long[] toObjectArray(final long[] array) {
        Long[] out = new Long[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    /**
     * Converts an array of primitive floats to Float objects.
     * @param array array to convert
     * @return a Float array containing the same values as the original
     */
    public static Float[] toObjectArray(final float[] array) {
        Float[] out = new Float[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    /**
     * Converts an array of primitive doubles to Double objects.
     * @param array array to convert
     * @return a Double array containing the same values as the original
     */
    public static Double[] toObjectArray(final double[] array) {
        Double[] out = new Double[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    /**
     * Converts an array of primitive booleans to Boolean objects.
     * @param array array to convert
     * @return a Boolean array containing the same values as the original
     */
    public static Boolean[] toObjectArray(final boolean[] array) {
        Boolean[] out = new Boolean[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    /**
     * Converts an array of primitive chars to Character objects.
     * @param array array to convert
     * @return a Character array containing the same values as the original
     */
    public static Character[] toObjectArray(final char[] array) {
        Character[] out = new Character[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    /**
     * Converts an array of Integer objects to primitive ints
     * @param array array to convert
     * @return an int array containing the same values as the original
     */
    public static int[] toPrimitiveArray(Integer[] array) {
        int[] out = new int[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    /**
     * Converts an array of Integer objects to primitive ints, replacing
     * all instances of null with valIfNull.
     * @param array array to convert
     * @param valIfNull value to replace null with
     * @return an int array containing the same values as the original and all nulls replaced with valIfNull
     */
    public static int[] toPrimitiveArray(Integer[] array, int valIfNull) {
        int[] out = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                out[i] = valIfNull;
            else
                out[i] = array[i];
        }
        return out;
    }

    /**
     * Converts an array of Byte objects to primitive bytes
     * @param array array to convert
     * @return a byte array containing the same values as the original
     */
    public static byte[] toPrimitiveArray(Byte[] array) {
        byte[] out = new byte[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    /**
     * Converts an array of Byte objects to primitive bytes, replacing
     * all instances of null with valIfNull.
     * @param array array to convert
     * @param valIfNull value to replace null with
     * @return a byte array containing the same values as the original and all nulls replaced with valIfNull
     */
    public static byte[] toPrimitiveArray(Byte[] array, byte valIfNull) {
        byte[] out = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                out[i] = valIfNull;
            else
                out[i] = array[i];
        }
        return out;
    }

    /**
     * Converts an array of Short objects to primitive shorts
     * @param array array to convert
     * @return a short array containing the same values as the original
     */
    public static short[] toPrimitiveArray(Short[] array) {
        short[] out = new short[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    /**
     * Converts an array of Short objects to primitive shorts, replacing
     * all instances of null with valIfNull.
     * @param array array to convert
     * @param valIfNull value to replace null with
     * @return a short array containing the same values as the original and all nulls replaced with valIfNull
     */
    public static short[] toPrimitiveArray(Short[] array, short valIfNull) {
        short[] out = new short[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                out[i] = valIfNull;
            else
                out[i] = array[i];
        }
        return out;
    }

    /**
     * Converts an array of Long objects to primitive longs
     * @param array array to convert
     * @return a long array containing the same values as the original
     */
    public static long[] toPrimitiveArray(Long[] array) {
        long[] out = new long[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    /**
     * Converts an array of Long objects to primitive longs, replacing
     * all instances of null with valIfNull.
     * @param array array to convert
     * @param valIfNull value to replace null with
     * @return a long array containing the same values as the original and all nulls replaced with valIfNull
     */
    public static long[] toPrimitiveArray(Long[] array, long valIfNull) {
        long[] out = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                out[i] = valIfNull;
            else
                out[i] = array[i];
        }
        return out;
    }

    /**
     * Converts an array of Float objects to primitive floats
     * @param array array to convert
     * @return a float array containing the same values as the original
     */
    public static float[] toPrimitiveArray(Float[] array) {
        float[] out = new float[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    /**
     * Converts an array of Float objects to primitive floats, replacing
     * all instances of null with valIfNull.
     * @param array array to convert
     * @param valIfNull value to replace null with
     * @return a float array containing the same values as the original and all nulls replaced with valIfNull
     */
    public static float[] toPrimitiveArray(Float[] array, float valIfNull) {
        float[] out = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                out[i] = valIfNull;
            else
                out[i] = array[i];
        }
        return out;
    }

    /**
     * Converts an array of Double objects to primitive doubles
     * @param array array to convert
     * @return a double array containing the same values as the original
     */
    public static double[] toPrimitiveArray(Double[] array) {
        double[] out = new double[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    /**
     * Converts an array of Double objects to primitive doubles, replacing
     * all instances of null with valIfNull.
     * @param array array to convert
     * @param valIfNull value to replace null with
     * @return a double array containing the same values as the original and all nulls replaced with valIfNull
     */
    public static double[] toPrimitiveArray(Double[] array, double valIfNull) {
        double[] out = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                out[i] = valIfNull;
            else
                out[i] = array[i];
        }
        return out;
    }

    /**
     * Converts an array of Boolean objects to primitive booleans
     * @param array array to convert
     * @return a boolean array containing the same values as the original
     */
    public static boolean[] toPrimitiveArray(Boolean[] array) {
        boolean[] out = new boolean[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    /**
     * Converts an array of Boolean objects to primitive booleans, replacing
     * all instances of null with valIfNull.
     * @param array array to convert
     * @param valIfNull value to replace null with
     * @return a boolean array containing the same values as the original and all nulls replaced with valIfNull
     */
    public static boolean[] toPrimitiveArray(Boolean[] array, boolean valIfNull) {
        boolean[] out = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                out[i] = valIfNull;
            else
                out[i] = array[i];
        }
        return out;
    }

    /**
     * Converts an array of Character objects to primitive chars
     * @param array array to convert
     * @return a char array containing the same values as the original
     */
    public static char[] toPrimitiveArray(Character[] array) {
        char[] out = new char[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    /**
     * Converts an array of Character objects to primitive chars, replacing
     * all instances of null with valIfNull.
     * @param array array to convert
     * @param valIfNull value to replace null with
     * @return a char array containing the same values as the original and all nulls replaced with valIfNull
     */
    public static char[] toPrimitiveArray(Character[] array, char valIfNull) {
        char[] out = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                out[i] = valIfNull;
            else
                out[i] = array[i];
        }
        return out;
    }
}
