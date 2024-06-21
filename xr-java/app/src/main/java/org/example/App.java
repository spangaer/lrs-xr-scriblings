package org.example;

import jnr.ffi.LibraryLoader;

public class App {

  public interface XrRs {
    int rusty_increment(int i);
  }

  public static void main(String[] args) {
    XrRs xrRs = LibraryLoader.create(XrRs.class).load("xr_rs");

    int i = 0;

    long start = System.currentTimeMillis();

    while (i < 1000000) {
      i = xrRs.rusty_increment(i);
    }
    long end = System.currentTimeMillis();

    System.out.println(i);
    System.out.println(end - start);
  }
}
