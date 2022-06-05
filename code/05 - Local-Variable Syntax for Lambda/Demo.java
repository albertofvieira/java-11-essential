// Support for using the local variable syntax (var keyword) in lambda
// parameters was added in Java 11.

// We can make use of this feature to apply modifiers to our local
// variables, like defining a type annotation:

List<String> sampleList = Arrays.asList("Java", "Kotlin");

String resultString = sampleList.stream()
    .map((@Nonnull var x) -> x.toUpperCase())
    .collect(Collectors.joining(", "));

assertThat(resultString).isEqualTo("JAVA, KOTLIN");

// Why would we want to use var for lambda parameters when we could
// simply skip the types?

// One benefit of uniformity is that modifiers can be applied to local
// variables and lambda formals without losing brevity. For example, a common modifier is a type annotation:

(@Nonnull var s1, @Nullable var s2) -> s1 + s2

// We cannot use such annotations without specifying the types.