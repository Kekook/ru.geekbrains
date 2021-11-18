package dz5.geekbrains;

public class Main {
    public static void main(String[] args) {

        Employee []employee = new Employee[5];
        employee[0] = new Employee("Андрей Пупин"," директор","рр@inbox.ru",13213131, 350, 46);
        employee[1] = new Employee("Вася Рогов","секретарь","ss@mail.ru",12165656,400,36);
        employee[2] = new Employee("Анюта Благова","уборщица","sdfasf@mail.ru",3458234,100,41);
        employee[3] = new Employee("Олег Базанов", "замдиректора","@list.ru",219342983,600,28);
        employee[4] = new Employee("Виталий Носорогов","генеральный","shdh@mail.ru",347823784,1000,66);
        for (int i = 0; i < employee.length ; i++) {
            if (employee[i].getAge() > 40){
                employee[i].info();
            }

        }


        }

    }

