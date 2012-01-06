package com.team4.advancedalgorithm.uicomponents;

import java.awt.Event;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.team4.advancedalgorithm.GraphAlgorithm;

/**
 * @author <a href="mailto:ndkhoi168@gmail.com">Nguyen Duc Khoi</a>
 * @version $Revision$
 */
public class Options extends JPanel implements ActionListener {
	// set of options at the right of the screen

	JButton b1 = new JButton("clear");

	JButton b2 = new JButton("run");

	JButton b3 = new JButton("step");

	JButton b4 = new JButton("reset");

	JButton b5 = new JButton("example");

	JButton b6 = new JButton("exit");

	GraphAlgorithm parent;

	boolean Locked = false;

	public Options(GraphAlgorithm myparent) {

		parent = myparent;

		setLayout(new GridLayout(6, 1, 0, 10));

		b1.addActionListener(this);
		add(b1);

		b2.addActionListener(this);
		add(b2);

		b3.addActionListener(this);
		add(b3);

		b4.addActionListener(this);
		add(b4);

		b5.addActionListener(this);
		add(b5);

		b6.addActionListener(this);
		add(b6);

	}

	public boolean action(Event evt, Object arg) {

		if (evt.target instanceof JButton) {

			if (((String) arg).equals("step")) {

				if (!Locked) {

					b3.setLabel("next step");

					parent.getGraphcanvas().stepalg();

				}

				else
					parent.getDocumentation().doctext.showline("locked");

			}

			if (((String) arg).equals("next step"))

				parent.getGraphcanvas().nextstep();

			if (((String) arg).equals("reset")) {

				parent.getGraphcanvas().reset();

				b3.setLabel("step");

				parent.getDocumentation().doctext.showline("all items");

			}

			if (((String) arg).equals("clear")) {

				parent.getGraphcanvas().clear();

				b3.setLabel("step");

				parent.getDocumentation().doctext.showline("all items");

			}

			if (((String) arg).equals("run")) {

				if (!Locked)

					parent.getGraphcanvas().runalg();

				else
					parent.getDocumentation().doctext.showline("locked");

			}

			if (((String) arg).equals("example")) {

				if (!Locked)

					parent.getGraphcanvas().showexample();

				else
					parent.getDocumentation().doctext.showline("locked");

			}

			if (((String) arg).equals("exit")) {

				System.exit(0);

			}

		}

		return true;

	}

	public void lock() {

		Locked = true;

	}

	public void unlock() {

		Locked = false;

		b3.setLabel("step");

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {

			if (e.getSource().equals(b3)) {

				if (!Locked) {

					b3.setLabel("next step");

					parent.getGraphcanvas().stepalg();

				}

				else
					parent.getDocumentation().doctext.showline("locked");

			}

			if (((JButton) e.getSource()).getText().equals("next step"))

				parent.getGraphcanvas().nextstep();

			if (((JButton) e.getSource()).getText().equals("reset")) {

				parent.getGraphcanvas().reset();

				b3.setLabel("step");

				parent.getDocumentation().doctext.showline("all items");

			}

			if (((JButton) e.getSource()).getText().equals("clear")) {

				parent.getGraphcanvas().clear();

				b3.setLabel("step");

				parent.getDocumentation().doctext.showline("all items");

			}

			if (((JButton) e.getSource()).getText().equals("run")) {

				if (!Locked)

					parent.getGraphcanvas().runalg();

				else
					parent.getDocumentation().doctext.showline("locked");

			}

			if (((JButton) e.getSource()).getText().equals("example")) {

				if (!Locked)

					parent.getGraphcanvas().showexample();

				else
					parent.getDocumentation().doctext.showline("locked");

			}

			if (((JButton) e.getSource()).getText().equals("exit")) {

				System.exit(0);

			}

		}
	}
}
