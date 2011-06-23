/*
 * Copyright (c) 2010 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package org.kemulator.kindlet;

import java.awt.Dimension;
import java.awt.Insets;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JViewport;

import com.amazon.kindle.kindlet.Kindlet;
import com.amazon.kindle.kindlet.KindletContext;
import com.amazon.kindle.kindlet.KindletContextImpl;


/**
 * KindletViewer. 
 *
 * @author <a href="mailto:vavivavi@yahoo.co.jp">Naohide Sano</a> (nsano)
 * @version 0.00 2010/03/05 nsano initial version <br>
 */
public class KindletViewer {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
        BufferedImage image = ImageIO.read(KindletViewer.class.getResource("/resources/kindle3-landscape.png"));
		//System.out.println("Image size: " + image.getWidth() + " x " + image.getHeight());

        ImageBorder border = new ImageBorder(image);
        border.setInsets(new Insets(102, 107, 106, 339));

        //Dimension size = new Dimension(600, 800);
		//image size: 1246 x 808
        Dimension size = new Dimension(image.getWidth(), image.getHeight());
        JScrollPane pane = new JScrollPane();
        pane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        pane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        pane.setPreferredSize(size);
        pane.setMaximumSize(size);
        pane.setMinimumSize(size);
		pane.setSize(size);
        pane.setViewportBorder(border);


		System.out.println("view port size: " + pane.getViewport().getViewSize());

        JFrame frame = new JFrame();
        frame.setTitle("Kindlet Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(pane);

		JViewport vp = pane.getViewport();
		vp.setSize(new Dimension(800, 600));
		System.out.println("viewport = " + vp);

        KindletContext context = new KindletContextImpl(vp);

        Kindlet kindlet = (Kindlet) Class.forName(args[0]).newInstance();
        kindlet.create(context);

        frame.pack();
		Insets b = frame.getInsets();
        //frame.setSize(new Dimension(image.getWidth() + b.left + b.right, image.getHeight() + b.top + b.bottom));
		frame.setResizable(false);
        frame.setVisible(true);

        kindlet.start();
    }
}

/* */
