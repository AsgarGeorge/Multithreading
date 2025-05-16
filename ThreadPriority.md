# Thread Priority in Java

## What is Thread Priority?

In Java, thread priority is an integer value that indicates the relative importance of a thread. It is used by the thread scheduler to decide which thread to run when multiple threads are ready to execute.

> **Note:** Thread priority is a hint to the scheduler, not a guarantee.
> Threads of same priority value are executed in FIFO manner.
---

## Priority Constants

Java provides 3 predefined constants in the `Thread` class:

- `Thread.MIN_PRIORITY` = 1
- `Thread.NORM_PRIORITY` = 5 *(default)*
- `Thread.MAX_PRIORITY` = 10

---

## Setting and Getting Priority

### Set Priority
```java
thread.setPriority(int priority);
```


### Get Priority
```java
int priority = thread.getPriority();
```