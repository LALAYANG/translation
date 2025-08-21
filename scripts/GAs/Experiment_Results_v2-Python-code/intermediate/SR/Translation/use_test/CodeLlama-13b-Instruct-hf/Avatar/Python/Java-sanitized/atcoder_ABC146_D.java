public static void main(String[] args) {
    int numVertices = 10;
    Graph graph = new Graph(numVertices);
    graph.addEdge(0, 1);
    graph.addEdge(1, 2);
    graph.addEdge(2, 3);
    graph.addEdge(3, 4);
    graph.addEdge(4, 5);
    graph.addEdge(5, 6);
    graph.addEdge(6, 7);
    graph.addEdge(7, 8);
    graph.addEdge(8, 9);

    GraphColoring graphColoring = new GraphColoring(graph);
    int minimumColoring = graphColoring.getMinimumColoring();
    System.out.println(minimumColoring);
}