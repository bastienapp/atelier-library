package com.wildcodeschool;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Author bernard = new Author("Bernard", "Werber");
        bernard.fullName(); // méthode instanciée, accès aux attributs

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Date stephenBirthday = new Date();
        try {
            stephenBirthday = sdf.parse("24/09/1947");
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }

        Author stephen = new Author("Stephen", "King", stephenBirthday);
        Book ligneVerte = new Book("La ligne verte", "Description du livre", stephen);
        Book laBible = new Book("La Bible", "Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.");
        Book fourmis = new Book("Les fourmis", "Description du livre", bernard);

        List<Book> library = new ArrayList<>();
        library.add(ligneVerte);
        library.add(laBible);
        library.add(fourmis);
        printLibrary(library);

        Comparator<Book> compareTitle = new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getTitle().compareTo(book2.getTitle());
            }
        };
        library.sort(compareTitle);
        printLibrary(library);

        Comparator<Book> compareAuthor = new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.authorInfos().compareTo(book2.authorInfos());
            }
        };
        library.sort(compareAuthor);
        printLibrary(library);
    }

    private static void printLibrary(List<Book> library) {
        for (Book book : library) {
            System.out.println(book.bookInfos() + " : " + book.shortDescription());
        }
    }
}
