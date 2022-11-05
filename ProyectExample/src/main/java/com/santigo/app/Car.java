package com.santigo.app;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
  void show() {
    System.out.println("This is a Car");
  }
  public static void main(String[] args) {
    //creating an object using new keyword
    Car obj = new Car();
    //invoking method using the object
    obj.show();
  }
}
