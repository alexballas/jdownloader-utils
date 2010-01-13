/**
 * Copyright (c) 2009 - 2010 AppWork UG(haftungsbeschränkt) <e-mail@appwork.org>
 * 
 * This file is part of org.appwork.utils.swing.dialog
 * 
 * This software is licensed under the Artistic License 2.0,
 * see the LICENSE file or http://www.opensource.org/licenses/artistic-license-2.0.php
 * for details
 */
package org.appwork.utils.swing.dialog;

import java.awt.Image;

import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 * Use this Dialog for costum dialogs. ass your own panel with the panel
 * parameter
 * 
 * @author $Author: unknown$
 * 
 */
public class ContainerDialog extends AbstractDialog {

    /**
     * 
     */
    private static final long serialVersionUID = -8767494769584526940L;
    private JPanel panel;

    /**
     * 
     * @param flags
     * @param title
     * @param panel
     *            The JPanel which will be added to the dialog's contentpane
     * @param icon
     * @param ok
     * @param cancel
     */
    public ContainerDialog(int flags, String title, JPanel panel, Image icon, String ok, String cancel) {
        super(flags, title, null, ok, cancel);
        this.panel = panel;
        this.setIconImage(icon);
        init();
    }

    @Override
    public JComponent layoutDialogContent() {
        return panel;
    }

}
