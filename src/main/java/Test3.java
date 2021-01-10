public class Test3 {
    public static void main(String[] args) {
        int a = 3;
        for (int i = 1; i <= 10; i++) {
            //  System.out.println(a * i);
            // System.out.println(String.format("a * i =", a * i ));
            // System.out.println(a,*, i,a);
            int b = a * i;
            //             System.out.println(String.format(a+ "*"+ i+ "=" +b));
            System.out.println(a + "*" + i + "=" + b);


                   /*   12) Вывести на таблицу умножения чисел от 1 до 9:
        1*1 = 1
        1*2 = 2
        1*3 = 3
	...
        2*1 = 2
        2*2 = 4
	...
        9*8 = 72
        9*9 = 81*/

            System.out.println("Multiplication table:");

            for (int i1 = 1; i < 10; i++) {  //почему не проходит инициализация i
                System.out.println("**********");
                for (int j = 1; j < 10; j++) {
                    System.out.println(i + " * " + j + " = " + (i * j));
                }
            }
        }
    }
}
