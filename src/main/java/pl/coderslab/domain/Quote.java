package pl.coderslab.domain;

public class Quote {

    String author;
    String content;

    public Quote(String author, String content) {
        this.author = author;
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

}
