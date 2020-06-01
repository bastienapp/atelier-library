package com.wildcodeschool;

public class Book {

    private String title;
    private String description;
    private Author author;

    public Book(String title, String description, Author author) {
        this.title = title;
        this.description = description;
        this.author = author;
    }

    public Book(String title, String description) {
        this.title = title;
        this.description = description;
        this.author = null;
    }

    public String allCaps() {

        String result = "";
        for (String word : this.title.split(" ")) {
            result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
        }

        return result.trim();
    }

    public String authorInfos() {

        if (this.author == null) {
            return "Unknown author";
        }
        return this.author.authorInfos();
    }

    public String bookInfos() {

        // titre allCaps + infos de l'auteur (si existe, sinon Uknown author)
        return this.allCaps() + " " + this.authorInfos();
    }

    /**
     * retourne les 30 premiers caractères de la description : si la description fait 30
     * caractères ou moins, la retourner entièrement, sinon trouver le mot le plus proche
     * avant les 30 caractères, ajouter une ellipse (trois points) et couper la phrase.
     * @return String description
     */
    public String shortDescription() {

        if (this.description.length() <= 30) {
            return description;
        }
        String substring = this.description.substring(0, 30);
        String[] words = substring.split(" ");
        String result = "";
        for (int i = 0; i < words.length - 1; i++) {
            result += words[i] + " ";
        }

        return result.trim() + "...";
    }

    public String getTitle() {

        return this.title;
    }

    public Author getAuthor() {

        return this.author;
    }
}
