package task1;

import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        //cats.sort(?);
        //Printer.print(cats);
        cats.sort(Cat::byBreed);
        Printer.print(cats);

        cats.sort(Cat::byName);
        cats.sort(Cat::byAge);
        Printer.print(cats);

        Cat newCat = cats.get(0);
        cats.removeIf(newCat::isColor);
        Printer.print(cats);

        cats.removeIf(newCat::isNameLengthFive);
        Printer.print(cats);

    }


}

