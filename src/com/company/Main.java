package com.company;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.text.Text;

public class Main extends Application{//Главный класс приложения JavaFX должен наследоваться от класса javafx.application.Application

    public static void main(String[] args) {

        launch(args);//Метод launch запускает приложение JavaFX
    }

    @Override
    public void start(Stage stage) {//реализация абстрактный метода public void start(Stage stage) {}
        //В этот метод в качестве параметра передается объекта Stage, который представляет пользовательский интерфейс. Например, на десктопах Stage будет представлять графическое окно.
        // В данном случае мы используем визуальный компонент javafx.scene.text.Text, который представляет простую текстовую надпись. При создании элемента Text мы можем передать ему выводимый текст, а также настроить его положение с помощью его методов
        Text text = new Text("Hello world!");
        text.setLayoutY(100);    // установка положения надписи по оси Y
        text.setLayoutX(107);   // установка положения надписи по оси X
        // Scene - это контейнер верхнего уровня для всех графических элементов. Однако напрямую в Scene объект Text мы поместить не можем.
        Group group = new Group(text);//Таким образом, вначале элемент Text помещается в элемент Group, который представляет контейнер для группы элементов.

        Scene scene = new Scene(group);//элемент Group устанавливается в качестве корневого элемента Scene
        stage.setScene(scene);//элемент Scene устанавливается для объекта Stage
        stage.setTitle("JavaFX"); // установка заголовка окна
        stage.setWidth(300); // установка ширины окна
        stage.setHeight(250); // установка длины окна
        stage.show(); // отображаем окно на экране устройства
    }
}