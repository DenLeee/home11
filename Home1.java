import java.util.Arrays;

public class Home1 {
    public static void main(String[] args) {
        StringBuilder myLife = new StringBuilder("Меня зовут Денис.");
        myLife.append(" Мне 32 года.")
                .append("\n")
                .append("Родился в Украине. Переехал в Россию 6 лет назад.")
                .append("\n")
                .append("С детства увлекаюсь спортом(футбол, баскетбол, волейбол, настольный теннис).")
                .append("\n")
                .append("Имею высшее образоварие по специальности \"Экономическая кибернетика\".")
                .append("\n")
                .append("После учебы работал 3 года в банке в отделе ИТ и уволился в связи переездом в Россию.")
                .append("\n")
                .append("Java начал изучать 2 года назад, были большие перерывы после которых приходилось учить всё сначала.")
                .append("\n")
                .append("Хочу устроиться на работу Java-разработчиком и перехать за границу");
        System.out.println(myLife.toString());
    }
}
