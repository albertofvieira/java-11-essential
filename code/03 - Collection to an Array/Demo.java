// The java.util.Collection interface contains a new default
// toArray method which takes an IntFunction argument.

// This makes it easier to create an array of the right type from a collection:

List sampleList = Arrays.asList("Java", "Kotlin");
String[] sampleArray = sampleList.toArray(String[]::new);
assertThat(sampleArray).containsExactly("Java", "Kotlin");