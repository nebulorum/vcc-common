/*
 * Copyright (C) 2008-2011 - Thomas Santana <tms@exnebula.org>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package org.exnebula.swing;

import javax.swing.*;

public interface PromptPanel {

  static interface EditCompletionListener {
    public void editComplete();
  }

  /**
   * Prompt has a valid answer
   * @return true if the prompt has been answered, false otherwise
   */
  boolean hasValidAnswer();

  /**
   * This method is called when the PromptPanel is linked to a JPromptPanelList. It will not be called afterwards,
   * so the PromptPanel must save if it wished to communicate the end of an edit.
   *
   * @param listener Object to notify when edit is done.
   */
  void setEditCompletionListener(EditCompletionListener listener);

  JComponent getViewComponent();

  JComponent getEditorComponent();

  void adjustFocusToEditor();

  String getPromptTile();
}