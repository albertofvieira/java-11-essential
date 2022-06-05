// Java 11 adds a few new methods to the String class: isBlank, lines,
// strip, stripLeading, stripTrailing, and repeat.

// Let's see how we can make use of the new methods to extract non-blank, stripped lines from a multi-line string:
String multilineString = "Baeldung helps \n \n developers \n explore Java.";

List<String> lines = multilineString.lines()
    .filter(line -> !line.isBlank())
    .map(String::strip)
    .collect(Collectors.toList());

assertThat(lines).containsExactly("Baeldung helps", "developers", "explore Java.");

// These methods can reduce the amount of boilerplate
// involved in manipulating string objects, and save us from having
// to import libraries.

// In the case of the strip methods, they provide similar functionality
// to the more familiar trim method; however, with finer control and
// Unicode support.