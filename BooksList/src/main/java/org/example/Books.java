package org.example;

public class Books {

    private String name;
    private int pageNumber;
    private String writer;
    private String releaseDate;

    public Books(String name, int pageNumber, String writer, String releaseDate) {
        this.name = name;
        this.pageNumber = pageNumber;
        this.writer = writer;
        this.releaseDate = releaseDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPageNumber() {
        return this.pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

}
