public class App {

  public static void main(String[] args) {
    UnweightedGraph graph = new UnweightedGraph();

    // Create some states
    int californiaId = 1;
    State california = new State(californiaId, "California");
    int nevadaId = 2;
    State nevada = new State(nevadaId, "Nevada");
    int oregonId = 3;
    State oregon  = new State(oregonId, "Oregon");
    int arizonaId = 4;
    State arizona = new State(arizonaId, "Arizona");
    int washingtonId = 5;
    State washington = new State(washingtonId, "Washington");
    int utahId = 6;
    State utah = new State(utahId, "Utah");
    int newYorkId = 7;
    State newYork = new State(newYorkId, "New York");
    int idahoId = 8;
    State idaho = new State(idahoId, "Idaho");
    int newMexicoId = 9;
    State newMexico = new State(newMexicoId, "New Mexico");
    int coloradoId = 10;
    State colorado = new State(coloradoId, "Colorado");
    int montanaId = 11;
    State montana = new State(montanaId, "Montana");
    int wyomingId = 12;
    State wyoming = new State(wyomingId, "Wyoming");

    // Add states to graph
    graph.addVertex(new Vertex(california));
    graph.addVertex(new Vertex(nevada));
    graph.addVertex(new Vertex(oregon));
    graph.addVertex(new Vertex(arizona));
    graph.addVertex(new Vertex(washington));
    graph.addVertex(new Vertex(utah));
    graph.addVertex(new Vertex(newYork));
    graph.addVertex(new Vertex(idaho));
    graph.addVertex(new Vertex(newMexico));
    graph.addVertex(new Vertex(colorado));
    graph.addVertex(new Vertex(montana));
    graph.addVertex(new Vertex(wyoming));

    // Add neighbors
    // California
    graph.addEdge(californiaId, nevadaId);
    graph.addEdge(californiaId, oregonId);
    graph.addEdge(californiaId, arizonaId);
    // Nevada
    graph.addEdge(nevadaId, californiaId);
    graph.addEdge(nevadaId, oregonId);
    graph.addEdge(nevadaId, arizonaId);
    graph.addEdge(nevadaId, utahId);
    graph.addEdge(nevadaId, idahoId);
    // Oregon
    graph.addEdge(oregonId, washingtonId);
    graph.addEdge(oregonId, nevadaId);
    graph.addEdge(oregonId, californiaId);
    graph.addEdge(oregonId, idahoId);
    // Arizona
    graph.addEdge(arizonaId, nevadaId);
    graph.addEdge(arizonaId, newMexicoId);
    graph.addEdge(arizonaId, utahId);
    graph.addEdge(arizonaId, californiaId);
    // Utah
    graph.addEdge(utahId, nevadaId);
    graph.addEdge(utahId, coloradoId);
    graph.addEdge(utahId, arizonaId);
    graph.addEdge(utahId, wyomingId);
    graph.addEdge(utahId, idahoId);
    // Washington
    graph.addEdge(washingtonId, oregonId);
    graph.addEdge(washingtonId, idahoId);
    // Idaho
    graph.addEdge(idahoId, washingtonId);
    graph.addEdge(idahoId, oregonId);
    graph.addEdge(idahoId, nevadaId);
    graph.addEdge(idahoId, utahId);
    graph.addEdge(idahoId, wyomingId);
    graph.addEdge(idahoId, montanaId);
    // New Mexico
    graph.addEdge(newMexicoId, arizonaId);
    graph.addEdge(newMexicoId, coloradoId);
    // Colorado
    graph.addEdge(coloradoId, newMexicoId);
    graph.addEdge(coloradoId, utahId);
    graph.addEdge(coloradoId, wyomingId);
    // Montana
    graph.addEdge(montanaId, idahoId);
    graph.addEdge(montanaId, wyomingId);
    // Wyoming
    graph.addEdge(wyomingId, montanaId);
    graph.addEdge(wyomingId, idahoId);
    graph.addEdge(wyomingId, utahId);
    graph.addEdge(wyomingId, coloradoId);

    System.out.println("--- SHORTEST FROM CALIFORNIA TO WASHINGTON ---");
    System.out.println(graph.shortestPath(californiaId, washingtonId));

    System.out.println("--- SHORTEST FROM CALIFORNIA TO UTAH ---");
    System.out.println(graph.shortestPath(californiaId, utahId));

    System.out.println("--- SHORTEST FROM CALIFORNIA TO NEW YORK ---");
    System.out.println(graph.shortestPath(californiaId, newYorkId));

    System.out.println("--- SHORTEST FROM WASHINGTON TO NEW MEXICO ---");
    System.out.println(graph.shortestPath(washingtonId, newMexicoId));

    System.out.println("--- SHORTEST FROM ARIZONA TO MONTANA ---");
    System.out.println(graph.shortestPath(arizonaId, montanaId));
  }

}

