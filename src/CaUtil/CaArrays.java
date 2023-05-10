package CaUtil;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.HashMap;

public final class CaArrays {
    
    public static void clear(Object[] array) {
        if (array == null)
            return;
            
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    public static void clear(int[] array) {
        if (array == null)
            return;
            
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public static void clear(byte[] array) {
        if (array == null)
            return;
            
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public static void clear(short[] array) {
        if (array == null)
            return;
            
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public static void clear(long[] array) {
        if (array == null)
            return;
            
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public static void clear(float[] array) {
        if (array == null)
            return;
            
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public static void clear(double[] array) {
        if (array == null)
            return;
            
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public static void clear(boolean[] array) {
        if (array == null)
            return;
            
        for (int i = 0; i < array.length; i++) {
            array[i] = false;
        }
    }

    public static void clear(char[] array) {
        if (array == null)
            return;
            
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
        if (array == null)
            return false;

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
        if (array == null)
            return false;

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
        if (array == null)
            return false;

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
        if (array == null)
            return false;

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
        if (array == null)
            return false;

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
        if (array == null)
            return false;

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
        if (array == null)
            return false;

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
        if (array == null)
            return false;

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
        if (array == null)
            return false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                return true;
        }
        return false;
    }

    public static Map<Object, Integer> count(Object[] array) {
        if (array == null)
            return null;
        
        Map<Object, Integer> out = new HashMap<>();
        for(Object o: array) {
            out.put(o, out.getOrDefault(o, 0));
        }
        return out;
    }

    public static Map<Integer, Integer> count(int[] array) {
        if (array == null)
            return null;
        
        Map<Integer, Integer> out = new HashMap<>();
        for(int i: array) {
            out.put(i, out.getOrDefault(i, 0) + 1);
        }
        return out;
    }

    public static Map<Byte, Integer> count(byte[] array) {
        if (array == null)
            return null;
        
        Map<Byte, Integer> out = new HashMap<>();
        for(byte b: array) {
            out.put(b, out.getOrDefault(b, 0) + 1);
        }
        return out;
    }

    public static Map<Short, Integer> count(short[] array) {
        if (array == null)
            return null;
        
        Map<Short, Integer> out = new HashMap<>();
        for(short s: array) {
            out.put(s, out.getOrDefault(s, 0) + 1);
        }
        return out;
    }

    public static Map<Long, Integer> count(long[] array) {
        if (array == null)
            return null;
        
        Map<Long, Integer> out = new HashMap<>();
        for(long l: array) {
            out.put(l, out.getOrDefault(l, 0) + 1);
        }
        return out;
    }

    public static Map<Float, Integer> count(float[] array) {
        if (array == null)
            return null;
        
        Map<Float, Integer> out = new HashMap<>();
        for(float f: array) {
            out.put(f, out.getOrDefault(f, 0) + 1);
        }
        return out;
    }

    public static Map<Double, Integer> count(double[] array) {
        if (array == null)
            return null;
        
        Map<Double, Integer> out = new HashMap<>();
        for(double d: array) {
            out.put(d, out.getOrDefault(d, 0) + 1);
        }
        return out;
    }

    public static Map<Boolean, Integer> count(boolean[] array) {
        if (array == null)
            return null;
        
        Map<Boolean, Integer> out = new HashMap<Boolean, Integer>();
        for(boolean b: array) {
            out.put(b, out.getOrDefault(b, 0) + 1);
        }
        return out;
    }

    public static Map<Character, Integer> count(char[] array) {
        if (array == null)
            return null;
        
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
            else if (elt instanceof Object[] os)
                deepFill(os, value);
            else
                array[i] = value;
        }
    }

    public static int indexOf(Object[] array, Object o) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == o)
                return i;
        }
        return -1;
    }

    public static int indexOf(int[] array, int i) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] == j)
                return j;
        }
        return -1;
    }

    public static int indexOf(byte[] array, byte b) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == b)
                return i;
        }
        return -1;
    }

    public static int indexOf(short[] array, short s) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == s)
                return i;
        }
        return -1;
    }

    public static int indexOf(long[] array, long l) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == l)
                return i;
        }
        return -1;
    }

    public static int indexOf(float[] array, float f) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == f)
                return i;
        }
        return -1;
    }

    public static int indexOf(double[] array, double d) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == d)
                return i;
        }
        return -1;
    }

    public static int indexOf(boolean[] array, boolean b) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == b)
                return i;
        }
        return -1;
    }

    public static int indexOf(char[] array, char c) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == c)
                return i;
        }
        return -1;
    }

    public static int lastIndexOf(Object[] array, Object o) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == o)
                return i;
        }
        return -1;
    }

    public static int lastIndexOf(int[] array, int i) {
        for (int j = array.length - 1; j >= 0; j--) {
            if (array[j] == i)
                return i;
        }
        return -1;
    }

    public static int lastIndexOf(byte[] array, byte b) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == b)
                return i;
        }
        return -1;
    }

    public static int lastIndexOf(short[] array, short s) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == s)
                return i;
        }
        return -1;
    }

    public static int lastIndexOf(long[] array, long l) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == l)
                return i;
        }
        return -1;
    }

    public static int lastIndexOf(float[] array, float f) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == f)
                return i;
        }
        return -1;
    }

    public static int lastIndexOf(double[] array, double d) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == d)
                return i;
        }
        return -1;
    }

    public static int lastIndexOf(boolean[] array, boolean b) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == b)
                return i;
        }
        return -1;
    }

    public static int lastIndexOf(char[] array, char c) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == c)
                return i;
        }
        return -1;
    }

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

    public static int numOfOccurrences(Object[] array, Object o) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == o)
                out++;
        }
        return out;
    }

    public static int numOfOccurrences(int[] array, int value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

    public static int numOfOccurrences(byte[] array, byte value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

    public static int numOfOccurrences(short[] array, short value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

    public static int numOfOccurrences(long[] array, long value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

    public static int numOfOccurrences(float[] array, float value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

    public static int numOfOccurrences(double[] array, double value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

    public static int numOfOccurrences(boolean[] array, boolean value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

    public static int numOfOccurrences(char[] array, char value) {
        int out = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value)
                out++;
        }
        return out;
    }

    

    public static void reverse(Object[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    public static void reverse(int[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    public static void reverse(byte[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    public static void reverse(short[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    public static void reverse(long[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    public static void reverse(float[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    public static void reverse(double[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    public static void reverse(boolean[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    public static void reverse(char[] array) {
        int pointer1 = 0;
        int pointer2 = array.length - 1;
        while(pointer1 < pointer2) {
            swap(array, pointer1, pointer2);
            pointer1++;
            pointer2--;
        }
    }

    public static void shuffle(Object[] array) {
        if (array == null)
            return;

        for (int i = 0; i < array.length; i++) {
            int index = (int) (Math.random() * array.length);
            swap(array, i, index);
        }
    }

    public static void shuffle(int[] array) {
        if (array == null)
            return;

        for (int i = 0; i < array.length; i++) {
            int index = (int) (Math.random() * array.length);
            swap(array, i, index);
        }
    }

    public static void shuffle(byte[] array) {
        if (array == null)
            return;

        for (int i = 0; i < array.length; i++) {
            int index = (int) (Math.random() * array.length);
            swap(array, i, index);
        }
    }

    public static void shuffle(short[] array) {
        if (array == null)
            return;

        for (int i = 0; i < array.length; i++) {
            int index = (int) (Math.random() * array.length);
            swap(array, i, index);
        }
    }

    public static void shuffle(long[] array) {
        if (array == null)
            return;

        for (int i = 0; i < array.length; i++) {
            int index = (int) (Math.random() * array.length);
            swap(array, i, index);
        }
    }

    public static void shuffle(float[] array) {
        if (array == null)
            return;

        for (int i = 0; i < array.length; i++) {
            int index = (int) (Math.random() * array.length);
            swap(array, i, index);
        }
    }

    public static void shuffle(double[] array) {
        if (array == null)
            return;

        for (int i = 0; i < array.length; i++) {
            int index = (int) (Math.random() * array.length);
            swap(array, i, index);
        }
    }

    public static void shuffle(boolean[] array) {
        if (array == null)
            return;

        for (int i = 0; i < array.length; i++) {
            int index = (int) (Math.random() * array.length);
            swap(array, i, index);
        }
    }

    public static void shuffle(char[] array) {
        if (array == null)
            return;

        for (int i = 0; i < array.length; i++) {
            int index = (int) (Math.random() * array.length);
            swap(array, i, index);
        }
    }

    public static void sort(int[] array, Comparator<? super Integer> c) {
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

    public static void sort(byte[] array, Comparator<? super Byte> c) {
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

    public static void sort(short[] array, Comparator<? super Short> c) {
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

    public static void sort(long[] array, Comparator<? super Long> c) {
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

    public static void sort(float[] array, Comparator<? super Float> c) {
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

    public static void sort(double[] array, Comparator<? super Double> c) {
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

    public static void sort(boolean[] array, Comparator<? super Boolean> c) {
        sort(array, c, 0, array.length - 1);
    }

    private static void sort(boolean[] array, Comparator<? super Boolean> c, int low, int high) {
        if (low < high) {
            boolean pivot = array[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(array[j], pivot) <= 0) {
                    i++;

                    boolean temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            boolean temp = array[i + 1];
            array[i + 1] = array[high];
            array[high] = temp;

            int partIndex = i + 1;

            sort(array, c, low, partIndex - 1);
            sort(array, c, partIndex + 1, high);
        }
    }

    public static void sort(char[] array, Comparator<? super Character> c) {
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

    public static Object[] subArray(Object[] array, int startIndex) {
        int length = array.length - startIndex;
        Object[] out = new Object[length];
        
        for(int i = startIndex; i < array.length; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static Object[] subArray(Object[] array, int startIndex, int endIndex) {
        int length = endIndex - startIndex;
        Object[] out = new Object[length];

        for(int i = startIndex; i < endIndex; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static int[] subArray(int[] array, int startIndex) {
        int length = array.length - startIndex;
        int[] out = new int[length];
        
        for(int i = startIndex; i < array.length; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static int[] subArray(int[] array, int startIndex, int endIndex) {
        int length = endIndex - startIndex;
        int[] out = new int[length];

        for(int i = startIndex; i < endIndex; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static byte[] subArray(byte[] array, int startIndex) {
        int length = array.length - startIndex;
        byte[] out = new byte[length];
        
        for(int i = startIndex; i < array.length; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static byte[] subArray(byte[] array, int startIndex, int endIndex) {
        int length = endIndex - startIndex;
        byte[] out = new byte[length];

        for(int i = startIndex; i < endIndex; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static short[] subArray(short[] array, int startIndex) {
        int length = array.length - startIndex;
        short[] out = new short[length];
        
        for(int i = startIndex; i < array.length; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static short[] subArray(short[] array, int startIndex, int endIndex) {
        int length = endIndex - startIndex;
        short[] out = new short[length];

        for(int i = startIndex; i < endIndex; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static long[] subArray(long[] array, int startIndex) {
        int length = array.length - startIndex;
        long[] out = new long[length];
        
        for(int i = startIndex; i < array.length; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static long[] subArray(long[] array, int startIndex, int endIndex) {
        int length = endIndex - startIndex;
        long[] out = new long[length];

        for(int i = startIndex; i < endIndex; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static float[] subArray(float[] array, int startIndex) {
        int length = array.length - startIndex;
        float[] out = new float[length];
        
        for(int i = startIndex; i < array.length; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static float[] subArray(float[] array, int startIndex, int endIndex) {
        int length = endIndex - startIndex;
        float[] out = new float[length];

        for(int i = startIndex; i < endIndex; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static double[] subArray(double[] array, int startIndex) {
        int length = array.length - startIndex;
        double[] out = new double[length];
        
        for(int i = startIndex; i < array.length; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static double[] subArray(double[] array, int startIndex, int endIndex) {
        int length = endIndex - startIndex;
        double[] out = new double[length];

        for(int i = startIndex; i < endIndex; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static boolean[] subArray(boolean[] array, int startIndex) {
        int length = array.length - startIndex;
        boolean[] out = new boolean[length];
        
        for(int i = startIndex; i < array.length; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static boolean[] subArray(boolean[] array, int startIndex, int endIndex) {
        int length = endIndex - startIndex;
        boolean[] out = new boolean[length];

        for(int i = startIndex; i < endIndex; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static char[] subArray(char[] array, int startIndex) {
        int length = array.length - startIndex;
        char[] out = new char[length];
        
        for(int i = startIndex; i < array.length; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static char[] subArray(char[] array, int startIndex, int endIndex) {
        int length = endIndex - startIndex;
        char[] out = new char[length];

        for(int i = startIndex; i < endIndex; i++) {
            out[i - startIndex] = array[i];
        }
        return out;
    }

    public static void swap(Object[] array, int index1, int index2) {
        Object temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void swap(byte[] array, int index1, int index2) {
        byte temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void swap(short[] array, int index1, int index2) {
        short temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void swap(long[] array, int index1, int index2) {
        long temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void swap(float[] array, int index1, int index2) {
        float temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void swap(double[] array, int index1, int index2) {
        double temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void swap(boolean[] array, int index1, int index2) {
        boolean temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void swap(char[] array, int index1, int index2) {
        char temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    public static Integer[] toObjectArray(final int[] array) {
        if (array == null)
            return null;

        Integer[] out = new Integer[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static Byte[] toObjectArray(final byte[] array) {
        if (array == null)
            return null;

        Byte[] out = new Byte[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static Short[] toObjectArray(final short[] array) {
        if (array == null)
            return null;

        Short[] out = new Short[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static Long[] toObjectArray(final long[] array) {
        if (array == null)
            return null;

        Long[] out = new Long[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static Float[] toObjectArray(final float[] array) {
        if (array == null)
            return null;

        Float[] out = new Float[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static Double[] toObjectArray(final double[] array) {
        if (array == null)
            return null;

        Double[] out = new Double[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static Boolean[] toObjectArray(final boolean[] array) {
        if (array == null)
            return null;

        Boolean[] out = new Boolean[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static Character[] toObjectArray(final char[] array) {
        if (array == null)
            return null;

        Character[] out = new Character[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static int[] toPrimitiveArray(Integer[] array) {
        if (array == null)
            return null;

        int[] out = new int[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static int[] toPrimitiveArray(Integer[] array, int valIfNull) {
        if (array == null)
            return null;

        int[] out = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                out[i] = valIfNull;
            else
                out[i] = array[i];
        }
        return out;
    }


    public static byte[] toPrimitiveArray(Byte[] array) {
        if (array == null)
            return null;

        byte[] out = new byte[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static byte[] toPrimitiveArray(Byte[] array, byte valIfNull) {
        if (array == null)
            return null;

        byte[] out = new byte[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                out[i] = valIfNull;
            else
                out[i] = array[i];
        }
        return out;
    }

    public static short[] toPrimitiveArray(Short[] array) {
        if (array == null)
            return null;

        short[] out = new short[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static short[] toPrimitiveArray(Short[] array, short valIfNull) {
        if (array == null)
            return null;

        short[] out = new short[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                out[i] = valIfNull;
            else
                out[i] = array[i];
        }
        return out;
    }

    public static long[] toPrimitiveArray(Long[] array) {
        if (array == null)
            return null;

        long[] out = new long[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static long[] toPrimitiveArray(Long[] array, long valIfNull) {
        if (array == null)
            return null;

        long[] out = new long[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                out[i] = valIfNull;
            else
                out[i] = array[i];
        }
        return out;
    }

    public static float[] toPrimitiveArray(Float[] array) {
        if (array == null)
            return null;

        float[] out = new float[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static float[] toPrimitiveArray(Float[] array, float valIfNull) {
        if (array == null)
            return null;

        float[] out = new float[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                out[i] = valIfNull;
            else
                out[i] = array[i];
        }
        return out;
    }

    public static double[] toPrimitiveArray(Double[] array) {
        if (array == null)
            return null;

        double[] out = new double[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static double[] toPrimitiveArray(Double[] array, double valIfNull) {
        if (array == null)
            return null;

        double[] out = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                out[i] = valIfNull;
            else
                out[i] = array[i];
        }
        return out;
    }

    public static boolean[] toPrimitiveArray(Boolean[] array) {
        if (array == null)
            return null;

        boolean[] out = new boolean[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static boolean[] toPrimitiveArray(Boolean[] array, boolean valIfNull) {
        if (array == null)
            return null;

        boolean[] out = new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null)
                out[i] = valIfNull;
            else
                out[i] = array[i];
        }
        return out;
    }

    public static char[] toPrimitiveArray(Character[] array) {
        if (array == null)
            return null;

        char[] out = new char[array.length];
        for (int i = 0; i < array.length; i++)
            out[i] = array[i];
        return out;
    }

    public static char[] toPrimitiveArray(Character[] array, char valIfNull) {
        if (array == null)
            return null;

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