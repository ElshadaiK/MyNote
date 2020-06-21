package android.development.mynotes;

import android.os.Bundle;

import androidx.lifecycle.ViewModel;

public class NoteActivityViewModel extends ViewModel {
    public static final String ORIGINAL_NOTE_COURSE_ID = "android.development.mynotes.ORIGINAL_NOTE_COURSE_ID";
    public static final String ORIGINAL_NOTE_COURSE_TITLE = "android.development.mynotes.ORIGINAL_NOTE_COURSE_TITLE";
    public static final String ORIGINAL_NOTE_COURSE_TEXT = "android.development.mynotes.ORIGINAL_NOTE_COURSE_TEXT";

    public String mOriginalCourseNoteId;
    public String mOriginalCourseNoteTitle;
    public String mOriginalCourseNoteText;
    public boolean mIsNewlyCreated = true;

    public void saveState(Bundle outState) {
        outState.putString(ORIGINAL_NOTE_COURSE_ID, mOriginalCourseNoteId);
        outState.putString(ORIGINAL_NOTE_COURSE_TITLE, mOriginalCourseNoteTitle);
        outState.putString(ORIGINAL_NOTE_COURSE_TEXT, mOriginalCourseNoteText);
    }
    public void restoreState(Bundle inState) {
        mOriginalCourseNoteId = inState.getString(ORIGINAL_NOTE_COURSE_ID);
        mOriginalCourseNoteTitle = inState.getString(ORIGINAL_NOTE_COURSE_TITLE);
        mOriginalCourseNoteText = inState.getString(ORIGINAL_NOTE_COURSE_TEXT);
    }
}
