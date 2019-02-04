package com.example.lbenitez.mynotesapp.Model;

import java.util.Objects;

public class Nota {

    private String title;
    private String content;
    private String color;
    private boolean favorite;

    public Nota() { }

    public Nota(String title, String content, String color, boolean favorite) {
        this.title = title;
        this.content = content;
        this.color = color;
        this.favorite = favorite;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFavorite() {
        return favorite;
    }

    public void setFavorite(boolean favourite) {
        this.favorite = favourite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nota nota = (Nota) o;
        return favorite == nota.favorite &&
                Objects.equals(title, nota.title) &&
                Objects.equals(content, nota.content) &&
                Objects.equals(color, nota.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, content, color, favorite);
    }

    @Override
    public String toString() {
        return "Nota{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", color='" + color + '\'' +
                ", favourite=" + favorite +
                '}';
    }
}
