/*!
 * This program is free software; you can redistribute it and/or modify it under the
 * terms of the GNU Lesser General Public License, version 2.1 as published by the Free Software
 * Foundation.
 *
 * You should have received a copy of the GNU Lesser General Public License along with this
 * program; if not, you can obtain a copy at http://www.gnu.org/licenses/old-licenses/lgpl-2.1.html
 * or from the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * Copyright (c) 2002-2013 Pentaho Corporation..  All rights reserved.
 */

package org.pentaho.reporting.engine.classic.core.modules.misc.datafactory.sequence;

import java.beans.PropertyEditor;
import java.util.Locale;

public interface SequenceDescription {
  public int getParameterCount();

  public String getParameterName( int position );

  public String getParameterDisplayName( int position, Locale locale );

  public String getParameterDescription( int position, Locale locale );

  public Class getParameterType( int position );

  public String getParameterRole( int position, Locale locale );

  public Object getParameterDefault( int position );

  public String getSequenceGroup( final Locale locale );

  public PropertyEditor getEditor( final int position );

  public String getDisplayName( final Locale locale );

  public String getDescription( final Locale locale );

  public Sequence newInstance();
}