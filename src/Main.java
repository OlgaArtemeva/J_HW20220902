public class Main {
    public static void main(String[] args) {

//        First level: С использованием цикла while yаписать метод, печатающий куб числа от 0 до данного чисда n.
//        Пример: на входе n=3  на выходе 0,1,8,27

int n=3;
int i=0;
int cub;
while (i<=n) {
    cub=i*i*i;
    System.out.println(cub);
    i+=1;
}
        System.out.println("-----------------------------");


//        С использованием цикла while yаписать метод, печатающий результат  умножения данного числа n  на все целые числа от 0 до n..
//        Пример: на входе n=3  на выходе 0,3,6,9
        i=0;
        int mult=n;
        while (i<=n) {
            System.out.println(mult*i);
i+=1;
        }
    }
}