/*
 * (C) 1996-2010 Amazon.com, Inc. and its affiliates.
 */

package com.amazon.kindle.kindlet.ui;

import javax.swing.JButton;

/**
 * This class creates a labeled button, in the Kindle style. A button can
 * receive the focus and be pressed by the user - this button press results in
 * the button's ActionListeners being called. Buttons advertise a minimum,
 * preferred and maximum size. Buttons can stretch horizontally naturally, but
 * layouts which ignore the button's maximum height (e.g. BorderLayout or
 * GridLayout) may result in improper rendering of the button. Example Rendering
 * Serialization of this class is not supported in this version.
 * 
 * @see java.awt.Button, javax.swing.JButton, Serialized Form
 */
public class KButton extends com.amazon.kindle.kindlet.ui.KComponent {
    /**
     * Constructs a new button with no label.
     */
	private JButton button;

    public KButton() {
		System.err.println("KButton ctor ()");
		button = new JButton();
    }

    /**
     * Constructs a new button with the given label.
     * 
     * @param label - label to appear on the button, or null for no label
     */
    public KButton(java.lang.String label) {
		System.err.println("KButton ctor " + label);
		button = new JButton(label);
    }

    /**
     * Adds the specified action listener to receive action events from the
     * button. Action events occur when the user presses the five way select or
     * enter key while this button has the focus. If listener is null, no
     * exception is thrown and no action is performed.
     */
    public void addActionListener(java.awt.event.ActionListener listener) {
		System.err.println("KButton addActionListener()" + listener);
		button.addActionListener(listener);
        //return; // TODO codavaj!!
    }

    /**
     * Returns the command name of the action event initiated by this button. By
     * default this returns the button's label.
     */
    public java.lang.String getActionCommand() {
		System.err.println("KButton getActionCommand()");
		return button.getActionCommand();
        //return null; // TODO codavaj!!
    }

    /**
     * Returns an array of all the action listeners registered on this button.
     */
    public java.awt.event.ActionListener[] getActionListeners() {
		System.err.println("KButton getActionListeners()");
		return button.getActionListeners();
        //return null; // TODO codavaj!!
    }

    public java.awt.Color getBackground() {
		System.err.println("KButton getBackground()");
		return button.getBackground();
        //return null; // TODO codavaj!!
    }

    public java.awt.Font getFont() {
		System.err.println("KButton getFont(): " + button.getFont());
		return button.getFont();
        //return null; // TODO codavaj!!
    }

    public java.awt.Color getForeground() {
		System.err.println("KButton getForeground()");
		return button.getForeground();
        //return null; // TODO codavaj!!
    }

    /**
     * Gets the label for this button
     */
    public java.lang.String getLabel() {
		System.err.println("KButton getLabel()");
		return button.getLabel();
        //return null; // TODO codavaj!!
    }

    public java.awt.Dimension getMaximumSize() {
		System.err.println("KButton getMaximumSize()");
		return button.getMaximumSize();
        //return null; // TODO codavaj!!
    }

    public java.awt.Dimension getMinimumSize() {
		System.err.println("KButton getMinimumSize()");
		return button.getMinimumSize();
        //return null; // TODO codavaj!!
    }

    public java.awt.Dimension getPreferredSize() {
		java.awt.Dimension size = button.getPreferredSize();
		System.err.println("KButton getPreferredSize(): " + size);
		return size;
        //return null; // TODO codavaj!!
    }

    public boolean hasFocus() {
		System.err.println("KButton hasFocus(): " + button.hasFocus());
		return button.hasFocus();
        //return false; // TODO codavaj!!
    }

    public boolean isEnabled() {
		System.err.println("KButton isEnabled(): " + button.isEnabled());
		return button.isEnabled();
        //return false; // TODO codavaj!!
    }

    public void paint(java.awt.Graphics graphics) {
		System.err.println("KButton painting");
		button.paint(graphics);
        //return; // TODO codavaj!!
    }

    protected void processComponentEvent(java.awt.event.ComponentEvent componentEvent) {
		System.err.println("KButton processComponentEvent " + componentEvent);
		//button.processComponentEvent(componentEvent);
		componentEvent.setSource(button);
		button.dispatchEvent(componentEvent);
        return; // TODO codavaj!!
    }

    protected void processFocusEvent(java.awt.event.FocusEvent focusEvent) {
		System.err.println("KButton processFocusEvent " + focusEvent);
		focusEvent.setSource(button);
		button.dispatchEvent(focusEvent);
		//button.processFocusEvent(focusEvent);
        return; // TODO codavaj!!
    }

    protected void processKeyEvent(java.awt.event.KeyEvent keyEvent) {
		System.err.println("KButton processKeyEvent " + keyEvent);
		keyEvent.setSource(button);
		button.dispatchEvent(keyEvent);
		//button.processKeyEvent(keyEvent);
        return; // TODO codavaj!!
    }

    /**
     * Removes the specified action listener so that it no longer received
     * action events from this button. If listener is null, no exception is
     * thrown.
     */
    public void removeActionListener(java.awt.event.ActionListener listener) {
		System.err.println("KButton removeActionListener " + listener);
		button.removeActionListener(listener);
        //return; // TODO codavaj!!
    }

    /**
     * Sets name of the command for the that is sent when this button is
     * pressed.
     */
    public void setActionCommand(java.lang.String command) {
		System.err.println("KButton setActionCommand " + command);
		button.setActionCommand(command);
        //return; // TODO codavaj!!
    }

    public void setBackground(java.awt.Color color) {
		System.err.println("KButton setBackground " + color);
		button.setBackground(color);
        //return; // TODO codavaj!!
    }

    public void setBounds(int x, int y, int width, int height) {
		System.err.println("KButton setBounds (" + x + ", " + y + ", " + width + ", " + height + ")");
		button.setBounds(x, y, width, height);
		super.setBounds(x, y, width, height);
        //return; // TODO codavaj!!
    }

    public void setEnabled(boolean flag) {
		System.err.println("KButton setEnabled " + flag);
		button.setEnabled(flag);
        //return; // TODO codavaj!!
    }

    public void setFont(java.awt.Font font) {
		System.err.println("KButton setFont " + font);
		button.setFont(font);
        //return; // TODO codavaj!!
    }

    public void setForeground(java.awt.Color color) {
		System.err.println("KButton setForeground " + color);
		button.setForeground(color);
        //return; // TODO codavaj!!
    }

    /**
     * Sets the button's label to the specified string.
     */
    public void setLabel(java.lang.String label) {
		System.err.println("KButton setLabel " + label);
		button.setLabel(label);
        //return; // TODO codavaj!!
    }

}
