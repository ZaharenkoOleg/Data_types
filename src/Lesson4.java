public class Lesson4 {
    public static void main(String[] args) {
        byte a = (byte) (Byte.MIN_VALUE -1);
        short b = (short) (Short.MAX_VALUE + 1);
        System.out.println(b);   //+ переполнение
        System.out.println(a);   //- переполнение
        int c = a + a;
        System.out.println(c); // присвоение переполненного byte переменной большего размера
        int[] d = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < d.length; i++) {            //различного рода операторы
            if (d[i] % 2 != 0) {
                for (int j = i; j < d.length; j++) {
                    if (d[j] % 2 == 0) {
                        int temp = d[i];
                        d[i] = d[j];
                        d[j] = temp;
                        break;
                    }
                }
            }
        }
        for (int f = 0; f < d.length; f++) {
            System.out.print(d[f] + " ");
        }
        System.out.println(a * a); //умножение
        System.out.println(a/a); //деление;

    }
}

