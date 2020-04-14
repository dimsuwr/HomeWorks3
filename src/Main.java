import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        game();
        String still;
        while (true){
            System.out.println("Сыграем еще раз? 1-да, 0-нет");
            still = sc.next();
            if (still.equals("1")){
                game();
            }else if (still.equals("0")){
                System.out.println("До свидания!");
                break;
            }
        }

    }


static void game(){
        //int answer = 10;
     int answer = random.nextInt(10); //переменная которая случайным образом выбирает число.
    int attempt = 3; //колличество попыток которое дается пользователю на разгадку.
    System.out.println("Давайте сыграем в игру, я загадал число, от 0 до 9, у вас есть " + attempt + " попытки, что бы его отгадать!");
   int i;
    for ( i = 1; i <= attempt ; i++) {
        System.out.println("Введите число");
        int UserAnswer = sc.nextInt(); //переменная, которая принимает в себя значение введеного числа из консоли.
        if (UserAnswer == answer){
            System.out.println("Верно");
           break;
        } else if(UserAnswer > answer){
            System.out.println("Ваше число " + UserAnswer + " больше чем загаданное! \nОсталось попыток: " + (attempt - i) + "\n");
        } else if (UserAnswer < answer){
            System.out.println("Ваше число " + UserAnswer + " меньше чем загаданное! \nОсталось попыток: " + (attempt - i) + "\n");
        }


    }
    if (i <= attempt){
        System.out.println("Игра окончена! Вы выиграли! Поздравляю!\n");
    } else if (i > attempt){
        System.out.println("Игра окончена! Вы проиграли!\nПравильный ответ:" + answer);
    }

}

}
