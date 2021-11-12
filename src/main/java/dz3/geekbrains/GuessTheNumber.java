package dz3.geekbrains;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        guessNumber();

    }
    public static void guessNumber() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int tries = 0;
        int random = rand.nextInt(9);
        System.out.println("Угадайте число от 0 до 9 , у вас есть 3 попытки");
        while (tries < 3) {
            System.out.println("Введите число ");
            int number = sc.nextInt();
            if (number > random) {
                System.out.println(" Число больше загаданного , попробуйте еще");
            } else if (number < random) {
                System.out.println("Число меньше загаданного , попробуйте еще" );
            }else if (number == random) {
                System.out.println("Вы угадали !!!, возьмите пряник с полки");
                break;
            }
            tries++;



    }
        System.out.println(" Хотите сыграть еще раз ??? если да то нажмите 1 , если нет то нажмите 0");
        String userChose = sc.next();
        if ( userChose.equals(1)) {
            guessNumber();
        }else System.out.println("Спасибо за игру , до новых встреч");
        }


    }


