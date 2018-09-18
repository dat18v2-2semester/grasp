# Low Coupling

![](/img/low_coupling_larman.png)


## Example where coupling occours:
* Attributes: X has an attribute that refferes to an instance og Y
* Methods: A parameter or a local variable of type Y is found in method of X
* X is a subclass of Y

Collaboration between object are couplings. Aim for as little couplings as possible. 
