Java Preconditions
==================

A simple but complete set of precondition checks for Java. Most commonly used at the beginning of methods, preconditions are used to ensure that values are what you expect before you continue. This library provides a robust set of methods to check preconditions, and has *no dependencies* other than Java 1.6+.

You may ask why not just implement those checks the regular, old Java way. You can, but it's more readable to have methods that clearly say what's going on, and standardization of implementation and the exceptions and their error messages when validation fails are also useful, especially when working with other developers.

Example
--------

```java
import com.toddfast.util.preconditions.Preconditions;

public void someMethod(int someValue, String someString, Object someObject) {

    // Most methods throw IllegalArgumentExcpetion on validation failure
    Preconditions.argumentNotNull(someObject,"someObject");
    
    if (Preconditions.isValue(someString)) { // Not null and length > 0
        // Or you can check and handle the situation manually
    }

    // Note, all precondition methods return the values they check
    this.myValue = Preconditions.valueGreaterThan(someValue,0,"someValue");
}
```

Precondition methods
---------------

There are several type-specific variations of the following core methods:

```java
// Boolean checks
isNotNull(Object value)
isValue(String value)

// Argument validation (throw IllegalArgumentException)
argumentNotNull(T argument, String parameterName)
argumentIsValue(T argument, String parameterName)
lengthGreaterThan(String argument, int length, String parameterName)
lengthGreaterThanOrEqual(String argument, int length, String parameterName)
lengthLessThan(String argument, int length, String parameterName)
lengthLessThanOrEqual(String argument, int length, String parameterName)

// Collection validation 
collectionNotEmpty(Collection<?> argument, String parameterName)
collectionItemsNotNull(Collection<?> argument, String parameterName)
collectionItemsAreValues(Collection<?> argument, String parameterName)

// Number validation
valueGreaterThan(Number argument, Number value, String parameterName)
valueGreaterThanOrEqual(Number argument, Number value, String parameterName)
valueLessThan(Number argument, Number value, String parameterName)
valueLessThanOrEqual(Number argument, Number value, String parameterName)

```


For more examples, please see the [unit tests](https://github.com/toddfast/preconditions/blob/master/src/test/java/com/toddfast/util/preconditions/PreconditionsTest.java).
