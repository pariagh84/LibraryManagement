package library;

import datastructures.queues.CustomQueue;

public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private boolean isAvailable;

    private final CustomQueue<Member> queue;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
        this.queue = new CustomQueue();
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public boolean isAvailable() { return isAvailable; }
    public void setAvailable(boolean available) { isAvailable = available; }

    public void addToWaitlist(Member member) {
        queue.add(member);
    }

    public Member getNextInWaitlist() {
        return queue.poll();
    }

    public boolean hasWaitlist() {
        return !queue.isEmpty();
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", available=" + isAvailable +
                '}';
    }
}