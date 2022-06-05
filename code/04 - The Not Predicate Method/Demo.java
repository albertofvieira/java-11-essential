// A static not method has been added to the Predicate interface.
// We can use it to negate an existing predicate, much like the negate method:

List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
List withoutBlanks = sampleList.stream()
    .filter(Predicate.not(String::isBlank))
    .collect(Collectors.toList());

assertThat(withoutBlanks).containsExactly("Java", "Kotlin");

// While not(isBlank) reads more naturally than isBlank.negate(),
// the big advantage is that we can also use not with method references,
// like not(String:isBlank).