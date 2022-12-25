package org.example;

import com.mathsystem.api.graph.model.Edge;
import com.mathsystem.api.graph.model.Graph;
import com.mathsystem.domain.graph.repository.GraphType;
import com.mathsystem.domain.plugin.plugintype.GraphCharacteristic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class GraphTest implements GraphCharacteristic {
    @Override
    public Integer execute(Graph abstractGraph) {

        Map<UUID, Map<UUID, Integer>> adjacencyMatrix = new HashMap<>();
        createAdjacencyMatrix(abstractGraph, adjacencyMatrix);

        //get number of vertices with power 1
        int leaves = 0;
        for (Map.Entry<UUID, Map<UUID, Integer>> entry : adjacencyMatrix.entrySet()) {
            int power = 0;
            for (Map.Entry<UUID, Integer> entry1 : entry.getValue().entrySet()) {
                if (entry1.getValue() == 1) {
                    power++;
                }
            }
            if (power == 1) {
                leaves++;
            }
        }


        return leaves;
    }

    private void createAdjacencyMatrix(Graph graph, Map<UUID, Map<UUID, Integer>> adjacencyMatrix) {
        for (UUID vertex1 : graph.getVertices().keySet()) {
                                                                                                                                                                                            Map<UUID, Integer> vertexes = new HashMap<>();

            for (UUID vertex2 : graph.getVertices().keySet()) {
                vertexes.put(vertex2, 0);
            }

            adjacencyMatrix.put(vertex1, vertexes);
        }

        for (Edge edge : graph.getEdges()) {
            UUID vertex1 = edge.getFromV();
            UUID vertex2 = edge.getToV();

            adjacencyMatrix.get(vertex1).put(vertex2, 1);
            if (graph.getDirectType() == GraphType.UNDIRECTED) {
                adjacencyMatrix.get(vertex2).put(vertex1, 1);
            }
        }
    }

}