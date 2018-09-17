# Creator

> Problem: Who should be responsible for creating a new instance of some class?

> Solution: Assign class B the responsibility to create an instance of class A if one or more of the following is true:

* B contains (aggregates) A objects.
* B records instances of A objects.
* B closely uses A.
* B has the initializing data that will be passed to A when it is created (thus B is an Expert with respect to creating A).

