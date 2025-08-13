Task: Interface vs Abstract Class vs Regular Class
Rules
For each case:

First, explain in your own words why you choose interface, abstract class, or regular class.

Implement the chosen type with the minimum requirements below.

Make a small example of how to use it (client code).

Minimum requirements (if you choose…)
Interface:

At least 1 constant (public static final),

At least 1 abstract method,

At least 1 default method,

At least 1 static method.
(Tip: default → default behavior, static → utility or factory.)

Abstract class:

At least 1 field (state),

At least 1 constructor (set the field),

At least 1 abstract method,

At least 1 regular (non-abstract) method.

Regular class:

At least 2 fields,

At least 1 constructor,

At least 1 method that does something with the fields.

Cases
Case 1 – “Playable”
You need to describe the ability to play something (music, video, audiobook).
Different objects can be “playable” but are made in different ways.
Choose and explain: interface / abstract class / regular class.
Hint: Is this a capability without shared state?

Case 2 – “Shape with area”
You need common behavior: calculate the area.
Each shape can have different formulas and different fields (radius, width/height).
Choose and explain.
Hint: Is there shared state and a common algorithm?

Case 3 – “Clickable UI element”
Any UI element can be “clickable”: button, image, checkbox.
You need to be able to set a click listener and run it when clicked.
Choose and explain.
Hint: Is this only a capability without shared fields?

Case 4 – “Document with basic validation”
There are documents (PDF, TXT) that have a name and a size.
You always need a basic validation: name not empty, size ≥ 0.
After that, each type has its own validation (PDF must have at least 1 page, etc.).
Choose and explain.
Hint: Do we need a skeleton + shared state?

Case 5 – “Currency conversion (simple)”
You need to convert an amount from one currency to another using an exchange rate.
The set of currency codes and the format are common, but implementations may be different (fixed rate, test rate).
Choose and explain.
Hint: Common contract, constants, utility methods?

What to do step by step
For each case – write 2–4 sentences explaining your choice.

Implement the chosen type with the minimum requirements above.

Add one short usage example for each case.

In one case where you choose an interface:

Create a constant (e.g., MAX_LENGTH, DEFAULT_CURRENCY),

Create a default method (default behavior),

Create a static method (utility or factory).

In one case where you choose an abstract class:

Add a shared field (e.g., name),

Validate data in the constructor,

Add an abstract method (different in subclasses),

Add a regular method that uses the field.

Acceptance criteria
For each case, the choice is explained clearly.

If you choose interface → constant + default + static + abstract method are present.

If you choose abstract class → field + constructor + abstract method + regular method are present.

Small working usage examples for each case.

Good names for classes/methods, code compiles.