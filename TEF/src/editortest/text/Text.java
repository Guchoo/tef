package editortest.text;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextPresentationListener;

import editortest.text.visitors.AbstractTextEventBasedVisitor;
import editortest.text.visitors.IProposalListener;
import editortest.text.visitors.ITextEventListener;
import editortest.text.visitors.ITextVisitor;

/**
 * A Text is the representation of a String displayed in an eclipse editor. The
 * idea is to represented the hole content of a document with a set of texts.
 * The text is only shown in an editor when it is child (not necessarily a
 * direct child) of a {@link Document}. Text form a tree like structure ({@link CompoundText}).
 * Texts play the role of views in a model view controller pattern. Events, like
 * the user editing the text, are dispatched to the according text and can be
 * used through listeners ({@link TextEvent}, {@link TextEventListener}).
 * Changes in the contents of text can be observed too ({@link ITextChangeListener}).
 * Texts build a recursive tree structure ({@link CompoundText}) and can be
 * traversed using the visitor pattern ({@link ITextVisitor}).
 */
public abstract class Text {
	
	private int length = 0;	
	private CompoundText container = null;
	private StringBuffer content = new StringBuffer("");

	private final List<ITextEventListener> fEventListener = new Vector<ITextEventListener>();
	private final List<IProposalListener> fProposalListener = new Vector<IProposalListener>();
	private final List<ITextChangeListener> fChangeListener = new Vector<ITextChangeListener>();
	private final List<ITextStatusListener> fStatusListener = new Vector<ITextStatusListener>();
	private Map<Object, Object> fAttachedValues = null; 
	
	public Text() {
		this.container = null;
	}
	
	/**
	 * Returns the contents of this text.
	 */
	public final String getContent(int begin, int end) {
		if (container != null) {
			return container.getContent(this, begin, end);
		} else {				
			return content.substring(begin, end);
		}
	}
	
	/**
	 * Returns the contents of this text.
	 */
	public final String getContent() {
		return getContent(0, getLength());
	}
	
	/**
	 * Changes the content of this text.
	 */
	public void changeContent(int begin, int end, String text) {
		if (container != null) {
			length = length - (end - begin) + text.length();
			container.changeContent(this, begin, end, text);			
		} else {
			content.replace(begin, end, text);
		}
		for (ITextChangeListener changeListener: fChangeListener) {
			changeListener.textChanged(this);
		}
	}
	
	/**
	 * Returns the length of this text.
	 */
	public final int getLength() {
		if (container != null) {
			return length;
		} else {
			return content.length();
		}
	}
	
	/**
	 * Sets the container text of this text. The container is the parent node in a
	 * tree of texts. The text is only shown in an editor when it is child 
	 * (not necessarily a direct child) of a {@link Document}.
	 */
	protected final void setContainer(CompoundText container) {
		this.container = container;
		if (container == null && content == null) {
			content = new StringBuffer("");
			hidden();
		} else {
			changeContent(0,0, content.toString());
			if (container != null) {
				shown();
			}
		}
		if (this.container != null) {
			content = null;
		}
	}
	
	/**
	 * Like setContainer, but the actual content of this text is not put into the container. 
	 * The container is not changed, ergo this text is not shown.
	 */
	protected final void replaceContainer(CompoundText container) {		
		if (container == null) {
			content = new StringBuffer(getContent());
			hidden();
		} else {	
			if (content != null) {
				length = content.length();
				content = null;
			}
			shown();
		}
		this.container = container;
	}
	
	/**
	 * Returns the container of this text or null if it is a root node. The container is the parent node in a
	 * tree of texts.
	 */
	public final CompoundText getContainer() {
		return container;
	}
	
	/**
	 * Lets the visitor visit this text and all its children recursivly. The
	 * given offset is handed to the visitor. It should refer to the begining of
	 * this text as 0-reference.
	 */
	public void process(ITextVisitor visitor, int atOffset) {
		visitor.visitText(this, atOffset);
	}
	
	/**
	 * Returns the absolute offset based on an offset relative to the beginning
	 * of this text. This text has a specific position in the overall document.
	 * The given offset is understood as an offset to the beginning of this text
	 * as 0-reference. The returned offset is calculated relative to the
	 * 0-position of the overall document.
	 */
	public final int getAbsolutOffset(int offset) {
		if (container == null) {
			return offset;
		} else {
			return container.getAbsolutOffset(0) + container.getBeginOf(this) + offset;
		}
	}
	
	/**
	 * Add a {@link TextEventListener} to this text. Each text event that wasnt
	 * handled by one of the children of this text, will be given to the event
	 * handler. Events are dispatched by decendants of
	 * {@link AbstractTextEventBasedVisitor}.
	 */
	public void addEventHandler(ITextEventListener eventHandler) {
		this.fEventListener.add(eventHandler);
	}
	
	/**
	 * Returns all registered event handler.
	 */
	public List<ITextEventListener> getEventHandler() {
		return fEventListener;
	}
	
	public void addProposalHandler(IProposalListener proposalListener) {
		this.fProposalListener.add(proposalListener);
	}
	
	public List<IProposalListener> getProposalHandler() {
		return fProposalListener;
	}

	/**
	 * Adds a listener that is informed about changes in the content of this
	 * text. The content also changes when a children of this text chanegs its
	 * content.
	 */
	public void addTextChangeListener(ITextChangeListener textChangeListener) {
		this.fChangeListener.add(textChangeListener);
	}
	
	public void addTextStatusListener(ITextStatusListener statusListener) {
		this.fStatusListener.add(statusListener);
	}
	
	/**
	 * This method is called when this text is displayed, 
	 * usually when its container is set.
	 */
	protected void shown() {
		
	}
	
	/**
	 * This method is called when this text is hidden, usually when its container is unset or replaced. 
	 */
	protected void hidden() {
		for(ITextStatusListener listener: fStatusListener) {
			listener.hidden();
		}
	}

	public void putAttachment(Object key, Object value) {
		if (fAttachedValues == null) {
			fAttachedValues = new HashMap<Object,Object>();
		}
		fAttachedValues.put(key, value);
	}
	
	public Object getAttachement(Object key) {
		if (fAttachedValues != null) {
			return fAttachedValues.get(key);
		} else {
			return null;
		}
	}
}
