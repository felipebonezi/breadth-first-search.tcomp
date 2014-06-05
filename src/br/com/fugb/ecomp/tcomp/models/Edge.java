package br.com.fugb.ecomp.tcomp.models;

public class Edge {

	private static final String DEFAULT_IDENTIFIER = "DIJKSTRA";

	/**
	 * Identificador da aresta.
	 */
	private String identifier;
	
	/**
	 * Ponto inicial.
	 */
	private Vertex initial;
	
	/**
	 *	Ponto de destino - final.
	 */
	private Vertex destination;
	
	public Edge(Vertex initial, Vertex destination) {
		this(DEFAULT_IDENTIFIER, initial, destination);
	}
	
	public Edge(String identifier, Vertex initial, Vertex destination) {
		this.identifier = identifier;
		this.initial = initial;
		this.destination = destination;
	}

	public String getIdentifier() {
		return identifier;
	}

	public Vertex getInitial() {
		return initial;
	}

	public Vertex getDestination() {
		return destination;
	}

	@Override
	public String toString() {
		return "[" + this.identifier + "] " + this.initial + " to " + this.destination;
	}
	
}
