package ru.mirea.practiceOneClasses;

public class Book {
    private String name;
    private int pages;
    private double pagesRead;
    private boolean Done = false;

    public Book(String n, int p, double r) {
        name = n;
        pages = p;
        pagesRead = r;
        if (pagesRead >= pages) {
            Done = true;
            pagesRead = pages;
        }
    }

    public Book(String n, int p) {
        name = n;
        pages = p;
        pagesRead = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPagesRead(double pagesRead) {
        this.pagesRead = pagesRead;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    public double getPagesRead() {
        return pagesRead;
    }

    public String toString(){
        return "This is the book called \""+this.name+"\", it has "+this.pages
                + " pages of which "+String.format("%.0f",this.pagesRead)+" were read in full";
    }

    public void finalCheck() {
        if (Done) System.out.println("You read the whole book, well done!");
        else {
            String percentage = String.format("%.2f", pagesRead/pages*100);
            System.out.println("You have read only "+percentage+" % of the book, so I will try not to spoil");
        }
    }
}
