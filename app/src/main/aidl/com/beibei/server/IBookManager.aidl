// IBookManager.aidl
package com.beibei.server;
import com.beibei.server.Book;

interface IBookManager {
      List<Book> getBookList();
      void addBookInOut(inout Book book);
      void addBookIn(in Book book);
      void addBookOut(out Book book);
}
