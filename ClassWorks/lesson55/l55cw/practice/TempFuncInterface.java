package practice;

import java.io.File;

// функциональный интерфейс обычно имеет данную анотацию: "@FunctionalInterface", но не обязательно
// и нтерфейс является функциональным тогда и только тогда, когда у него есть лишь ОДИН абстрактный метод!
// при этом функциональный интерфейс может содержать сколько угодно дефолтных и статических методов.
// Обычно функциональны интерфейс содержит лишь абстрактный метод и больше ничего.
@FunctionalInterface
public interface TempFuncInterface {
    // абстрактный метод, те метод, у которого нет реализации "по умолчанию" и
    // ее обязательно надо надо прописать самому при реализации. То есть, данным методом нельзя воспользоваться,
    // пока не придумаем его логику.
    abstract void temp(int x);

    // дефолтный метод, Метод для примера!Несмотря на то, что он в интерфейсе, у любого экземпляра
    // данного интерфейса уж будет возможность воспользоваться данным методом и не надо
    // отдельно писать его реализацию.
    default void sayHello() {
        System.out.println("default Hello");
    }

    // статический метод, Метод для примера! для того, чтобы воспользоваться данным методом нет необходимости
    // даже создавать экземпляр этого интерфейса
    // метод может быть либо абстрактным, либо дефолтным, либо статическим, но не все вместе и не может
    // сочетать в себе любые два этих типа, те может быть что-то одно.
    static void sayStaticHello() {
        System.out.println("static hello!");
    }

    static File createFile(String filePath) {
        // логика создания файла со всеми проверками ...
        // возвращаем файл, в который будем писать
        File file = new File(filePath);
        return file;
    }
}