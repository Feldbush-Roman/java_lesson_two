import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
В проекте опишите 3 сущности: Комната, Жираф, Человек.
Подумайте и какими свойствами обладают данные сущности, а также какие функции они могут выполнять и напишите 5 функций
и 5 свойств для каждой сущности.
Создайте эти сущности и продемонстрируйте что они созданы и выполняют разные действия, выведя сущность в консоль.
При запуске приложения, выводится сообщение: «Что вы хотите посмотреть?», пользователь может ввести три команды
«посмотреть жирафа», «посмотреть комнату» и «посмотреть человека».
При выполнении любой из команд, в консоль выводится информация о просматриваемом объекте.
(Например, просмотреть комнату - сообщение «Эта комната такая прекрасная, она имеет такой размер (размер комнаты)
 и прочие свойства». И после этого, вызываются по порядку все действия, относящиеся к данной сущности.

Продвинутое задание: Выполнить простое задание, но сущностей теперь 7 - Комната, Дом, Человек, Парень,
 Девушка, Жираф, Животное.
Подумать о том, как каждая сущность может относится друг другу. Например Девушка может погладить жирафа
 и войти в дом. Попробовать реализовать подобные User Story

<b>Дедлайн до 6 апреля</b>
 */
public class main {
    public static void main(String[] args) throws IOException {
        Giraffe giraffe = new Giraffe("Malman", 200.2, 10.2, 44, "Zay");
        Man man = new Man("Don", 17.5, 75.2, 33, "Durneeva 37");
        Women women = new Women("Zay", 15.5, 50.2, 24, "Durneeva 33");
        Room room=new Room("akrabat street",606000,"Zay",66,2);
        System.out.println("Что вы хотите посмотреть?");
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String a = rd.readLine();
        if (a.equals("мужчину")) {
            System.out.println(man.toString());

        } else if (a.equals("женщину")) {
            System.out.println(women.toString());
        } else if (a.equals("жирафа")) {
            System.out.println(giraffe.toString());
        }
        else if (a.equals("комнату")){
            System.out.println(room.toString());
    }
}}
