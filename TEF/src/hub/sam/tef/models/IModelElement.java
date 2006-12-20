/*
 * Textual Editing Framework (TEF)
 * Copyright (C) 2006 Markus Scheidgen
 * 
 * This program is free software; you can redistribute it and/or modify it under the terms 
 * of the GNU General Public License as published by the Free Software Foundation; either 
 * version 2 of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with this program; 
 * if not, write to the Free Software Foundation, Inc., 59 Temple Place, Suite 330, Boston, 
 * MA 02111-1307 USA
 */
package hub.sam.tef.models;

import hub.sam.tef.views.Text;

public interface IModelElement {

	public Object getValue(String property);
	
	//public void setValue(String property, Object value);		
	
	public void addChangeListener(ModelEventListener listener);
	
	public void removeChangeListener(ModelEventListener listener);
	
	//public void delete();
	
	public IMetaModelElement getMetaElement();
	
	public void registerOccurence(Text text);
	
	public Text[] getRegisteredOccureces();
}
