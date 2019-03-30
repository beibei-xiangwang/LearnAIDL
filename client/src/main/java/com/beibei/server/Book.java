package com.beibei.server;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * @author: anbeibei
 * <p>
 * date: 2019/3/30
 * <p>
 * desc:
 */
public class Book implements Parcelable {
    private String BookName;

    public Book() {
    }

    public Book(String bookName) {
        BookName = bookName;
    }

    public String getBookName() {
        return BookName;
    }

    public void setBookName(String bookName) {
        BookName = bookName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "BookName='" + BookName + '\'' +
                '}';
    }

    protected Book(Parcel in) {
        BookName = in.readString();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(BookName);
    }

    public void readFromParcel(Parcel dest) {
        BookName = dest.readString();
    }
}
