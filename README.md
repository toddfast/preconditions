Java Preconditions
==================

A simple but complete set of precondition checks for Java. Most commonly used at the beginning of methods, preconditions ensure that values are what you expect before you continue.

This library provides a no-bloat solution (I'm looking at you, Guava), comprising a single class with a robust set of static methods to check common preconditions. It has **no dependencies** other than Java 1.6+.

You may ask why not just implement those checks with regular, plain old `if` statements? You can, but it's more parsimonious and readable to have methods that clearly say what's going on, and standardization of implementation and the exceptions and error messages when validation fails are also useful, especially when working with other developers.

Getting started
---------------

This library is in Maven Central and can be used with the following dependency:

```xml
<dependency>
  <groupId>com.toddfast.preconditions</groupId>
  <artifactId>preconditions</artifactId>
  <version>1.0</version>
</dependency>
```
Or, you can [download the artifacts directly](http://search.maven.org/#search%7Cga%7C1%7Ccom.toddfast.preconditions).

Example
-------

```java
import com.toddfast.util.preconditions.Preconditions;

public void someMethod(int someValue, String someString, Object someObject) {

    // Most methods throw IllegalArgumentException on validation failure
    Preconditions.argumentNotNull(someObject,"someObject");
    
    if (Preconditions.isValue(someString)) { // Not null and length > 0
        // Or you can check and handle the situation manually
    }

    // For easy inlining, precondition methods return the values they check
    this.myValue = Preconditions.valueGreaterThan(someValue,0,"someValue");
}
```
For more examples, please see the [unit tests](https://github.com/toddfast/preconditions/blob/master/src/test/java/com/toddfast/util/preconditions/PreconditionsTest.java).

Precondition methods
--------------------

The library consists of a single utility class, `Preconditions`, with several type-specific and/or generic variations of the core methods below.

All methods other than `isNotNull()` and `isValue()` take the actual value, the desired value, and a parameter name, then throw `IllegalArgumentException` with a descriptive error message if the precondition fails. The `parameterName` parameter will be used to construct this error message. (To improve performance, just like with logging, avoid string construction for this value; it should just be the name of the variable in the source code to assist with debugging.)


```java
// Boolean checks (no exception thrown)
public boolean isNotNull(Object value)
public boolean isValue(String value)

// General preconditions
public T argumentNotNull(T argument, String parameterName)
public T argumentIsValue(T argument, String parameterName)

// String preconditions
public String lengthGreaterThan(String argument, int length, String parameterName)
public String lengthGreaterThanOrEqual(String argument, int length, String parameterName)
public String lengthLessThan(String argument, int length, String parameterName)
public String lengthLessThanOrEqual(String argument, int length, String parameterName)

// Collection preconditions
public Collection collectionNotEmpty(Collection argument, String parameterName)
public Collection collectionItemsNotNull(Collection argument, String parameterName)
public Collection collectionItemsAreValues(Collection argument, String parameterName)

// Number preconditions
public Number valueGreaterThan(Number argument, Number value, String parameterName)
public Number valueGreaterThanOrEqual(Number argument, Number value, String parameterName)
public Number valueLessThan(Number argument, Number value, String parameterName)
public Number valueLessThanOrEqual(Number argument, Number value, String parameterName)
```
