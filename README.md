# JAVA FUNCTIONAL PROGRAMMING Pt1

##FUNCTIONAL PROGRAMMING
Imperative: You tell the computer HOW to do things with the code.
Declarative: You just use methods that tell the computer WHAT to do,
             instead of defining every single detail.

##JAVA UTIL FUNCTION PACKAGE
Functional interfaces provide target types for lambda expressions and method references.
Most used: -Functions, BiFunctions, Predicates, BiPredicates, Consumer, BiConsumer.

##FUNCTIONS
Function<T,R>: Represents a function that accepts one argument and produces a result.
-FUNCTION.apply()

##CHAINING FUNCTIONS
For this we use the .andThen() method, Example: incrementByOneFunction.andThen(multiplyByTenFunction);

##BIFUNCTION
The same as FUNCTION but instead of taking one input it takes two inputs and produces one output

##CONSUMER
Operation that accepts a single input argument and returns no result
-CONSUMER.accept()

##BICONSUMER
Operation that accepts two input arguments and returns no result

##PREDICATE
A predicate represents a predicate(boolean-valued function) of one argument.
chain predicates with PREDICATE.and(PREDICATE) - PREDICATE.or(PREDICATE)
-PREDICATE.test(ARGUMENT)

##SUPPLIER
Represents a supplier of results
-SUPPLIER.get()

##-STREAM--
Is a java API that implements functional programming methods

##--OPTIONAL--
It helps us to deal with null pointer exceptions, and handle null values without problems.
The benefit of this is that we can use functional programming and write clean code.

##--COMBINATOR PATTERN--
A combinator is a function that allows you to chain functions together passing functions as arguments, and returns a result. 
Can be used for validations

##--CALLBACKS--
Immitates the behaviour of a JavaScript callback

##--PROPERTIES OF FUNCTIONAL PROGRAMMING--
They should be self contained
- No state
- Pure Functions: Dont depend on global state
- No side Effects: No side effects outside the function
- Higher order functions: 
    * The function takes one or more functions as parameters.
    * The function returns another function as result.
