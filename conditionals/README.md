# Conditionals checking "type" code smell
In this example the code smell is a switch statements with three conditions and all actions are performed checking a type field.

If a new type is needed we need to modify the [Car] class . This violates the [open closed principle]  
The [Car] class also violates the [single responsibility principle] because it does at least 3 things

In the branch **[conditionals-refactored]** you can find the refactored version   
The refactoring applied is ***Replacing conditionals with polimorfism*** and it is done by:
  - Creating a subclass for each code type 
  - “Push member down” from [Car] to its subclasses
  - Removing the unused code in each subclass of [Car]

[conditionals-refactored]: <https://github.com/rmarioo/smells-to-refactoring/tree/conditional_refactored>
[Car]: <https://github.com/rmarioo/smells-to-refactoring/blob/master/conditionals/src/main/java/it/rmarioo/smells_to_refactoring/conditionals/Car.java>
[open closed principle]: <https://en.wikipedia.org/wiki/Open/closed_principle>
[single resposibility principle]: <https://en.wikipedia.org/wiki/Single_responsibility_principle>
