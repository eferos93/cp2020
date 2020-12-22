# Ex 1
Create a class Box<T> with a single final field of type T called "content".
Its constructor must take the content as parameter and set it.

Add a public method called "content()" that returns the content of the box.

# Ex 2

Let's make a more advanced box.

- Create a new interface BoxFunction<I,O> with a method "apply" that
takes something of type I (for input) as parameter and has O (for output)
as return type.

- Modify the Box class by adding a new method called "apply" that:
* Takes as parameter a BoxFunction<I,O> that requires as input something of the same type of the content of the box.
* Has the output type of the BoxFunction parameter as return type.
* Its implementation applies the BoxFunction to the content of the box
and returns the result.

- Modify the Box class constructor such that it throws an IllegalArgumentException if the passed content is null.
# Ex 3
NOTE: When I write Class::methodName, I don't mean to use a method reference (lambda expression), I'm simply
	talking about a particular method.
- Create a Box that contains an ArrayList<String> with some elements of your preference.
- Now compute a sorted version of your list by invoking Box::apply, passing a lambda expression that uses List::sort

# Ex 4

- Create a list of type ArrayList<String> with some elements of your preference.
- Create a Box that contains the list.
- Now compute the sum of the lengths of all strings in the list inside of the box, by invoking Box::apply with a lambda expression.

# Ex 5

- Write a static method Box::applyToAll that, given
a list of Box(es) with the same type and a BoxFunction with compatible type,
applies the BoxFunction to all the boxes and returns a list
that contains the result of each BoxFunction invocation.




