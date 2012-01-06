package com.team4.advancedalgorithm.uicomponents;

import java.awt.BorderLayout;
import java.awt.Panel;

/**
 * @author <a href="mailto:ndkhoi168@gmail.com">Nguyen Duc Khoi</a>
 * @version $Revision$
 */
public class Documentation extends Panel {
	// Documentation on top of the screen

	DocOptions docopt = new DocOptions(this);

	DocText doctext = new DocText();

	public Documentation() {

		setLayout(new BorderLayout(10, 10));

		add("West", docopt);

		add("Center", doctext);

	}
}
