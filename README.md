# Interfaces

## What we will cover

* What is an interface?
* When are they useful?

## Notes

Sometimes we need to create a common connection between classes but we don't want them to inherit from each other.

Inheritance creates a strong coupling between the consuming code and the class but sometimes we want our coupling to be as loose as we can make it so we can easily extend our code when new features are added.

This is when a interface makes a lot of sense for us, it will let us set a restriction for what our consuming code will need and anyone who decides to add a feature will simply need to implement that interface to be able to benefit from the code we have written.
