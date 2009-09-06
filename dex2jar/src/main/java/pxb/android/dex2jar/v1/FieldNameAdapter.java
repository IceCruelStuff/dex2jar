/**
 * 
 */
package pxb.android.dex2jar.v1;

import static pxb.android.dex2jar.v1.ClassNameAdapter.x;

import org.objectweb.asm.AnnotationVisitor;
import org.objectweb.asm.FieldVisitor;

import pxb.android.dex2jar.asm.FieldAdapter;

/**
 * @author Panxiaobo [pxb1988@126.com]
 *
 */
public class FieldNameAdapter extends FieldAdapter {

	/**
	 * @param fv
	 */
	public FieldNameAdapter(FieldVisitor fv) {
		super(fv);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see pxb.android.FieldAdapter#visitAnnotation(java.lang.String,
	 * boolean)
	 */
	@Override
	public AnnotationVisitor visitAnnotation(String desc, boolean visible) {
		return super.visitAnnotation(x(desc), visible);
	}

}