// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.jossemargt.cmsgalatea.model.dod;

import com.jossemargt.cmsgalatea.model.SubmissionFormatElement;
import com.jossemargt.cmsgalatea.model.dod.SubmissionFormatElementFactory;

privileged aspect SubmissionFormatElementFactory_Roo_JpaEntityFactory {
    
    /**
     * Creates a new {@link SubmissionFormatElement} with the given index.
     * 
     * @param index position of the SubmissionFormatElement
     * @return a new transient SubmissionFormatElement
     */
    public SubmissionFormatElement SubmissionFormatElementFactory.create(int index) {
        SubmissionFormatElement obj = new SubmissionFormatElement();
        return obj;
    }
    
}
