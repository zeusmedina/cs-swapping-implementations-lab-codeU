#cs-swapping-implementations-lab

## Objectives

1.  Compile and run Java code and tests.
2.  Replace one implementation with another.
3.  Try out two errors: overspecifying a type or trying to instantiate an interface.


## Warming up

Since this is the first lab, we'll keep it simple.  You will take the code from the previous README and "swap the implementation"; that is, you will replace the LinkedList with an ArrayList.  Because the code "programs to an interface", you will be able to swap the implementation by changing a single line (and adding an `import` statement).


## Instructions


1.  Set up your development environment.  For this Track you will need to be able to compile and run Java code.  We developed the examples using the using Java SE Development Kit 7. If you are using a more recent version, everything should still work.  If you are using an older version, you might find some incompatibilities.

    We recommend using an IDE like Eclipse that provides syntax-checking, auto-completion, and source code refactoring.  These features help you avoid errors, or find them quicky.  However, if you are preparing for a technical interview, remember that you will not have these tools during the interview, so you might also want to practice writing code without them.

[//]: # (TODO: More details here about compiling and running the examples.)

2.  When you check out the repository for this lab, you should find two files:

    *  `ListClientExample.java` contains the code from the previous README: it is a simple example of a class that uses a `List`.

    *  `ListClientExampleTest.java` contains a JUnit test for `ListClientExample`. 


3.  Review `ListClientExample` and make sure you understand what it does.  Then compile and run it.  The details of how to do that will depend on your development environment.

    NOTE: You might get a warning like `List is a raw type. References to generic type List<E> should be parameterized`.  To keep the example simple, we didn't bother to specify the type of the elements in the List.  If this warning bothers you, you can suppress it by replacing each List or LinkedList with `List<Integer>` or `LinkedList<Integer>`.


4.  Review `ListClientExampleTest`.  It runs one test, which creates a `ListClientExample` invokes `getList`, and then checks whether the result is an ArrayList.  Initially, this test will fail because the result is a LinkedList, not an ArrayList.  Run this test and confirm that it fails.

    NOTE: This test makes sense for this exercise, but it is not a good example of a test.  Good tests should check whether the class under test satisfies the requirements of the *interface*; they should not depend on the details of the *implementation*.


5.  In the `ListClientExample`, replace LinkedList with ArrayList.  You might have to add an import statement.  Compile and run `ListClientExample`.  Then run the test again.  With this change, the test should now pass.


6.  To make this test pass, you only had to replace `LinkedList` with `ArrayList` in the constructor.  You did not have to change any of the places where `List` appears.  What happens if you do?  Go ahead and replace one or more appearances of `List` with `ArrayList`.  The program should still work correctly, but now it is "overspecified".  If you change your mind in the future and want to swap the interface again, you would have to change more code.


7.  In the `ListClientExample` constructor, what happens if you replace `ArrayList` with `List`?  Why can't you instantiate a `List`?

