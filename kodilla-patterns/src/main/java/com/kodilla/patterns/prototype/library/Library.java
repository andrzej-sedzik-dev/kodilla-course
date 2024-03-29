package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;

import java.util.HashSet;
import java.util.Set;

public final class Library extends Prototype<Library> {

   String name;
   Set<Book> books = new HashSet<>();

   public Library(final String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Set<Book> getBooks() {
      return books;
   }

   public Library shallowCopy() throws CloneNotSupportedException {
      return super.clone();
   }

   public Library deepCopy() throws CloneNotSupportedException {
      Library clonedLibrary = super.clone();

      clonedLibrary.books = new HashSet<>();
      for (Book book : books) {
         Book clonedBook = new Book(book.getTitle(),book.getAuthor(), book.getPublicationDate());

         clonedLibrary.getBooks().add(clonedBook);
      }
      return clonedLibrary;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      Library library = (Library) o;

      if (name != null ? !name.equals(library.name) : library.name != null) return false;
      return books != null ? books.equals(library.books) : library.books == null;
   }

   @Override
   public int hashCode() {
      int result = name != null ? name.hashCode() : 0;
      result = 31 * result + (books != null ? books.hashCode() : 0);
      return result;
   }

   @Override
   public String toString() {
      return "Library{" +
              "name='" + name + '\'' +
              ", books=" + books +
              '}';
   }
}
