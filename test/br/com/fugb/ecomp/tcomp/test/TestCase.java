package br.com.fugb.ecomp.tcomp.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.fugb.ecomp.tcomp.algorithm.BFSAlgorithm;
import br.com.fugb.ecomp.tcomp.models.Edge;
import br.com.fugb.ecomp.tcomp.models.Graph;
import br.com.fugb.ecomp.tcomp.models.Vertex;

public class TestCase {

	@Test
	public void algorithmTest() {
		List<Vertex> vertexs = new ArrayList<Vertex>();
        Vertex vertex1 = new Vertex("V1");
        Vertex vertex2 = new Vertex("V2");
        Vertex vertex3 = new Vertex("V3");
        Vertex vertex4 = new Vertex("V4");
        Vertex vertex5 = new Vertex("V5");
        Vertex vertex6 = new Vertex("V6");
       
        vertexs.add(vertex1);
        vertexs.add(vertex2);
        vertexs.add(vertex3);
        vertexs.add(vertex4);
        vertexs.add(vertex5);
        vertexs.add(vertex6);
       
        List<Edge> edges = new ArrayList<Edge>();
        Edge edge1 = new Edge("A1.2", vertex1, vertex2);
        Edge edge2 = new Edge("A1.5", vertex1, vertex5);
        Edge edge3 = new Edge("A2.1", vertex2, vertex1);
        Edge edge4 = new Edge("A2.5", vertex2, vertex5);
        Edge edge5 = new Edge("A3.2", vertex3, vertex2);
        Edge edge6 = new Edge("A3.4", vertex3, vertex4);
        Edge edge7 = new Edge("A4.3", vertex4, vertex3);
        Edge edge8 = new Edge("A4.5", vertex4, vertex5);
        Edge edge9 = new Edge("A4.6", vertex4, vertex6);
        Edge edge10 = new Edge("A5.4", vertex5, vertex4);
        Edge edge11 = new Edge("A5.2", vertex5, vertex2);
        Edge edge12 = new Edge("A5.1", vertex5, vertex1);
        Edge edge13 = new Edge("A6.4", vertex6, vertex4);
       
        edges.add(edge1);
        edges.add(edge2);
        edges.add(edge3);
        edges.add(edge4);
        edges.add(edge5);
        edges.add(edge6);
        edges.add(edge7);
        edges.add(edge8);
        edges.add(edge9);
        edges.add(edge10);
        edges.add(edge11);
        edges.add(edge12);
        edges.add(edge13);
        
        Graph graph = new Graph(vertexs, edges);
        List<Vertex> vertex = BFSAlgorithm.calculateFromVertex(graph, vertex6, vertex2);
        for (Vertex v : vertex) {
        	System.out.print(v + " -> ");
        }
	}
	
}
