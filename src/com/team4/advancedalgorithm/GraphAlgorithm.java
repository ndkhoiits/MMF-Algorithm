package com.team4.advancedalgorithm;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import com.team4.advancedalgorithm.uicomponents.Documentation;
import com.team4.advancedalgorithm.uicomponents.GraphCanvas;
import com.team4.advancedalgorithm.uicomponents.Options;

/**
 * @author <a href="mailto:ndkhoi168@gmail.com">Nguyen Duc Khoi</a>
 * @version $Revision$
 */
public class GraphAlgorithm extends JFrame {
	
	private GraphCanvas graphcanvas = new GraphCanvas(this);
	
	private Documentation documentation = new Documentation();
	
	Options options = new Options(this);
	
	public GraphAlgorithm() {
		super();
		init();
	}

	private void init() {
		setLayout(new BorderLayout(10, 10));
		add("Center", getGraphcanvas());

		add("North", getDocumentation());

		add("East", options);
	}

	public Documentation getDocumentation() {
		return documentation;
	}

	public void setDocumentation(Documentation documentation) {
		this.documentation = documentation;
	}

	public GraphCanvas getGraphcanvas() {
		return graphcanvas;
	}

	public void setGraphcanvas(GraphCanvas graphcanvas) {
		this.graphcanvas = graphcanvas;
	}

	public static void main(String[] args) {
		GraphAlgorithm frame = new GraphAlgorithm();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setVisible(true);
	}
}
