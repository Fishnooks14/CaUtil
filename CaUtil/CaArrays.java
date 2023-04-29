package CaUtil;

import java.util.Arrays;
import java.util.Comparator;

public final class CaArrays {

    public static void deepFill(Object[] arr, Object val) {
        if (arr == null)
            return;

        for (int i = 0; i < arr.length; ++i) {
            Object elt = arr[i];

            if (elt instanceof boolean[])
                Arrays.fill((boolean[]) elt, (boolean) val);
            else if (elt instanceof byte[])
                Arrays.fill((byte[]) elt, (byte) val);
            else if (elt instanceof char[])
                Arrays.fill((char[]) elt, (char) val);
            else if (elt instanceof short[])
                Arrays.fill((short[]) elt, (short) val);
            else if (elt instanceof int[])
                Arrays.fill((int[]) elt, (int) val);
            else if (elt instanceof long[])
                Arrays.fill((long[]) elt, (long) val);
            else if (elt instanceof float[])
                Arrays.fill((float[]) elt, (float) val);
            else if (elt instanceof double[])
                Arrays.fill((double[]) elt, (double) val);
            else if (elt instanceof Object[] os)
                deepFill(os, val);
            else
                arr[i] = val;
        }
    }

    public static void shuffle(Object[] arr) {
        if (arr == null)
            return;

        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            Object temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void shuffle(int[] arr) {
        if (arr == null)
            return;

        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void shuffle(byte[] arr) {
        if (arr == null)
            return;

        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            byte temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void shuffle(short[] arr) {
        if (arr == null)
            return;

        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            short temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void shuffle(long[] arr) {
        if (arr == null)
            return;

        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            long temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void shuffle(float[] arr) {
        if (arr == null)
            return;

        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            float temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void shuffle(double[] arr) {
        if (arr == null)
            return;

        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            double temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void shuffle(boolean[] arr) {
        if (arr == null)
            return;

        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            boolean temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void shuffle(char[] arr) {
        if (arr == null)
            return;

        for (int i = 0; i < arr.length; i++) {
            int index = (int) (Math.random() * arr.length);
            char temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }

    public static void sort(int[] arr, Comparator<? super Integer> c) {
        sort(arr, c, 0, arr.length - 1);
    }

    private static void sort(int[] arr, Comparator<? super Integer> c, int low, int high) {
        if (low < high) {
            int pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(arr[j], pivot) <= 0) {
                    i++;

                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            int partIndex = i + 1;

            sort(arr, c, low, partIndex - 1);
            sort(arr, c, partIndex + 1, high);
        }
    }

    public static void sort(byte[] arr, Comparator<? super Byte> c) {
        sort(arr, c, 0, arr.length - 1);
    }

    private static void sort(byte[] arr, Comparator<? super Byte> c, int low, int high) {
        if (low < high) {
            byte pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(arr[j], pivot) <= 0) {
                    i++;

                    byte temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            byte temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            int partIndex = i + 1;

            sort(arr, c, low, partIndex - 1);
            sort(arr, c, partIndex + 1, high);
        }
    }

    public static void sort(short[] arr, Comparator<? super Short> c) {
        sort(arr, c, 0, arr.length - 1);
    }

    private static void sort(short[] arr, Comparator<? super Short> c, int low, int high) {
        if (low < high) {
            short pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(arr[j], pivot) <= 0) {
                    i++;

                    short temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            short temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            int partIndex = i + 1;

            sort(arr, c, low, partIndex - 1);
            sort(arr, c, partIndex + 1, high);
        }
    }

    public static void sort(long[] arr, Comparator<? super Long> c) {
        sort(arr, c, 0, arr.length - 1);
    }

    private static void sort(long[] arr, Comparator<? super Long> c, int low, int high) {
        if (low < high) {
            long pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(arr[j], pivot) <= 0) {
                    i++;

                    long temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            long temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            int partIndex = i + 1;

            sort(arr, c, low, partIndex - 1);
            sort(arr, c, partIndex + 1, high);
        }
    }

    public static void sort(float[] arr, Comparator<? super Float> c) {
        sort(arr, c, 0, arr.length - 1);
    }

    private static void sort(float[] arr, Comparator<? super Float> c, int low, int high) {
        if (low < high) {
            float pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(arr[j], pivot) <= 0) {
                    i++;

                    float temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            float temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            int partIndex = i + 1;

            sort(arr, c, low, partIndex - 1);
            sort(arr, c, partIndex + 1, high);
        }
    }

    public static void sort(double[] arr, Comparator<? super Double> c) {
        sort(arr, c, 0, arr.length - 1);
    }

    private static void sort(double[] arr, Comparator<? super Double> c, int low, int high) {
        if (low < high) {
            double pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(arr[j], pivot) <= 0) {
                    i++;

                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            double temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            int partIndex = i + 1;

            sort(arr, c, low, partIndex - 1);
            sort(arr, c, partIndex + 1, high);
        }
    }

    public static void sort(boolean[] arr, Comparator<? super Boolean> c) {
        sort(arr, c, 0, arr.length - 1);
    }

    private static void sort(boolean[] arr, Comparator<? super Boolean> c, int low, int high) {
        if (low < high) {
            boolean pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(arr[j], pivot) <= 0) {
                    i++;

                    boolean temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            boolean temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            int partIndex = i + 1;

            sort(arr, c, low, partIndex - 1);
            sort(arr, c, partIndex + 1, high);
        }
    }

    public static void sort(char[] arr, Comparator<? super Character> c) {
        sort(arr, c, 0, arr.length - 1);
    }

    private static void sort(char[] arr, Comparator<? super Character> c, int low, int high) {
        if (low < high) {
            char pivot = arr[high];
            int i = low - 1;
            for (int j = low; j < high; j++) {
                if (c.compare(arr[j], pivot) <= 0) {
                    i++;

                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            char temp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = temp;

            int partIndex = i + 1;

            sort(arr, c, low, partIndex - 1);
            sort(arr, c, partIndex + 1, high);
        }
    }

    public static Integer[] toObjectArray(final int[] arr) {
        if (arr == null)
            return null;

        Integer[] out = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static Byte[] toObjectArray(final byte[] arr) {
        if (arr == null)
            return null;

        Byte[] out = new Byte[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static Short[] toObjectArray(final short[] arr) {
        if (arr == null)
            return null;

        Short[] out = new Short[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static Long[] toObjectArray(final long[] arr) {
        if (arr == null)
            return null;

        Long[] out = new Long[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static Float[] toObjectArray(final float[] arr) {
        if (arr == null)
            return null;

        Float[] out = new Float[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static Double[] toObjectArray(final double[] arr) {
        if (arr == null)
            return null;

        Double[] out = new Double[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static Boolean[] toObjectArray(final boolean[] arr) {
        if (arr == null)
            return null;

        Boolean[] out = new Boolean[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static Character[] toObjectArray(final char[] arr) {
        if (arr == null)
            return null;

        Character[] out = new Character[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static int[] toPrimitiveArray(Integer[] arr) {
        if (arr == null)
            return null;

        int[] out = new int[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static int[] toPrimitiveArray(Integer[] arr, int valIfNull) {
        if (arr == null)
            return null;

        int[] out = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                out[i] = valIfNull;
            else
                out[i] = arr[i];
        }
        return out;
    }


    public static byte[] toPrimitiveArray(Byte[] arr) {
        if (arr == null)
            return null;

        byte[] out = new byte[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static byte[] toPrimitiveArray(Byte[] arr, byte valIfNull) {
        if (arr == null)
            return null;

        byte[] out = new byte[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                out[i] = valIfNull;
            else
                out[i] = arr[i];
        }
        return out;
    }

    public static short[] toPrimitiveArray(Short[] arr) {
        if (arr == null)
            return null;

        short[] out = new short[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static short[] toPrimitiveArray(Short[] arr, short valIfNull) {
        if (arr == null)
            return null;

        short[] out = new short[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                out[i] = valIfNull;
            else
                out[i] = arr[i];
        }
        return out;
    }

    public static long[] toPrimitiveArray(Long[] arr) {
        if (arr == null)
            return null;

        long[] out = new long[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static long[] toPrimitiveArray(Long[] arr, long valIfNull) {
        if (arr == null)
            return null;

        long[] out = new long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                out[i] = valIfNull;
            else
                out[i] = arr[i];
        }
        return out;
    }

    public static float[] toPrimitiveArray(Float[] arr) {
        if (arr == null)
            return null;

        float[] out = new float[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static float[] toPrimitiveArray(Float[] arr, float valIfNull) {
        if (arr == null)
            return null;

        float[] out = new float[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                out[i] = valIfNull;
            else
                out[i] = arr[i];
        }
        return out;
    }

    public static double[] toPrimitiveArray(Double[] arr) {
        if (arr == null)
            return null;

        double[] out = new double[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static double[] toPrimitiveArray(Double[] arr, double valIfNull) {
        if (arr == null)
            return null;

        double[] out = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                out[i] = valIfNull;
            else
                out[i] = arr[i];
        }
        return out;
    }

    public static boolean[] toPrimitiveArray(Boolean[] arr) {
        if (arr == null)
            return null;

        boolean[] out = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static boolean[] toPrimitiveArray(Boolean[] arr, boolean valIfNull) {
        if (arr == null)
            return null;

        boolean[] out = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                out[i] = valIfNull;
            else
                out[i] = arr[i];
        }
        return out;
    }

    public static char[] toPrimitiveArray(Character[] arr) {
        if (arr == null)
            return null;

        char[] out = new char[arr.length];
        for (int i = 0; i < arr.length; i++)
            out[i] = arr[i];
        return out;
    }

    public static char[] toPrimitiveArray(Character[] arr, char valIfNull) {
        if (arr == null)
            return null;

        char[] out = new char[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null)
                out[i] = valIfNull;
            else
                out[i] = arr[i];
        }
        return out;
    }
}
