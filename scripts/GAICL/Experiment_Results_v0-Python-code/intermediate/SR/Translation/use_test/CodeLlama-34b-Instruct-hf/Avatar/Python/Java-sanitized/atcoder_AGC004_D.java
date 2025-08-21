public Vertex dfs(Graph graph, Vertex start) {
    Stack<Vertex> stack = new Stack<>();
    stack.push(start);

    while (!stack.isEmpty()) {
        Vertex vertex = stack.pop();
        for (Edge edge : graph.getEdges()) {
            if (edge.getFrom() == vertex) {
                Vertex nextVertex = edge.getTo();
                if (nextVertex.getHeightFromLeaf() > vertex.getHeightFromLeaf()) {
                    vertex.setHeightFromLeaf(nextVertex.getHeightFromLeaf());
                }
                if (nextVertex.getCutCount() > vertex.getCutCount()) {
                    vertex.setCutCount(nextVertex.getCutCount());
                }
                stack.push(nextVertex);
            }
        }
    }

    return start;
}