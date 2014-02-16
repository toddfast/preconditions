Java Preconditions
==================

A simple but complete set of precondition checks for Java.

Example
--------

```java
import com.toddfast.util.preconditions.Preconditions;

public void someMethod(String value1, Object value2, ) {
    this.myValue1 = Preconditions.isValue(value);
    this.myValue2 = Preconditions.checkNotNull(value2);
}
```

For more examples, please see the [unit tests](https://github.com/toddfast/preconditions/blob/master/src/test/java/com/toddfast/util/preconditions/PreconditionsTest.java).
