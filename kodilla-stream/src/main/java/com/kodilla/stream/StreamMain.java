package com.kodilla.stream;


import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExecuteSaySomething;
import com.kodilla.stream.lambda.Processor;

public class StreamMain {

   public static void main(String[] args) {                                 // [5]
      Processor processor = new Processor();                                // [6]
      ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();  // [7]
      processor.execute(executeSaySomething);                               // [8]


      PoemBeautifier poemBeautifier = new PoemBeautifier();

   }
}
