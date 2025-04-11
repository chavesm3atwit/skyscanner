ObjectMapper mapper = new ObjectMapper();
List<SearchResult> searchResults = new ArrayList<>();

searchResults.addAll(
    Arrays.asList(mapper.readValue(Resources.getResource("hotels.json"), SearchResult[].class))
);
searchResults.addAll(
    Arrays.asList(mapper.readValue(Resources.getResource("rental_cars.json"), SearchResult[].class))
);

environment.jersey().register(new SearchResource(searchResults));
