package br.com.fugb.ecomp.tcomp.algorithm;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import br.com.fugb.ecomp.tcomp.models.Edge;
import br.com.fugb.ecomp.tcomp.models.Graph;
import br.com.fugb.ecomp.tcomp.models.Vertex;

public abstract class BFSAlgorithm {

	private static Queue<Vertex> vertexQueue;
	private static List<Vertex> markedVetex;
	
	static {
		vertexQueue = new LinkedList<Vertex>();
		markedVetex = new ArrayList<Vertex>();
	}
	
	public static List<Vertex> calculateFromVertex(Graph graph, Vertex source, Vertex target) {
		vertexQueue.clear();
		markedVetex.clear();
		
		markedVetex.add(source);
		vertexQueue.add(source);
		
		boolean founded = false;
		while (!vertexQueue.isEmpty()) {
			Vertex currentVertex = vertexQueue.poll();
			
			for (Edge edge : graph.getEdges()) {
				Vertex initial = edge.getInitial();
				Vertex destination = edge.getDestination();
				if (initial.equals(currentVertex) && !markedVetex.contains(destination)) {
					markedVetex.add(destination);
					vertexQueue.add(destination);
					
					if (destination.equals(target)) {
						founded = true;
						break;
					}
				}
			}
			
			if (founded) {
				break;
			}
		}
		
		return markedVetex;
	}
	
}
