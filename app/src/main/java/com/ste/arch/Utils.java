package com.ste.arch;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

import com.ste.arch.entities.ContributorDataModel;
import com.ste.arch.entities.IssueDataModel;

import java.util.Comparator;

import static android.graphics.Paint.ANTI_ALIAS_FLAG;


public class Utils {

    public static class CustomComparator implements Comparator<Object> {

        @Override
        public int compare(Object o1, Object o2) {
            if ((o1 instanceof ContributorDataModel) && (o2 instanceof ContributorDataModel)) {
                return ((ContributorDataModel) o1).getLogin().compareTo(((ContributorDataModel) o2).getLogin());
            } else if ((o1 instanceof IssueDataModel) && (o2 instanceof IssueDataModel)) {
                return ((IssueDataModel) o1).getTitle().compareTo(((IssueDataModel) o2).getTitle());
            }
            return 0;
        }
    }


}
