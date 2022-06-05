// Additionally, it's now easier to read and write Strings from files.
// We can use the new readString and writeString static methods from the Files class:

Path filePath = Files.writeString(Files.createTempFile(tempDir, "demo", ".txt"), "Sample text");
String fileContent = Files.readString(filePath);

assertThat(fileContent).isEqualTo("Sample text");