package ru.ifmo.se;

import ru.ifmo.se.cities.*;
import ru.ifmo.se.people.*;
import ru.ifmo.se.places.LuxuryHotel;
import ru.ifmo.se.things.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Human skuperfilt = new Skuperfilt("Skuperfilt123", true, 45);
        Human crabs = new Crabs("Crabs", false, 33);
        Human korotyshka = new Korotyshka("Korotyshka");

        // Создание городов
        Town davilon = new Davilon();
        Town grabenberg = new Grabenburg();

        // Создание отеля и ресторана
        LuxuryHotel davilonHotel = new LuxuryHotel("Davilon Grand Hotel", PACKAGE.ALL_INCLUSIVE);

        // Заселение в отель
        skuperfilt.checkIn(davilonHotel);

        // Скуперфильд собирает свои вещи
        List<Thing> items = List.of(
                new Thing("Soap"), new Thing("Towel"), new Thing("Handkerchief"),
                new Thing("Nails"), new Thing("Piece of wire")
        );
        items.forEach(item -> davilonHotel.collectItems(skuperfilt).add(item));

        // Скуперфильд отправляется в ресторан
        davilonHotel.serveFood(4);

        // Выезд из отеля
        davilonHotel.checkOut(skuperfilt);

        // Скуперфильд узнает, что Крабс уехал в Грабенберг
        System.out.println("Crabs has left for " + grabenberg.getName());

    }
}